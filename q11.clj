;; Solution to question 11 from https://github.com/zhiwehu/Python-programming-exercises

(defn q11 [s]
  (clojure.string/join
    ","
    (map 
      (fn to-bits [n] 
        (clojure.string/replace 
          (format "%4s" (Integer/toString n 2)) 
          #" " 
          "0")) 
      (filter 
        (fn [n] (= (mod n 5) 0)) 
        (map 
          (fn [bits] (Integer/parseInt bits 2)) 
          (clojure.string/split s #","))))))

(print (q11 (first *command-line-args*)))
