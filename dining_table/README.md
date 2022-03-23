# Dining table
## Assignment
You decided to organise a dinner party at your home. Since you are an outgoing person your friend pool is very large, but unfortunately not all of your friends are acquainted with each other. In order for the evening to be successful and entertaining for everybody you make the following plan.

For each guest, you write down the list of people she is a friend with. You know that the friendships are a symmetric relation, i.e. that if a person ![Equation](https://math.vercel.app?from=a) is a friend of a person ![Equation](https://math.vercel.app?from=b)  then the person ![Equation](https://math.vercel.app?from=b) is a friend of the person ![Equation](https://math.vercel.app?from=a).

Your plan is simple: you want to place each guest on one of the two sides of your table and furthermore, you want to place all her friends on the other side of the table, exactly across, so that the conversations are flowing smoothly. You are sure that your table is large enough, but from a first glance at your friendship lists you cannot deduce whether such a placement is possible.

Luckily, you are a fairly good programmer and decide to rely on your programming skills to check if your plan for the evening can happen. Moreover, if your seating plan can work out, you want to know who will be seated on the same side of the table as your best friend.

## Input
The first line of the input file contains an integer ![Equation](https://math.vercel.app?from=1%20%5Cleq%20t%20%5Cleq%2020) denoting the number of test cases that follow. Each of the  test cases is described as follows.

It starts with a line containing three integers ![Equation](https://math.vercel.app?from=n%2Cm%2Cr), separated by space, denoting the number of people attending your dinner party, the total number of friendships, and the name of your best friend, such that ![Equation](https://math.vercel.app?from=1%20%5Cleq%20n%20%5Cleq%2010%5E4), ![Equation](https://math.vercel.app?from=1%20%5Cleq%20m%20%5Cleq%2010%5E5), and ![Equation](https://math.vercel.app?from=0%20%20%5Cleq%20r%20%5Cleq%20n-1).
The next ![Equation](https://math.vercel.app?from=m) lines contain two integers ![Equation](https://math.vercel.app?from=a%2Cb), separated by space, indicating that the person  ![Equation](https://math.vercel.app?from=a)is a friend with the person ![Equation](https://math.vercel.app?from=b) (and the other way around, remember -- friendships are symmetric!), where .

## Output
For each test case output one line with the people seated on the same side of the table as your best friend  ordered increasingly while respecting your seating plan, or  `no` if your seating plan is not possible.

## Points
This exercise gives 100 points.
