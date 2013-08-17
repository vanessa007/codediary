;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-reader.ss" "lang")((modname draw_sierpinski_carpet) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; July 26, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/wiki/view?page=Week8

(require 2htdp/image)

;; Number -> Image
;; Draw a sierpinski carpet with a given side length

(define CUTOFF 2)

(check-expect (s-ca CUTOFF) (square CUTOFF "outline" "red"))
(check-expect (s-ca (* 3 CUTOFF)) 
              (overlay (square (* 3 CUTOFF) "outline" "red")
                       (shape CUTOFF)))

(define (shape s)
  (above (beside (s-ca s) 
                 (s-ca s) 
                 (s-ca s))
         (above (beside (s-ca s) 
                        (square s "solid" "white") 
                        (s-ca s))
                (beside (s-ca s) 
                        (s-ca s) 
                        (s-ca s)))))

(define (s-ca s)
  (if (<= s CUTOFF)
      (square s "outline" "red")
      (overlay (square s "outline" "red")
               (shape (/ s 3)))))

(s-ca 100)


