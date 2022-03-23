# Reconstructing the Password
## Assignment
We all know that remembering passwords is not easy, but writing down a password on a piece of paper is not secure enough. That is why you decided to write down your password in an intricate way. The password is an ![Equation](https://math.vercel.app?from=n%2B2) characters string ![Equation](https://math.vercel.app?from=a_1%2Ca_2%2C%5Cldots%2Ca_%7Bn%2B2%7D)  and you wrote down on  separate papers all the possible three letter continuous substrings: ![Equation](https://math.vercel.app?from=a_1a_2a_3%2Ca_2a_3a_4%2C%5Cldots%2Ca_na_%7Bn%2B1%7Da_%7Bn%2B2%7D). However, over time you forgot your original password as well as the order of the papers containing the three letter substrings. To make things worse, you are not even sure if you did not lose some of the papers. Although not a perfect check, you want to check if you can construct at least one string out of the papers you have.

## Input
The first line of the input contains the number ![Equation](https://math.vercel.app?from=t%20%5Cleq%2050) of test cases. Each of the  test cases is described as follows.

It starts with a line containing an integer ![Equation](https://math.vercel.app?from=n), denoting the number of papers you found (![Equation](https://math.vercel.app?from=1%20%5Cleq%20n%20%5Cleq%205%20%5Ccdot%2010%5E3)).
The next ![Equation](https://math.vercel.app?from=n)  lines contain three letter strings consisting of lowercase English letters denoting the substring written on the papers.

## Output
For each test case output on a separate line `yes` if there exists a string of length  such that after applying the procedure explained above you get exactly the  different substrings from the input. Otherwise, you should output `no`.

## Points
There are three groups of test sets, worth  points in total.

* For the first group of test sets, worth 20 points, you may assume that .
* For the second group of test sets, worth 30 point, there are no additional assumptions.
* For the third group of test sets, worth 50 point, there are no additional assumptions.
* **Please note that my code was only awarded 50 points!**
