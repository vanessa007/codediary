;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-reader.ss" "lang")((modname wide_only) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; July 21, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/wiki/view?page=Week7

(require 2htdp/image)

;; PROBLEM:

;; Use the built in version of filter to design a function called wide-only 
;; that consumes a list of images and produces a list containing only those 
;; images that are wider than they are tall.

;; Data Definition

(define I1 (rectangle 5 10 "solid" "blue"))
(define I2 (rectangle 15 10 "solid" "blue"))
(define I3 (rectangle 20 20 "solid" "blue"))
(define L1 (list I1))
(define L2 (list I2))
(define L3 (list I1 I2 I3))

;; ListOfImage -> ListOfImage 
;; consumes a list of images and produces a list containing only those images that are wider than they are tall

;(define (wide-only loi) empty) ;stub

(check-expect (wide-only L1) empty)
(check-expect (wide-only L2) L2)
(check-expect (wide-only L3) L2)

(define (wide-only loi)
  (local [(define (wider? image) (> (image-width image) (image-height image)))]
    (filter wider? loi)))