(ns task1.core
  (:gen-class))

; declare arithmetic operation functions
(declare add)
(declare sub)
(declare multiply)
(declare divide)

; declare global variables
(def a 10)
(def b 20)

; declare dynamic variables
(def ^:dynamic var1 50)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "a + b -> " (add a b))
  (println "b - a -> " (sub b a))
  (println "a * b -> " (multiply a b))
  (println "b / a -> " (divide b a))
  
  (println "var1 + b -> " (add var1 b))
; add global variables and bind the sum to dynamic variable var1 
  (binding[var1 (add a b)]
    (println "a + b & bind var1 -> " var1)
  )
  (println "outside binding -> " var1)
  

; sub global variables and bind the result to dynamic variable var1 
  (binding[var1 (sub b a)]
    (println "b - a & bind var1 -> " var1)
  )
  (println "outside binding -> " var1)

; multiply global variables and bind the result to dynamic variable var1 
  (binding[var1 (multiply b a)]
    (println "a * b & bind var1 -> " var1)
  )
  (println "outside binding -> " var1)

; divide global variables and bind the result to dynamic variable var1 
  (binding[var1 (divide b a)]
    (println "b / a & bind var1 -> " var1)
  )
  (println "outside binding -> " var1)
  )

;Fn to add global variables
(defn add [p q]
(+ p q))

;Fn to sub global variables
(defn sub [p q]
(- p q))

;Fn to multiply global variables
(defn multiply [p q]
(* p q))

;Fn to divide global variables
(defn divide [p q]
(/ p q))





