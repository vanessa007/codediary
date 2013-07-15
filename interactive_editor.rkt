;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname interactive_editor) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
(require 2htdp/image)
(require 2htdp/universe)

;; July 10, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/human_grading/view/courses/970256/assessments/6/submissions

;; editor-project-starter.rkt
;;
;; In this project you will design a simple one line text editor.  
;;
;; The screen looks like:
;; 
;;     abc|def
;;
;; where | is the cursor.
;;
;; Typing a character inserts that character before the cursor.
;; The backspace key deletes the character before the cursor.
;; The left and right arrow keys move the cursor left and right.

;; =================================================================================
;; Constants:

(define WIDTH  200)
(define HEIGHT  20)

(define TEXT-SIZE  18)
(define TEXT-COLOR "BLACK")

(define CURSOR (rectangle 1 20 "solid" "red"))

(define MTS (empty-scene WIDTH HEIGHT))



;; =================================================================================
;; Data Definitions:

(define-struct editor (txt cp))
;; Editor is (make-editor String Natural)
;; interp. the current text (txt) and cursor position (cp) using a 0-based index

(define ED1 (make-editor ""       0)) ; empty
(define ED2 (make-editor "abcdef" 0)) ; cursor at beginning as in |abcdef
(define ED3 (make-editor "abcdef" 3)) ; cursor in middle of text as in abc|def
(define ED4 (make-editor "abcdef" 6)) ; cursor at end as in abcdef|

#;
(define (fn-for-editor e)
  (... (editor-txt e)
       (editor-cp e)))

;; =================================================================================
;; Functions:

;; Editor -> Editor
;; start the world with an initial state e, for example (main (make-editor "" 0))
(define (main e)
  (big-bang e
            (to-draw    render)                  ; Editor -> Image
            (on-key     handle-key)))            ; Editor KeyEvent -> Editor

;; Editor -> Image
;; place text with cursor at left, middle edge of MTS
(check-expect (render (make-editor "abcdef" 3))
              (overlay/align "left"
                             "middle"
                             (beside (text "abc" TEXT-SIZE TEXT-COLOR)
                                     CURSOR
                                     (text "def" TEXT-SIZE TEXT-COLOR))
                             MTS))

;; (define (render e) MTS) ;stub

(define (render e)
  (overlay/align "left"
                 "middle"
                 (beside (text (substring (editor-txt e) 0 (editor-cp e)) TEXT-SIZE TEXT-COLOR)
                         CURSOR
                         (text (substring (editor-txt e) (editor-cp e) (string-length (editor-txt e))) TEXT-SIZE TEXT-COLOR))
                 MTS))

;; Editor KeyEvent -> Editor
;; call appropriate function for each keyboard command
(check-expect (handle-key (make-editor "abcdef" 0) "left") (make-editor "abcdef" 0))  ;move the cursor left (unless already at left end of text).
(check-expect (handle-key (make-editor "abcdef" 3) "left") (make-editor "abcdef" 2))  ;move the cursor left (unless already at left end of text).
(check-expect (handle-key (make-editor "abcdef" 3) "right") (make-editor "abcdef" 4)) ;move the cursor right (unless already at right end of text).
(check-expect (handle-key (make-editor "abcdef" 6) "right") (make-editor "abcdef" 6)) ;move the cursor right (unless already at right end of text).
(check-expect (handle-key (make-editor "abcdef" 0) "\b") (make-editor "abcdef" 0))    ;delete the character before the cursor (if there is one).
(check-expect (handle-key (make-editor "abcdef" 3) "\b") (make-editor "abdef" 2))     ;delete the character before the cursor (if there is one).

;; (define (handle-key e key) e) ;stub

(define (handle-key e key)
  (cond [(key=? key "left")        
         (cond [(= 0 (editor-cp e)) e]
               [else (make-editor (editor-txt e) (- (editor-cp e) 1))])]
        [(key=? key "right")       
         (cond [(= (string-length (editor-txt e)) (editor-cp e)) e]
               [else (make-editor (editor-txt e) (+ (editor-cp e) 1))])]
        [(key=? key "\b")
         (cond [(= 0 (editor-cp e)) e]
               [else (make-editor 
                     (string-append 
                      (substring (editor-txt e) 0 (- (editor-cp e) 1)) 
                      (substring (editor-txt e) (editor-cp e) (string-length (editor-txt e))))
                     (- (editor-cp e) 1))])]  
        [(= (string-length key) 1) (make-editor
                                   (string-append
                                    (substring (editor-txt e) 0 (editor-cp e)) 
                                    key
                                    (substring (editor-txt e) (editor-cp e) (string-length (editor-txt e))))
                                   (+ (editor-cp e) 1))]))

(main (make-editor "abcdef" 0))
