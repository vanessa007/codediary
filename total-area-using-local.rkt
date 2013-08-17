;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-reader.ss" "lang")((modname total_area_using_local) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; July 20, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/wiki/view?page=Week7

(require 2htdp/image)

;; =================
;; Data definitions:

(define-struct dir (name sub-dirs images))
;; Dir is (make-dir String ListOfDir ListOfImage)
;; interp. An directory in the organizer, with a name, a list
;;         of sub-dirs and a list of images.

;; ListOfDir is one of:
;;  - empty
;;  - (cons Dir ListOfDir)
;; interp. A list of directories, this represents the sub-directories of
;;         a directory.

;; ListOfImage is one of:
;;  - empty
;;  - (cons Image ListOfImage)
;; interp. a list of images, this represents the sub-images of a directory.
;; NOTE: Image is a primitive type, but ListOfImage is not.

(define I1 (square 10 "solid" "red")) ;image
(define I2 (square 12 "solid" "green"))
(define I3 (rectangle 13 14 "solid" "blue"))
(define D4 (make-dir "D4" empty (list I1 I2))) ;directory with name sub-dir loi
(define D5 (make-dir "D5" empty (list I3)))
(define D6 (make-dir "D6" (list D4 D5) empty))

;; Dir             -> Natural
;; ListOfDir       -> Natural
;; ListOfImage     -> Natural
;; produce total area of all images in dir
;(check-expect (total-area--lod empty) 0)
;(check-expect (total-area--loi (list I1 I2)) (+ (* 10 10) (* 12 12)))
;(check-expect (total-area--dir D6) (+ (* 10 10) (* 12 12) (* 13 14)))

;; -> Natural

(define (total-area dir)
  (local [(define (total-area--dir d)
            (+ (total-area--lod (dir-sub-dirs d))
               (total-area--loi (dir-images d))))
          (define (total-area--lod lod)
            (cond [(empty? lod) 0]
                  [else
                   (+ (total-area--dir (first lod))
                      (total-area--lod (rest lod)))]))
          (define (total-area--loi loi)
            (cond [(empty? loi) 0]
                  [else
                   (+ (image-area (first loi))          
                      (total-area--loi (rest loi)))]))]
    (total-area--dir dir)))

(define (image-area img)
  (* (image-width img)
     (image-height img)))

(total-area D4)
