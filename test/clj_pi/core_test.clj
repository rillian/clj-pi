(ns clj-pi.core-test
  (:require [clojure.test :refer :all]
            [clj-pi.core :refer :all]))

(deftest circle-test
  (testing "circle?"
    ; Basic value checks.
    (is (circle? 0 0))  ; origin is inside
    (not (circle? 1 1)) ; outside
    (not (circle? 1 0)) ; on the border
    ; Check all four quadrants.
    (is (circle? +0.5 +0.5))
    (is (circle? +0.5 -0.5))
    (is (circle? -0.5 +0.5))
    (is (circle? -0.5 -0.5))
    (not (circle? +0.8 +0.8))
    (not (circle? +0.8 -0.8))
    (not (circle? -0.8 +0.8))
    (not (circle? -0.8 -0.8))
))
