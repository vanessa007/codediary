;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname choose_a_movie) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
;; June 27, 2013
;; Topic given by Coursera: https://class.coursera.org/programdesign-001/wiki/view?page=week4

;; Data definitions: Design a data definition to represent a movie, including title, budget, and year released.

(define-struct movie (title budget year))
;; Movie is (make-movie string number natual)
;; interp. the title, budget and release year of a movie

(define M1 (make-movie "Titanic" 200000000 1997))
(define M2 (make-movie "The Avengers" 220000000 2012))

#;
(define (fn-for-movie a)
  (... (movie-title) a)
  (... (movie-budget) a)
  (... (movie-release) a))
  
;; Template used:
;; - compound: 3 fields
 
;; Functions: You have a list of movies you want to watch, but you like to watch your rentals in chronological order. Design a function that consumes two movies and produces the title of the most recently released movie.

;; Movie, Movie -> Movie
;; Comparing two movies, and produce the movie with more recent release year
  
(check-expect (choose_a_movie (make-movie "The Avengers" 220000000 2012) (make-movie "Titanic" 200000000 1997)) (make-movie "The Avengers" 220000000 2012))
               
;; (define (choose_a_movie M1 M2) Movie) ;stub

(define (choose_a_movie M1 M2)
  (cond
    [(>= (movie-year M1) (movie-year M2)) M1]
    [else M2]))
  

