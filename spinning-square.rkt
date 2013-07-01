;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname spinning-square) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; June 30, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/wiki/view?page=week4

(require 2htdp/image)
(require 2htdp/universe)

;; A square that spins and changes size with time

;; contants:

(define width 600)
(define height 400)
(define x-coordinate (/ width 2))
(define y-coordinate (/ height 2))
(define square-color "red")
(define speed-a 1)
(define speed-s 1)
(define BG (empty-scene width height))

;; changes:
;; square-angle ;a
;; square-side  ;s

(define-struct spinning-square (a s))
;; spinning-square is (make-spinning-square Number[0, 360] Number)
(define SS1 (make-spinning-square 0 10))
(define SS2 (make-spinning-square 90 100))
(define SS3 (make-spinning-square 360 370))

#;
(define (fn-for-spinning-square spinning-square)
  (... (spinning-square-a spinning-square)
       (spinning-square-s spinning-square)))
  
;; Template rules
;; - Compound data: 2 fields

;; spinning-square -> spinning-square

(define (main spinning-square)
  (big-bang spinning-square
            (on-tick spin&bigger)
            (to-draw render)
            (on-key reset)))

;; spinning-square -> spinning-square
;; changes the angle and size with time
#;
(check-expect (spin (make-spinning-square 1 1))
              (make-spinning-square (+ 1 speed-a)
                             (+ 1 speed-s)))

;; define spin&bigger
;; template from spinning-square

(define (spin&biger spinning-square)
  (make-spinning-square (+ (spinning-square-a spinning-square) speed-a)
                        (+ (spinning-square-s spinning-square) speed-s))

;; define render
;; template from spinning-square

(define (bigger spinning-square)
  (place-image (rotate (remainder (spinning-square-a spinning-square)  360) (rectangle (spinning-square-s spinning-square) 
                                                                                       (spinning-square-s spinning-square) 
                                                                                       "solid" 
                                                                                       square-color))
               x-coordinate
               y-coordinate
               BG))
  
;; define reset
;; if space-bar is pressed, reset spinning-square to (make-spinning-square 0 0)

(define (reset spinning-square ke)
  (make-spinning-square 0 10))

(main (make-spinning-square 0 20))