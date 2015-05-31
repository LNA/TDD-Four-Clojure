(ns four-clojure.easy)

(defn last-element [input]
    (map (fn [y] (last y)) input))

(defn penultimate [input]
    (map (fn [y] (second (reverse y))) input))

(defn nth-element [input number]
    (nth input number))

(defn alt-nth-element [input number]
   (first (drop number input)))

(defn count-seq [input]
  (count input))

(defn sum-it-up [input]
  (reduce + input))
