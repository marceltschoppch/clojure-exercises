(defn fizzbuzz [i] (clojure.string/join 
  "\n"
  (map
    (partial reduce str)
    (map vector
      (take i (cycle ["fizz" "" ""]))
      (cycle ["buzz" "" "" "" ""])))))

(if 
  (= 0 (count *command-line-args*)) 
  (print "Number of iterations is missing.\n")
  (print (fizzbuzz (read-string (first *command-line-args*))) "\n"))
