;;(ns fizzbuzz
;;  (:use clojure.test))

(defn fizzbuzz [x]
	(doseq [n (range 1 (inc x))]
		(cond (and (zero? (mod n 3))(zero? (mod n 5)))
				(prn "FizzBuzz")
			(zero? (mod n 3)) 
				(prn "Fizz")
			(zero? (mod n 5)) 
				(prn "Buzz")
		:default (prn n))))

;;can't actually test like this because doseq doesn't return any results (doesn't preserve the head of the list)
;;(deftest test-fizzbuzz
;;	(is (= [1 2 "Fizz" 4 "Buzz" "Fizz" 7 8 "Fizz" 10 11 "Fizz" 13 14 "FizzBuzz"]
;;		(fizzbuzz 15))))