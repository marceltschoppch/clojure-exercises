(defn days-alive [date]
  (def millis-per-day (* 24 60 60 1000))
  (quot
    (- (.getTime (java.util.Date.)) (.getTime date))
    millis-per-day))

(if 
  (= 0 (count *command-line-args*)) 
  (print "Birthday is missing.\n")
  (print 
    (days-alive 
      (.parse
        (java.text.SimpleDateFormat. "dd.MM.yyyy")
          (first *command-line-args*))) "\n"))
