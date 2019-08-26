# Program 1
## Purpose
The purpose of this program is to implement the infix to postfix conversion
algorithm we presented in class:
* Create an empty stack called **opstack** for keeping operators.
* Read the infix expression character by character.
* For each character do the following:
  * if an operand (`a..zA..Z0..9`), write out (print to `System.out`).
  * if a left parenthesis, push it on the **opstack**.
  * if a right parenthesis, pop the **opstack** and write out until the
corresponding left parenthesis is removed.
  * if an operator (`*, /, +, or -`) push it on the **opstack**.
However, **first** remove any **operators** already on the **opstack** that have
higher or equal precedence and write them out.
* When all characters in the input expression have been read, check the
**opstack**. Any operators still on the stack can be popped and written out.

Read section 3.9.2 of
[this chapter](http://interactivepython.org/runestone/static/pythonds/BasicDS/InfixPrefixandPostfixExpressions.html)
for more detailed discussions on this algorithm.
You may assume all variables and values are represented by a single character,
and that no expression will exceed 100 characters in size.

## Expected Results
```shell
  $ java Converter
  Please input your infix expression:  2+3*4
  Postfix conversion: 234*+
  $ java Converter
  Please input your infix expression:  (1+2)*7
  Postfix conversion: 12+7*
```
You should read your infix expression using the `Scanner` class (`nextLine` method).

## Test Cases
Please make sure that your solution pass the following test cases:
```
infix       | postfix
---------------------
a+b         | ab+
2+3*4       | 234*+
(a+b)*(c-d) | ab+cd-*
A+B*C-D     | ABC*+D-
```

