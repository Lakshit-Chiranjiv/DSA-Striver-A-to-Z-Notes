# Time and Space Complexity

## Time Complexity
- Time complexity is a measure of the amount of time an algorithm takes to run as a function of the length of the input. It also depends on the hardware and the software environment in which the algorithm is run.
- It is basically the rate of growth of the running time of the algorithm with respect to the size of the input. The notation unit generalizes the time complexity of an algorithm for any environment or hardware.
- It is denoted by the big O notation (upper bound).
- It is used to classify algorithms according to their running time relative to the size of the input.
- There are different notations as well like big theta(Θ) - tight bound, big omega(Ω) - lower bound.
- There are different types of time complexities like
  - Constant time complexity: O(1)
  - Linear time complexity: O(n)
  - Logarithmic time complexity: O(log n)
  - Quadratic time complexity: O(n^2)
  - Cubic time complexity: O(n^3)
  - Exponential time complexity: O(2^n)
  - Factorial time complexity: O(n!)
  - Polynomial time complexity: O(n^k)
  - Linearithmic time complexity: O(n log n)
  - etc.

### Example
```pseudocode
function sum(n)
    sum = 0
    for i = 1 to n
        sum = sum + i
    return sum
```
- The time complexity of the above function is O(n).

```pseudocode
function sum(n)
    sum = 0
    for i = 1 to n
        for j = 1 to n
            sum = sum + i + j
    return sum
```
- The time complexity of the above function is O(n^2).

```pseudocode
function sum(n)
    sum = 0
    for i = 1 to n
        for j = i to n
            sum = sum + i + j
    return sum
```
- The time complexity of the above function is O(n^2).

```pseudocode
function sum(n)
    sum = 0
    for i = 1 to n
        for j = 1 to n (j = j * 2)
            sum = sum + i + j
    return sum
```
- The time complexity of the above function is O(n log n).

## Space Complexity
- Space complexity is a measure of the amount of memory an algorithm takes to run as a function of the length of the input.
- It is denoted by the big O notation (upper bound).
- It is used to classify algorithms according to the amount of memory they use relative to the size of the input.
- There are different types of space complexities like
  - Constant space complexity: O(1)
  - Linear space complexity: O(n)
  - Quadratic space complexity: O(n^2)
  - Cubic space complexity: O(n^3)
  - Exponential space complexity: O(2^n)
  - Factorial space complexity: O(n!)
  - Polynomial space complexity: O(n^k)
  - Linearithmic space complexity: O(n log n)
  - etc.
- The space complexity of an algorithm is the sum of the space complexity of all the variables used in the algorithm. Generally divided into two types
  - Auxiliary space complexity: The space complexity of the algorithm is the sum of the space complexity of all the variables used in the algorithm except the input.
  - Total space complexity: The space complexity of the algorithm is the sum of the space complexity of all the variables used in the algorithm including the input.
- We generally consider the auxiliary space complexity.

### Example
```pseudocode
function sum(n)
    sum = 0
    for i = 1 to n
        sum = sum + i
    return sum
```
- The space complexity of the above function is O(1).