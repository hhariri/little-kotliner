Little-Kotliner
===============

Implementation of [The Little Schemer](http://www.amazon.com/The-Little-Schemer-4th-Edition/dp/0262560992) in Kotlin

### Purpose

The purpose of this project is a learning exercise to think about functional programming
with lists and composition.


### Implementation Notes

The code here is not meant to be optimal nor necessarily be idiomatic Kotlin. Primitives
are implemented in a way to remain as faithful as possible to the original The Little Schemer
definitions in Scheme.

As definitions are being built while going through the book, some might be refactored as
new definitions appear.


### Structure


[**Primitives**](https://github.com/hhariri/little-kotliner/blob/master/src/com/hadihariri/littleKotliner/Primitives.kt) hold all the definitions from the book. Each definition usually has its own
[test](https://github.com/hhariri/little-kotliner/blob/master/test/com/hadihariri/littleKotliner/tests) classes under **test** folder.

