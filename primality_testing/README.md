# Primality Testing

## Assignment
You recently started working in a top-tier cyber security company. You know how cyber security is all about primes, so as a first task your boss gave you a list of numbers and wants you to determine which numbers are prime and which are not.

## Input
The first line of the input file contains an integer `1 <= t <= 10^4` denoting the number of test cases that follow. Each of the `t`  test cases consists of a line containing an integer `n` . It is guaranteed that `1 <= n <= 2^63 - 1`.

## Output
For each test case output `yes` if the number is a prime or `no` otherwise.

## Points
There are two groups of test cases, worth 100 points in total.
* For the first group of test cases, worth 50 points, you may assume that .
* For the second group of test cases, worth 50 points, there are no additional assumptions.

## Notes
* You should consider using a probabilistic algorithm which gives a wrong answer with some small probability.
* You should consider looking at the pseudocode for the Rabin-Miller algorithm from the script in order to solve this exercise.
* You are strongly advised to use Java's built-in class ``` BigInteger```  and its built-in methods.
* You are strongly advised to use Java's built-in method ```base.modPow(BigInteger exponent, BigInteger modulus)``` for fast modular exponentiation  where `base` is an object of type `BigInteger` .
You are strictly prohibited to use Java's built-in method `n.isProbablePrime(int certainty)` where `n` is an object of type `BigInteger` for which you want to run the test.
