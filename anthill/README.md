# Anthill
## Assignment
On a warm summer morning you find nothing better to do than to observe how ants move around in the grass. You see that ants move between  different intersections using a fixed set of two-way connections. After more careful observation, you realize that the connections between these intersections can either be in the shade or in the sun, and that the ants prefer the ones in the sun.

At some point, the ants reassemble at their anthill (intersection `0`), but you still see their connections as trails in the grass. You realize that some of these connections lead to your lunch box (intersection `n-1`)! As amusing as you find the ants, you are not willing to share your food with them. Thus, you have to destroy some of their connections to ensure they cannot reach your lunch box from their anthill.

You still want to be nice to the ants and be careful with how you destroy the connections. Above all, you want to minimize the number of connections in the sun that you destroy and so, you would rather destroy multiple (even all!) connections in the shade than one in the sun. As a second criterion, you would like to also destroy as few connections in the shade as possible. Therefore, if there are multiple ways to achieve your goal that would destroy the same number of connections in the sun, among them you would choose the one that would destroy the smallest number of connections in the shade.

Consider all possibilities of removing connections that would prevent the ants from going from their anthill (intersection ) to your lunch box (intersection ). What is the smallest number of connections in the sun among these possibilities? If there are multiple possibilities with the same (smallest) number of connections in the sun, what is the smallest number of connections in the shade among these?

## Input
The first line of the input file contains a number `t <= 30` of test cases. Each of the `t` test cases is described as follows.

* It starts with a line that contains three integers `n s d` , separated by a space, denoting the number of intersections (`1 <= n <= 10^2`), the number of connections in the sun (`0 <= s <= 5 * 10^2`), and the number of connections in the shade (`0 <= d <= 5 * 10^2`).
* The following `s` lines each describe a connection in the sun. Each such line contains two integers `u v` , separated by a space, denoting that there is a connection between intersections `u` and `v`  (`0 <= u != v < n`). This means that if this connection is not destroyed, ants can travel between `u` and `v`  (in either direction).
* The following `d` lines each describe a connection in the shade. Each such line contains two integers `u v` , separated by a space, denoting that there is a connection between intersections `u`  and `v`   (`0 <= u != v < n`) . This means that if this connection is not destroyed, ants can travel between `u` and `v`  (in either direction).
## Output
For each test case output one line containing two integers separated by a space. The first integer is the smallest number of connections in the sun that have to be destroyed, possibly in combination with destroying some connections in the shade, to ensure that the ants cannot reach the lunch box (intersection `n-1`) from the anthill (intersection `0`). The second integer is the smallest number of connections in the shade that have to be destroyed among all possibilities which destroy the same (smallest) number of connections in the sun.

## Points
There are two groups of test sets, worth 100 points in total.

* For the first group of test sets, worth 50 points, you may assume that there are no connections in the sun (`s = 0`).
* For the second group of test sets, worth 50 points, there are no additional assumptions.
* **My code was only awarded 50 points!**
