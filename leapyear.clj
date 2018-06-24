(defn is-divisible-by [x y] 
  (= (mod x y) 0))

(defn is-leapyear [year]
  (and 
    (is-divisible-by year 4) 
    (or 
      (not (is-divisible-by year 100)) 
      (is-divisible-by year 400))))

(if 
  (= 0 (count *command-line-args*)) 
  (print "Year is missing.\n")
  (print (is-leapyear (Integer/parseInt (first *command-line-args*))) "\n"))
