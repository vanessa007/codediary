;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname map) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; June 24, 2013

;; Function, List -> List
;; Apply the function to every element in the list

(define (mymap myfunction list)
  (cond
    [(empty? list) empty]
    [else (cons (myfunction (first list)) (mymap myfunction (rest list)))])

;; Example
  
(define (myfunction n)
  (+ 1 n))
  
(mymap myfunction (cons 1 (cons 2 empty)))
