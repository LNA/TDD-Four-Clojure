(ns four-clojure.medium-spec
  (:require [speclj.core :refer :all]
            [four-clojure.medium :refer :all]))

(describe "44. Rotate Sequence"
          (it "Gives the seq starting at the given number"
              (should= [3 4 5 1 2] (rotate 2 [1 2 3 4 5]))))

(describe "45. ")
