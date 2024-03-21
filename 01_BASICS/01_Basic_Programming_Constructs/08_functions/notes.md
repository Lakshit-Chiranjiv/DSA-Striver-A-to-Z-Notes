# Functions | Pass by Value | Pass by Reference

## Functions
- Functions are a way to organize code into reusable blocks.
- It is a block of code that performs a specific task. We can call a function to perform the task any number of times.
- Functions are used to break the program into smaller and modular chunks. As the program grows larger, functions make it more organized and manageable.
- Functions are also called methods or procedures.

### Types of Functions
- There are two types of functions:
  - Built-in functions
  - User-defined functions
- Built-in functions are those functions that are already defined in the programming language.
- User-defined functions are those functions that are defined by the user.

### Function structure
- A function consists of a function name, a return type, a parameter list, and a function body.
- name: It is the name of the function used to call the function.
- return type: It is the data type of the value returned by the function.
- parameter list: It is the list of parameters passed to the function.
- function body: It is the block of code that performs the specific task.

### Example

#### Python
```python
# Function with return type and parameters
def add(a, b):
    return a + b

result = add(5, 3)
print(result) # 8

# Function without return type and parameters
def greet():
    print("Hello, World!")

greet() # Hello, World!
```

#### JAVA
```java
// Function with return type and parameters
public class Main {
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println(result); // 8
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Function without return type and parameters
    public static void greet() {
        System.out.println("Hello, World!");
    }
}
```

## Pass by Value
- In pass by value, the actual value of the variable is passed to the function as an argument.
- The function creates a new copy of the variable and works with the copy.
- The changes made to the copy of the variable do not affect the original variable.

### Example

#### Python
```python
def change_value(x):
    x = 10

a = 5
change_value(a)
print(a) # 5
```

#### JAVA
```java
public class Main {
    public static void main(String[] args) {
        int a = 5;
        changeValue(a);
        System.out.println(a); // 5
    }

    public static void changeValue(int x) {
        x = 10;
    }
}
```

## Pass by Reference
- In pass by reference, the reference of the variable is passed to the function as an argument. Reference is the memory address of the variable.
- The function works with the original variable at the memory address.
- The changes made to the variable in the function affect the original variable because there is no copy of the variable.

### Example

#### Python
```python
def change_value(x):
    x[0] = 10

a = [5,3,7]
change_value(a)
print(a) # [10, 3, 7]
```

#### JAVA
```java
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 3, 7};
        changeValue(a);
        System.out.println(Arrays.toString(a)); // [10, 3, 7]
    }

    public static void changeValue(int[] x) {
        x[0] = 10;
    }
}
```
```