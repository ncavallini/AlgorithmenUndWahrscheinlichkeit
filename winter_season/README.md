# Winter Season
## Assignment
As always, farmers are afraid of a harsh winter, because too many snowy days can ruin the crops for the whole year to come. More precisely, if out of ![Equation](https://math.vercel.app?from=n) days it is snowing on at least ![Equation](https://math.vercel.app?from=k) days, the season is considered to be a disaster.

You know that the probability of snow on the ![Equation](https://math.vercel.app?from=i)-th day is ![Equation](https://math.vercel.app?from=p_i), independently of other days. Compute the probability of a disaster season!

## Input
The first line of the input contains the number ![Equation](https://math.vercel.app?from=t\leq30) of test cases. Each of the ![Equation](https://math.vercel.app?from=t) test cases is described as follows:

* It starts with a line that contains two integers ![Equation](https://math.vercel.app?from=n,k), separated by a space, where ![Equation](https://math.vercel.app?from=n) denotes the number of days the winter will last (![Equation](https://math.vercel.app?from=1%20%5Cleq%20n%20%5Cleq%2010%5E3)), and the season will be a disaster if the number of snowy days is at least ![Equation](https://math.vercel.app?from=k) (![Equation](https://math.vercel.app?from=0%20%5Cleq%20k%20%5Cleq%20n)).
The following line defines the probabilities of snow on each of the ![Equation](https://math.vercel.app?from=n) days. It contains ![Equation](https://math.vercel.app?from=n) real numbers ![Equation](https://math.vercel.app?from=p_1,\ldots,p_n) , separated by a space, denoting that the probability of a heavy snow on the ![Equation](https://math.vercel.app?from=i)-th day is  (![Equation](https://math.vercel.app?from=0%20%5Cleq%20p_i%20%5Cleq%201%20%5Cquad%20%5Cforall%20i%20%5Cin%20%5C%7B1%2C%20%5Cldots%2C%20n%5C%7D)).

## Output
For each test case output one line containing one real number denoting the probability of the season to be a disaster. Your solution is going to be accepted if it has an absolute or relative error of at most ![Equation](https://math.vercel.app?from=10%5E%7B-3%7D).

## Points
There are two test sets, worth 100 points in total.

For the first test set, worth 50 points, you may assume that ![Equation](https://math.vercel.app?from=n\leq30).

For the second test set, worth 50 points, there are no additional assumptions.
