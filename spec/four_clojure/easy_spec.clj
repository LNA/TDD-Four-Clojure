(ns four-clojure.easy-spec
  (:require [speclj.core :refer :all]
            [four-clojure.easy :refer :all]))

(describe "19.Last Element"
          (it "Gives the last element of a seq"
              (should= '(5) (last-element [[1 2 3 4 5]])))
          (it "Gives the last elements of many given sequesces"
              (let [test-seq [[1 2 3 4 5]'(5 4 3)]]
                (should= '(5 3) (last-element test-seq)))))

(describe "20.Penultimate Element"
          (it "Gives the second to last element of a seq"
              (should= '(4) (penultimate [[1 2 3 4 5]])))
          (it "Gives the second to last elements of many given sequesces"
              (let [test-seq [[1 2 3 4 5]'(5 4 3)]]
                (should= '(4 4) (penultimate test-seq)))))

(describe "21.Nth Element"
          (it "Gives the nth element of a seq"
              (should= 3     (nth-element [1 2 3 4 5] 2))
              (should= :a    (nth-element [:a :b :c] 0))
              (should= [5 6] (nth-element '([1 2] [3 4] [5 6]) 2))))

(describe "Alt Nth Element"
          (it "Gives the nth element of a seq"
              (should= 3     (alt-nth-element [1 2 3 4 5] 2))
              (should= :a    (alt-nth-element [:a :b :c] 0))
              (should= [5 6] (alt-nth-element '([1 2] [3 4] [5 6]) 2))))

(describe "22.Count A Seq"
          (it "Gives the total number of elements in a seq"
              (should= 5 (count-seq [1 2 3 3 1]))
              (should= 11 (count-seq "Hello World"))
              (should= 3 (count-seq [ [1 2] [3 4] [5 6] ]))))

(describe "24.Sum It All Up"
          (it "Gives the sum of a seq of numbers"
              (should= 6 (sum-it-up [1 2 3]))))
