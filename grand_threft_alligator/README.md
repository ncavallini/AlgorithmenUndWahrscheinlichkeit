# Grand Threft Alligator
## Assignment
As the leader of a large-scale criminal operation, you are organizing the robbery of a zoo, focusing on a single exotic and expensive animal: the alligator.

You have a map of Algoland that consists of $n$ cities and a number of one-directional roads. Out of these roads, $m$ have a police car with a police officer stationed on them. Each police officer has a suspicion limit $k$ : if he/she sees $k$  cars driving on that road, he/she becomes suspicious and will investigate any car after that. That is, at most $k$ cars can pass on that road without being stopped by the police. In addition, there are $r$ roads with no police cars stationed on them.

At first, all thieves are in the city of Algoville. Each thief can take a car and drive along some of the roads in Algoland to reach the zoo. At that point, the thief will steal exactly one alligator from the zoo and drive to the headquarters of your criminal organization.

Your task is to compute the maximum number of alligators that the thieves can steal and transport to the headquarters. There is an unlimited number of thieves in Algoville and an unlimited number of alligators at the zoo, and the headquarters can host an unlimited number of thieves and an unlimited number of alligators. Your plan must be such that no thief is ever stopped by the police - on the way to the zoo, the thieves will be transporting the illegal tools for breaking into it.

To make your task simpler, you're guaranteed that there is no non-empty sequence of roads that leads from the zoo back again to the zoo. Additionally, there is at most one road between each pair of cities: if there is a road from city $u$ to city $v$ , there is no other road from $u$ to $v$, and there is no road from $v$ to $u$.

## Input
The first line of the input file contains a number $t \leq 30$ of test cases. Each of the $t$ test cases is described as follows.

* It starts with a line that contains three integers `n m r` , separated by a space, denoting the number of cities ($3 \leq n \leq 10^2$), roads with a police car on them ($0 \leq m < 10^3$), and roads with no police car on them ($0 \leq r < 10^3$).
* The following line contains three distinct integers `a b c` , denoting the indices of Algoville, the zoo, and the headquarters respectively ($0 \leq a,b,c < n$).
* The following $m$ lines each describe a road with a police car. The $i$-th such line contains three integers `u v k`, separated by a space, denoting that there is a road from city $u$ ($0 \leq u < n$) to city $v$  ($0 \leq v < n$ and $u \neq v$) with a police officer with suspicion limit  ($0 \leq k < 10^2$).
* The following $m$ lines each describe a road with a police car. The $i$-th such line contains three integers `u v`, separated by a space, denoting that there is a road from city $u$ ($0 \leq u < n$) to city $v$  ($0 \leq v < n$ and $u \neq v$). For every pair of cities $u$ and $v$ there is at most one road connecting them.

## Output
For each test case output on a separate line a single integer denoting the maximum number of alligators the thieves can steal. If an unlimited number of alligators can be stolen, output the word `"RICH"`.

# Points
There is a single group of test sets, worth 10 points.

