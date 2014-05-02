;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-reader.ss" "lang")((modname queen-puzzle-solver) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ())))
(require racket/list)
        
;; Brute force queen puzzle solver
;;
;; In queen puzzle, the board is a 4x4 grid of SQUARES.
;; There are 4 ROWS and 4 COLUMNS.
;;
;; The idea of the game is to find a way to place four chess queens 
;; on a 4 by 4 chess board while making sure that none of the queens 
;; attack each other.

;; The BOARD consists of 16 individual SQUARES arranged in 4 rows of 4 columns. 
;; Each square can either be empty or can contain a queen.
;; A POSITION on the board refers to a specific square.
;; A queen ATTACKS every square in its row, its column, and both of its diagonals.
;; A board is VALID if none of the queens placed on it attack each other.
;; A valid board is SOLVED if it contains 4 queens.

;; =================
;; Data definitions:

;; Vals is Boolean.
;; interp.
;; Q means the position is occupied by a Queen, while E means the position has no Queen on it.

(define Q true)
(define E false)

;; Board is (listof Boolean) that is 16 elements long.
;; interp.
;;  Visually a board is a 4x4 array of squares, where each square
;;  has a row and column number (r, c). But we represent it as a
;;  single flat list, in which the rows are layed out one after
;;  another in a linear fashion.

;; Pos is Natural[0, 15]
;; interp.
;;  the position of a square on the board, for a given p, then
;;    - the row    is (quotient p 4)
;;    - the column is (remainder p 4)

;; P is structure
;; interp.
;; the row and column of a position

;; =================
;; Constants:

(define BD1                ;empty board
  (list E E E E
        E E E E
        E E E E 
        E E E E ))

(define BD2                ;board with one queen
  (list E E Q E
        E E E E
        E E E E
        E E E E))

(define BD3                ;solution of BD2
  (list E E Q E
        Q E E E
        E E E Q
        E Q E E))


(define BD4                ; no solution 
  (list Q E E E
        E E E E
        E E E E
        E E Q E))

;; Positions of all the rows and columns:

(define ROWS
  (list (list  0  1  2  3)
        (list  4  5  6  7)
        (list  8  9 10 11)
        (list 12 13 14 15)))

(define COLS
  (list (list  0  4  8 12)
        (list  1  5  9 13)
        (list  2  6 10 14)
        (list  3  7 11 15)))

;; =================
;; Functions:

;; Board -> Board or false
;; produce a solution for bd; or false if bd is unsolvable
;; Assume: bd is valid  
(check-expect (solve BD2) BD3)
(check-expect (solve BD4) false)
;(define (solve bd) false) ;stub

(define (solve bd)
  (local [(define (solve--bd bd)
            (if (solved? bd)
                bd
                (solve--lobd (next-boards bd))))
          (define (solve--lobd lobd)
            (cond [(empty? lobd) false]
                  [else 
                     (if (not (false? (solve--bd (first lobd))))
                         (solve--bd (first lobd))
                         (solve--lobd (rest lobd)))]))]
    (solve--bd bd))) 

;; Board -> Boolean
;; produce true if board is solved
;; Assume: board is valid, it's solved if it contains four Qs
(check-expect (solved? BD1) false) 
(check-expect (solved? BD2) false)
(check-expect (solved? BD3) true)
;(define (solved? bd) false) ; stub

(define (solved? bd)
  (= 4 (count true? bd)))

(define (true? x) (= x true)) 

;; Board -> (listof Board)
;; produce list of valid next boards from board
;; finds first empty square, fills it with Q, keeps only valid boards
(check-expect (list E E Q E
                   E E E E
                   E E E E
                   E E E E)
             (list (list E E Q Q
                         E E E E
                         E E E E
                         E E E E)
                   (list E E Q E
                         Q E E E
                         E E E E
                         E E E E)
                   (list E E Q E
                         E E E E
                         E E E E
                         E E E E)
                   (list E E Q E
                         E E E E
                         E Q E E
                         E E E E)
                   (list E E Q E
                         E E E E
                         E E E Q
                         E E E E)
                   (list E E Q E
                         E E E E
                         E E E E
                         E Q E E)
                   (list E E Q E
                         E E E E
                         E E E E
                         E E E Q)))
;(define (next-boards bd) empty) ;stub

;(define (next-boards bd)
;  (keep-only-valid (fill-with-Q (find-blank bd) bd)))

;; Board -> Pos
;; produces the position of the first blank square
;; ASSUME: the board has at least one blank square
(check-expect (find-blank BD1) 0)
(check-expect (find-blank BD2) 2)
(check-expect (find-blank BD4) 1)
;(define (find-blank bd) 0) ;stub

(define (find-blank bd)
  (cond [(empty? bd) (error "The board didn't have a blank space.")]
        [else
         (if (false? (first bd))
             0
             (+ 1 (find-blank (rest bd))))]))

;; Pos Board -> (listof Board)
;; produce a board, with blank filled with Q, ie. true
(check-expect (fill-with-Q 0 BD1)
              (list Q E E E
                    E E E E
                    E E E E
                    E E E E))
;(define (fill-with-Q p bd) empty) ;stub

(define (fill-with-Q p bd)
  (cond
    [(= 0 p) (cons Q (rest bd))]
    [else (append (first list) (fill-with-Q (- p 1) (rest list)))]))

;; (listof Board) -> (listof Board)
;; produce list containing only valid boards
(check-expect (keep-only-valid (list Q Q E E
                                     E E E E
                                     E E E E
                                     E E E E)) empty)
;(define (keep-only-valid lobd) empty) ;stub

(define (keep-only-valid lobd)
 (filter (valid-board? lobd)))

(define-struct p (r c))
;; P is (make-position Number Number)
(define (attack? p1 p2)
  (or (= (p-r p1) (p-r p2))
      (= (p-c p1) (p-c p2))
      (= 1 (/ (- (p-r p1) (p-r p2))
              (- (p-c p1) (p-c p2))))
      (= (- 1) (/ (- (p-r p1) (p-r p2))
               (- (p-c p1) (p-c p2))))))

;; Board -> Boolean
;; produce true if no queen attachs another queen; false otherwise
(check-expect (valid-board? BD1) true)
(check-expect (valid-board? BD2) true)
(check-expect (valid-board? BD3) true)
(check-expect (valid-board? BD4) false)
;(define (valid-board? BD1) true) ;stub

(define (valid-board? bd)
  

;; Board Pos -> Boolean
;; Produce value at given position on board.
(define (read-board pos bd)
  (cond
    [(= 0 n) (first bd)]
    [else (read-board (- n 1) (rest list))]))
    
;; Number Number -> Number
;; Convert 0-based row and column to Pos
(define (r-c->pos r c) (+ (* r 4) c)) 