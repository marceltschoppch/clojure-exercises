(defn factorial [n]
  (reduce * (range 1N (inc n))))

(if 
  (= 0 (count *command-line-args*)) 
  (print "Number is missing.\n")
  (print (factorial (Integer/parseInt (first *command-line-args*))) "\n"))
