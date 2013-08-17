;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname cheapest_tuition_and_school_name_list) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; July 5, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/wiki/view?page=Week5

;; =================
;; Data definitions:

(define-struct school (name tuition))
;; School is (make-school String Natural)
;; interp. name is the school's name, tuition is international-students tuition in USD

(define S1 (make-school "School1" 27797))
(define S2 (make-school "School2" 23300)) 
(define S3 (make-school "School3" 28500))

(define (fn-for-school s)
  (... (school-name s)
       (school-tuition s)))

;; Template rules used:
;;  - compound: (make-school String Natural)

;; ListOfSchool is one of:
;;  - empty
;;  - (cons School ListOfSchool)
;; interp. a list of schools

(define LOS1 empty)
(define LOS2 (cons S1 (cons S2 (cons S3 empty))))

(define (fn-for-los los)
  (cond [(empty? los) (...)]
        [else
         (... (fn-for-school (first los))
              (fn-for-los (rest los)))]))

;; Template rules used:
;;  - one of: 2 cases
;;  - atomic distinct: empty
;;  - compound: (cons School ListOfSchool)
;;  - reference: (first los) is School
;;  - self-reference: (rest los) is ListOfSchool

;; =================
;; Functions:

;; Design a function that consumes information about schools and produces the school with the lowest international student tuition.

;; ASSUME the list includes at least one school or else
;;        the notion of cheapest doesn't make sense

;; ListOfSchool -> School
;; Consumes information about schools and produces the school with the lowest international student tuition.

(check-expect (cheapest (cons S1 (cons S2 (cons S3 empty)))) S2)

(define (cheapest los)
  (cond
    [(empty? (rest los)) (first los)]
    [else
     (cond
       [(< (school-tuition (first los)) (school-tuition (cheapest (rest los)))) (first los)]
       [else (cheapest (rest los))])]))

;; Design a function that consumes a ListOfSchool and produces a list of the school names. Call it get-names.

;; ListOfName is one of:
;; - empty
;; - (cons String ListOfName)
;; interp. a list of school names

;; ListOfSchool -> ListOfName
;; consumes a ListOfSchool and produces a list of the school names

(define (get-names los)
  (cond [(empty? los) empty]
        [else
         (cons (school-name (first los)) (get-names (rest los)))]))

(get-names (cons S1 (cons S2 (cons S3 empty))))
  
