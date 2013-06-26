;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname nth-element) (read-case-sensitive #t) (teachpacks ((lib "convert.rkt" "teachpack" "htdp") (lib "guess-gui.rkt" "teachpack" "htdp") (lib "guess.rkt" "teachpack" "htdp") (lib "master.rkt" "teachpack" "htdp") (lib "draw.rkt" "teachpack" "htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "convert.rkt" "teachpack" "htdp") (lib "guess-gui.rkt" "teachpack" "htdp") (lib "guess.rkt" "teachpack" "htdp") (lib "master.rkt" "teachpack" "htdp") (lib "draw.rkt" "teachpack" "htdp")))))
;; Natural and List a -> a

;(Nth-element 1 (cons 'a (cons 'b empty))) a ;first list
;(Nth-element 2 (cons 'a (cons 'b empty))) b ;first (rest list)

(define (Nth-element n list)
  (cond
    [(= 1 n) (first list)]
    [(> n 1) (Nth-element (- n 1) (rest list))]))

;; (List Natural , List a) -> List a

(define (List-elements index list)
  (cond
    [(empty? index) empty] ; List a
    [else (cons (Nth-element (first index) list) (List-elements (rest index) list))])) ; List a