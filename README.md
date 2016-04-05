# BrainFInterpretor

Brainfuck is an esoteric programming language created in 1993 by Urban Müller, and notable for its extreme minimalism.

The language consists of only eight simple commands and an instruction pointer. While it is fully Turing-complete, it is not intended for practical use, but to challenge and amuse programmers.

https://en.wikipedia.org/wiki/Brainfuck

[![Build Status](https://travis-ci.org/alex-87/BrainFInterpretor.svg?branch=master)](https://travis-ci.org/alex-87/BrainFInterpretor)

BrainFInterpretor in action
===========================

![screen](https://raw.githubusercontent.com/alex-87/BrainFInterpretor/master/example.gif)

Try it !
========

`git clone https://github.com/alex-87/BrainFInterpretor.git . && ant && echo "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>." | java -jar ./BF.jar`

References
==========

- Wikipedia
- [Fibonacci](https://github.com/unixpickle/brainfuck/blob/master/examples/fib.bf) in BF, from [@unixpickle](https://github.com/unixpickle)
