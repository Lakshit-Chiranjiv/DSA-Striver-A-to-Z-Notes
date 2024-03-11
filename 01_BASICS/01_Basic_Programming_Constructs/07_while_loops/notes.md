# While Loops

## Introduction
- While loop is used to execute a block of code repeatedly as long as the condition is true.
- The structure of a while loop consists of 2 parts - condition and body of the loop.
- The body of the loop is executed as long as the condition is true.
- The condition is checked before the execution of the body of the loop.
- If the condition is false, the body of the loop is not executed and the control is transferred to the next statement after the while loop.

### Syntax

#### Python
```python
while condition:
    # body of while
```

#### Java
```java
while (condition) {
    // body of while
}
```

### Example

#### Python
```python
# Program to add natural numbers up to n
# sum = 1+2+3+...+n
n = 10
sum = 0
i = 1
while i <= n:
    sum = sum + i
    i = i+1
print("The sum is", sum) # The sum is 55
```

#### Java
```java
// Program to add natural numbers up to n
// sum = 1+2+3+...+n
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println("The sum is " + sum); // The sum is 55
    }
}
```