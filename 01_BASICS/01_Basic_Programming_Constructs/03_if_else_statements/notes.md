# If Else Statements

## What are if else statements?
- An if-else statement is a control flow statement that allows us to make a decision based on a condition.
- It is used to execute a block of code if the condition is true, and another block of code if the condition is false.
- There is also an `else if` statement that allows us to check multiple conditions.
- The `else` and `else if` statements are optional.
- The `else` statement is used to execute a block of code if the condition is false.

### Syntax

#### Python

```python
if condition:
    # code to be executed if the condition is true
elif condition:
    # code to be executed if the first condition is false and the second condition is true
else:
    # code to be executed if the condition is false
```

#### Java

```java
if (condition) {
    // code to be executed if the condition is true
} else if (condition) {
    // code to be executed if the first condition is false and the second condition is true
} else {
    // code to be executed if the condition is false
}
```

### Example

#### Python

In python, the `else if` statement is written as `elif`.

```python
x = 5
if x > 0:
    print("x is positive")
elif x < 0:
    print("x is negative")
else:
    print("x is zero")
```

#### Java

```java
public class Main {
    public static void main(String[] args) {
        int x = 5;
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }
    }
}
```