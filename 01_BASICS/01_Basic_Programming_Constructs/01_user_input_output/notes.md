# User Input and Output

## User Input

- User input means getting data from the user and feeding it into the program for custom output.
- The sequence of steps to get user input is as follows:
  1. Display a message to the user.
  2. Get the input from the user.
  3. Store the input in a variable.
  4. Use the input in the program.

### Example

#### Python
- The `input()` function is used to get user input in Python. The `input()` function takes a string as an argument and displays it to the user. For getting different types of input, we can use the `int()`, `float()`, etc. functions to convert the input to the desired type. We will talk about these data types in the next section.

```python
name = input("Enter your name: ")
print("Hello", name)
```

#### Java
- The `Scanner` class is used to get user input in Java. The `nextLine()` method is used to get a string input. The `nextInt()`, `nextFloat()`, `nextDouble()`, etc. methods are used to get integer, float, and double inputs respectively. We will talk about these data types in the next section.
  
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
```

## User Output

- User output means displaying data to the user.
- The sequence of steps to display data to the user is as follows:
  1. Store the data in a variable.
  2. Display the data to the user.

### Example

#### Python
- The `print()` function is used to display data to the user in Python.

```python
name = "John"
print("Hello", name)
```

#### Java
- The `System.out.println()` method is used to display data to the user in Java.

```java
public class Main {
    public static void main(String[] args) {
        String name = "John";
        System.out.println("Hello " + name);
    }
}
```

### Status
![11.11%](https://progress-bar.dev/11.11?title=Basic%20Programming%20Constructs)