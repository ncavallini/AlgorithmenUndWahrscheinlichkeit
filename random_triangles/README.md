# Random Triangles
## Assignment
In this exercise you are supposed to examine the random variable denoting the number of triangles in a random graph ![Equation](https://math.vercel.app?from=G%20%5Csim%20G_%7Bn%2Cp%7D).

For ![Equation](https://math.vercel.app?from=n%5Cin%20%5Cmathbb%20N%2C%20p%20%5Cin%20%5B0%2C1%5D) we let ![Equation](https://math.vercel.app?from=G_%7Bn%2Cp%7D) denote the probability space of graphs on  vertices where each edge is present with probability ![Equation](https://math.vercel.app?from=p) independently of other edges. Let  ![Equation](https://math.vercel.app?from=X) be the random variable denoting the number of triangles in ![Equation](https://math.vercel.app?from=G%20%5Csim%20G_%7Bn%2Cp%7D). Compute the expected number of triangles ![Equation](https://math.vercel.app?from=%5Cmathbb%20E%5BX%5D) and its variance ![Equation](https://math.vercel.app?from=%5Ctext%20%7BVar%7D%28X%29).

## Input
The first line of the input file contains a number ![Equation](https://math.vercel.app?from=t\leq30) of test cases. Each of the  test cases is described as follows.

It starts with a line which consists of an integer ![Equation](https://math.vercel.app?from=n) and a real ![Equation](https://math.vercel.app?from=p), separated by a space, denoting the number of vertices (![Equation](https://math.vercel.app?from=1\leq%20n\leq1000)) and the probability of an edge existing (![Equation](https://math.vercel.app?from=p\in[0,1])) of a graph.

## Output
For each test case output a single line with two values ![Equation](https://math.vercel.app?from=%5Cmathbb%20E%5BX%5D) and ![Equation](https://math.vercel.app?from=%5Ctext%20%7BVar%7D%28X%29) separated by a space. Your solution is going to be accepted if it has an absolute or relative error of at most ![Equation](https://math.vercel.app?from=10%5E%7B-5%7D).

## Points
This exercise is worth 100 points.

## Explanation of the formulas used

* A _triangle_ is a triple of edges `{u,v}, {v,w}, {w,v}` such that these edges do exist in the graph
Since in our example, each edge exists with probability <img src="https://math.vercel.app?from=p" /> independently of others and that there exists `n choose 3` choiches of three edges out of `n` vertices, the formula for <img src="https://math.vercel.app?from=E(X)" /> follows automatically.

<p align="center">
<img src="https://math.vercel.app?from=%5Cmathbb%20E%5BX%5D%20%3D%20%5Cbinom%7Bn%7D%7B3%7Dp%5E3" />
</p>
For the variance, see below:
<p align="center">
<img src="Variance.png" />
</p>
