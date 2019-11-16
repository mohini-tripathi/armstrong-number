(ns armstrong-number.core-test
  (:require [clojure.test :refer :all]
            [armstrong-number.core :refer :all]))



(deftest test-I
  (testing "Is 5 an Armstrong number?"
    (is (narcissitstic? 5))))

(deftest test-II
  (testing "Is 153 an Armstrong number?"
    (is (narcissitstic? 153))))

(deftest test-III
  (testing "Is 100 not an Armstrong number?")
  (is (not (narcissitstic? 100))))

(deftest test-IV
  (testing "Is 9922889 an Armstrong number?")
  (is (narcissitstic? 9922889)))

(deftest test-V
  (testing "Is 7607881808 an Armstrong number?")
  (is (narcissitstic? 7607881808)))


(run-all-tests)