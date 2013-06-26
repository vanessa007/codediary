;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname delete_duplicate) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; No.1
;; List -> Natural
;; Calculate how many elements are in the given list

(define (calculate list)
  (cond
    [(empty? list) 0] 
    [else (+ (calculate (rest list)) 1)]))

;; No.2
;; Number, List -> List
;; Delete all the elements that equal the given number in the list

(define (deleteme n list)
  (cond
    [(empty? list) empty]
    [(= (first list) n) (deleteme n (rest list))]
    [else (cons (first list) (deleteme n (rest list)))]))

;; No.3
;; List -> List
;; Delete all the duplicate elements in a list

(define (delete_duplicate list)
  (cond
    [(empty? list) empty]
    [else (cons 
           (first list) 
           (delete_duplicate 
            (deleteme 
             (first list) 
             (rest list))))]))