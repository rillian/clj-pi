(ns clj-pi.core)

; Monte-carlo sampling.
; The idea here is to sample points in the plane, and count
; how many fall inside the unit circle. This gives us an
; estimate of the area, from which we can derive $\pi$.
(defn circle?
  "Test whether an x y pair is inside the using circle."
  [x y]
  ( >= 1.0 (+ (* x x) (* y y)))
)
