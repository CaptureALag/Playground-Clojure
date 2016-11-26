 (ns input-utils)

 (require '[clojure.string :as str])

 (defn read-ints []
   (vec (map read-string (str/split (read-line) #"\s+")))
 )

