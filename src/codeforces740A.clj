(ns codeforces740A)

(require '[input-utils :as input])

(let [
      [n a b c] (input/read-ints)
      answer (
               case (rem n 4)
               0 0
               1 (min (* 3 a) c)
               2 (min (* 2 a) b)
               3 a
               )]
  (println answer)
  )
