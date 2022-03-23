# Count the Divisors
## Assignment
You are given a set of ![Equation](https://math.vercel.app?from=k) natural numbers and you want to know how many numbers between ![Equation](https://math.vercel.app?from=1) and ![Equation](https://math.vercel.app?from=10%5E%7B10%7D) (both included) can't be divided by any of those ![Equation](https://math.vercel.app?from=k) numbers.

## Input
The first line of the input contains the number ![Equation](https://math.vercel.app?from=t%20%5Cleq%2030) of test cases. Each of the  test cases is described as follows.

It starts with a line that contains a single integer ![Equation](https://math.vercel.app?from=1%20%5Cleq%20k%20%5Cleq%2010).
The following line contains ![Equation](https://math.vercel.app?from=k) natural numbers a_0,\ldots,a_{k-1} , separated by a space, such that ![Equation](https://math.vercel.app?from=1%20%5Cleq%20a_i%20%5Cleq%202%5E%7B31%7D-1), for all ![Equation](https://math.vercel.app?from=i%20%5Cin%20%5C%7B0%2C%20%5Cldots%2C%20k-1%5C%7D).

## Output
For each test case output one line containing one integer denoting how many numbers between ![Equation](https://math.vercel.app?from=1) and ![Equation](https://math.vercel.app?from=10%5E%7B10%7D) are not divided by any of the ![Equation](https://math.vercel.app?from=a_i).

## Points
There are two groups of test sets, worth 100 points in total.

* For the first group of test sets, worth  point, you may assume that all ![Equation](https://math.vercel.app?from=a_i)'s are pairwise coprime.
* For the second group of test sets, worth  point, there are no additional assumptions.

## Hint
You may find the `Algorithms.gcd()` function useful.
