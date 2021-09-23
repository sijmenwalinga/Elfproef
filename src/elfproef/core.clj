(ns elfproef.core
  (:gen-class))

(defn parser "helper function for splitting strings in numbers, takes a string" [str]
  ;; maps numbers to get a vector of numbers instead of a string
  (map #(Integer/parseInt %) (clojure.string/split str #""))
)

(defn elfproef "checks if a number is valid based on the elfproef test, takes an input string and a vector with the weight of each input number" [input weight] 
  (let [sum (reduce + (parser input))] 
    ;; if the sum is 0 it means the input is invalid i.e. only zeros or negative input numbers (invalid)
    (if-not (= sum 0)
      (> (mod 11 (reduce + (map * (parser input) weight))) 0)
      false
    )
  )
)
