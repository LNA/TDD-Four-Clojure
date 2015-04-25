(ns four-clojure.easy-spec
    (:require [speclj.core :refer :all]
                          [four-clojure.easy :refer :all]))

(describe "Last Element"
            (it "Gives the last element of a seq"
                    (should= '(5) (last-element [[1 2 3 4 5]])))
              (it "Gives the last elements of many given sequesces"
                        (let [test-seq [[1 2 3 4 5]'(5 4 3)]]
                                (should= '(5 3) (last-element test-seq)))))

(describe "Penultimate Element"
            (it "Gives the second to last element of a seq"
                    (should= '(4) (penultimate [[1 2 3 4 5]])))
              (it "Gives the second to last elements of many given sequesces"
                        (let [test-seq [[1 2 3 4 5]'(5 4 3)]]
                                (should= '(4 4) (penultimate test-seq)))))

(describe "Nth Element"
            (it "Gives the nth element of a seq"
                    (should= 3     (nth-element [1 2 3 4 5] 2))
                        (should= :a    (nth-element [:a :b :c] 0))
                            (should= [5 6] (nth-element '([1 2] [3 4] [5 6]) 2))))

(describe "Alt Nth Element"
            (it "Gives the nth element of a seq"
                    (should= 3     (alt-nth-element [1 2 3 4 5] 2))
                        (should= :a    (alt-nth-element [:a :b :c] 0))
                            (should= [5 6] (alt-nth-element '([1 2] [3 4] [5 6]) 2))))
