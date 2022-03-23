# Distances
## Assignment
You are given an undirected graph ![Equation](https://math.vercel.app?from=G)  on the vertex set ![Equation](https://math.vercel.app?from=%5C%7B0%2C%20%5Cldots%2C%20n-1%5C%7D). Compute the distances of all vertices of ![Equation](https://math.vercel.app?from=G) from a given starting vertex ![Equation](https://math.vercel.app?from=v) using the BFS algorithm.

## Input
The first line of the input contains the number ![Equation](https://math.vercel.app?from=t%20%5Cleq%2020) of test cases. Each of the  test cases is described as follows.

It starts with a line containing three integers ![Equation](https://math.vercel.app?from=n%2Cm%2Cv), separated by a space, denoting the number of vertices in ![Equation](https://math.vercel.app?from=G) , the number of edges in  ![Equation](https://math.vercel.app?from=G), and the given vertex ![Equation](https://math.vercel.app?from=v).
The following  lines each contain two integers , separated by a space, indicating that  is an edge of the graph (where ).
Output
For each test case you should output a separate line containing the distances of all the vertices from  ordered by increasing vertex labels and separated by a space. In case a vertex is not connected to  at all, you should output  for its distance.

Points
This exercise is worth  points.
