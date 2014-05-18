# clj-pi

A Clojure library designed to calculate pi by various methods.

[![Current build status](https://travis-ci.org/rillian/clj-pi.svg?branch=master)](https://travis-ci.org/rillian/clj-pi)

## Usage

Right now there's only one method. Call
```clojure
(mc-pi 1.0e6)
```
to estimate the value of pi with monte-carlo sampling.
The single argument is the number of samples to take.

## License

Copyright © 2014 Ralph Giles

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
