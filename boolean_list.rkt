;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname boolean-list) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; July 2, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/wiki/view?page=Week5

;; =================
;; Data definitions:

;; ListOfBoolean is one of:
;; - empty
;; - (cons Boolean ListOfBoolean)
;; interp. a list of booleans

(define LB0 empty)
(define LB1 (cons true empty))
(define LB2 (cons true (cons false empty)))

#;
(define (fn-for-lob lob)
  (cond
    [empty? lob (...)]
    [else 
     (... (first lob)
          (fn-for-lob (rest lob)))]))
;; Template rules:
;; - one of: 2 cases
;; - atomic distinct: empty
;; - boolean
;; - self-reference: (rest lob) is a ListOfBoolean

;; =================
;; Functions:

;; ListOfBoolean -> Boolean
;; produce ture if every value in the list is ture or the list empty, otherwise produce false

(check-expect (all-true? empty) true)
(check-expect (all-true? (cons true empty)) true)
(check-expect (all-true? (cons false (cons true empty))) false)

(define (all-true? lob)
  (cond
    [(empty? lob) true]
    [else (and (first lob) (all-true? (rest lob)))]))