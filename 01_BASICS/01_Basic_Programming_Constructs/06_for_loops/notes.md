# For Loops

## Introduction
- For loops are used to iterate over a sequence (list, tuple, string) or other iterable objects.
- Iterating over a sequence is called traversal.
- For loop is used to execute a block of code multiple times. They have a loop variable that changes each time through the loop. The loop variable is used to access the elements of the sequence. The structure of a for loop consists of 3 parts - initialization, condition and increment/decrement.

### Syntax

#### Python 
```python
for val in sequence:
    # body of for
```

#### Java
```java
for (int i = 0; i < n; i++) {
    // body of for
}
```

### Example

#### Python

In python, for loop can be used to iterate over a sequence of numbers using the `range` function. The `range` function returns a sequence of numbers, starting from 0 by default, and increments by 1 (by default), and stops before a specified number. Also if we want we can directly iterate over the elements of a list using the for loop as shown below. The `len` function returns the length of the list.

```python
# Program to find the sum of all numbers stored in a list
numbers = [6, 5, 3, 8, 4, 2, 5, 4, 11]
sum = 0
for val in numbers:
    sum = sum+val
print("The sum is", sum)

# Range function
# Program to iterate through a list using indexing
genre = ['pop', 'rock', 'jazz']
# iterate over the list using index
for i in range(len(genre)):
    print("I like", genre[i])
```

#### Java
```java
// Program to find the sum of all numbers stored in a list
public class Main {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 3, 8, 4, 2, 5, 4, 11};
        int sum = 0;
        for (int val : numbers) {
            sum = sum + val;
        }
        System.out.println("The sum is " + sum);

        // Iterate through a list using indexing
        String[] genre = {"pop", "rock", "jazz"};
        for (int i = 0; i < genre.length; i++) {
            System.out.println("I like " + genre[i]);
        }
    }
}
```