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

(defn mc-pi
  "Estimate the value of pi based on monte-carlo sampling."
  [iterations]
  (let [sample (fn [] (circle? (rand) (rand)))
        measurements (repeatedly iterations sample)
        inside (filter true? measurements)]
    (* 4.0 (/ (count inside) iterations))
  )
)
