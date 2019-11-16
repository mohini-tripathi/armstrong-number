(ns armstrong-number.core
  (:gen-class))


; ; (defn armstrong []
; ;   (let [n (read-line)]
; ;     (println (count n))))


(defn exp [x n]
  (reduce * (repeat n x)))

(defn digits-breakdown [n]
  (defn breakdown [m pow digits]
    (cond
      (= m 0) digits
      :else (let [remainder (mod m (exp 10 pow))
                  digit (/ remainder (exp 10 (- pow 1)))]

              (breakdown (- m remainder) (+ pow 1) (conj digits digit)))))
  (breakdown n 1 []))

(defn narcissist? [n]
  (let [digits (digits-breakdown n)
        size (count digits)]
    (= n (reduce
          (fn summation [sum digit] (+ sum (exp digit size))) 0 digits))))

(defn -main
  [& args]
  (println (narcissist? 232)
           (narcissist? 153)))


