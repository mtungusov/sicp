(ns sicp.core)

; Lection 01

(defn square [x]
  (* x x))

;(defn sum-of-squares [x y]
;  (+ (square x) (square y)))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))


(defn average [x y]
  (/ (+ x y) 2))

(defn good-enough? [guess x delta]
  (<
    (/
      (abs (-
             (square guess)
             x))
      x)
    delta))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x delta]
  (if (good-enough? guess x delta)
    guess
    (sqrt-iter (improve guess x) x delta)))

(defn sqrt [x]
  (sqrt-iter 1.0 x 0.0001))

;(sgrt 2)
