(ns four-clojure.medium)

(defn rotate [n input]
    (let [new-beg (drop n input)
                  new-end (take n input)]
        (reduce conj new-end (reverse new-beg))))
