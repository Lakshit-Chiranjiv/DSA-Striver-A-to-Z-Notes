# Data Types

## What are Data Types?

- Data types are the classification or categorization of data items. It represents the kind of value that tells what operations can be performed on a particular data.
- Data types are used to define a variable before using it in a program. The type of a variable determines how much space it occupies in storage and how the bit pattern stored is interpreted.
- Data types in programming languages are an important concept. They are used to define the type of data a variable can store. For example, an integer data type can hold integer values, a character type can hold character values, etc.

### Example

#### Python

- In Python, we don't need to declare the data type of a variable. Python automatically assigns the data type based on the value assigned to the variable. The `type()` function is used to get the data type of a variable.

```python
x = 5
print(type(x)) # <class 'int'>

y = 5.0
print(type(y)) # <class 'float'>

z = "Hello"
print(type(z)) # <class 'str'>
```

#### Java

- In Java, we need to declare the data type of a variable before using it. Some of the data types in Java are `int`, `float`, `double`, `char`, `String`, etc.
```java
public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x); // 5

        float y = 5.0f;
        System.out.println(y); // 5.0

        double z = 5.0;
        System.out.println(z); // 5.0

        char c = 'A';
        System.out.println(c); // A

        String s = "Hello";
        System.out.println(s); // Hello

        boolean b = true;
        System.out.println(b); // true

        long l = 1000000000000000000L;
        System.out.println(l); // 1000000000000000000
    }
}
```

### Primitive and Derived Data Types

- Data types can be classified into two categories: primitive and derived.
- **Primitive Data Types**: These are the basic data types that are provided by the programming language. They are the building blocks of data manipulation. Examples of primitive data types are `int`, `float`, `char`, `boolean`, etc.
- **Derived Data Types**: These data types are derived from the primitive data types. They include `arrays`, `lists`, `stacks`, `queues`, etc. Derived data types are implemented using primitive data types.
- We will talk about derived data types in the further sections.