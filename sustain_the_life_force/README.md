# Sustain the Life Force
## Assignment
In a galaxy far, far away... A problem with the life force emerged and the inhabitants of the planets in the galaxy are aware of it. If the problem is not fixed within one year the inhabitants will likely perish.

For each planet it is known what is the current number of plants on it and how many plants it needs in order to sustain its life force. However, some planets are in deficit of plants and need help from the others. In order to do something about it the inhabitants of each planet are aware of all other planets to which the travel time is less than one year. Since the planets are not technologically equally developed, the travel time from planet  to planet  being less than one year does not mean the travel time from  to  is also less than one year. If the travel time from planet $u$ to planet $v$ is less than one year, then, any number of plants can be sent from $u$ to $v$ —obviously, this can be no more than the number of plants planet $u$ currently has. Unfortunately, the plants are fragile and can survive at most one interplanetary journey, that is the plants sent from planet $u$ to planet $v$ cannot be sent further.

Can the inhabitants redistribute the plants amongst planets such that in one year from now every planet has enough plants in order to sustain its life force?

## Input
The first line of the input file contains a number $t \leq 30$ of test cases. Each of the $t$ test cases is described as follows.

 * It starts with a line that contains two integers `n m`, separated by a space, denoting the number of planets in the galaxy (`1 <= n <= 100`) and the number of relations of the type 'the travel time from planet `u` to planet `v` is less than one year' (`0 <= m <= 1500`).
 * The next `n` lines each describe one planet. The `i`-th such line contains two integers `p f`, separated by a space, denoting the number of plants currently on planet `i`  (`0 <= p <= 10^4`) and the number of plants the planet `i` needs in order to sustain its life force (`0 <= f <= 10^4`).
*  The next `m` lines each contain two integers `u v`, separated by a space, denoting that the travel time from planet `u` to planet `v` is less than one year (` 0 <= u != v <= n-1`).

## Output
For each test case output a single line containing the word `"yes"` if the inhabitants can redistribute the plants within one year so that every planet has enough plants to sustain its life force or `"no"` if that is not possible.

## Points
This exercise is worth 100 points in total.
