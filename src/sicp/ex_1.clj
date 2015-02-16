(ns sicp.ex-1)

; ex-1.1
; ======
10
(+ 5 3 4)
; 12
(- 9 1)
; 8
(/ 6 2)
; 3
(+ (* 2 4) (- 4 6))
; 6
(def a 3)
(def b (+ a 1))
; 4
(+ a b (* a b))
; 19
(= a b)
; false
(if (and (> b a) (< b (* a b)))
  b
  a)
;4
(cond (= a 4) 6
      (= b 4) (+ 6 7 a)
      :else 25)
; 16
(+ 2 (if (> b a) b a))
; 6
(* (cond (> a b) a
         (< a b) b
         :else -1)
   (+ a 1))
; 16

; ex-1.2
; ======

(/
  (+ 5 4 (- 2 (- 3 (+ 6 4/5))))
  (* 3 (- 6 2) (- 2 7)))
; -37/150

; ex-1.3
; ======

(defn max-two-from-three [x y z]
  (cond
    (and (> x y) (>= y z)) [x y]
    (and (> x y) (> z y)) [x z]
    (and (< x y) (> x z)) [x y]
    :else [y z]))

(defn square [x]
  (* x x))

(defn sum-of-squares [x y z]
  (let [v (max-two-from-three x y z)]
    (apply + (map square v))))

