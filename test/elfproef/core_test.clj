(ns elfproef.core-test
  (:require [clojure.test :refer :all]
            [elfproef.core :refer :all]))

(deftest valid-input
  (testing "a valid elfproef testcase."
    (is (= (elfproef "736160221" [9, 8, 7, 6, 5, 4, 3, 2, 1]) true))))

(deftest invalid-input
  (testing "an invalid elfproef testcase."
    (is (= (elfproef "0000000" [8, 7, 6, 5, 4, 3, 2, 1]) false))))
