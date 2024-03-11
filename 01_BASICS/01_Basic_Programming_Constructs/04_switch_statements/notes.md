# Switch Statements

## What are switch statements?
- A switch statement is a control flow statement that allows us to make a decision based on a variable.
- It is used to execute a block of code based on the value of a particular variable.
- It is similar to an if-else statement, but is more concise and easier to read when dealing with multiple conditions.
- It is used when we have a single variable and multiple possible values, and we want to execute different blocks of code based on the value of the variable. It is commonly used when dealing with menu-driven programs, or when we have a fixed set of options to choose from.

### Syntax

#### Python

```python
variable = value
match variable:
    case value1:
        # code to be executed if variable is equal to value1
    case value2:
        # code to be executed if variable is equal to value2
    case value3:
        # code to be executed if variable is equal to value3
    ...
    case _:
        # code to be executed if variable is not equal to any of the values
```

#### Java

```java
int variable = value;
switch (variable) {
    case value1:
        // code to be executed if variable is equal to value1
        break;
    case value2:
        // code to be executed if variable is equal to value2
        break;
    case value3:
        // code to be executed if variable is equal to value3
        break;
    ...
    default:
        // code to be executed if variable is not equal to any of the values
}
```

### Example

#### Python

In python, the `match` statement is used to create a switch statement. The `case` statement is used to define the different cases, and the `_` is used as the default case.

```python
day = "Monday"
match day:
    case "Monday":
        print("It's Monday!")
    case "Tuesday":
        print("It's Tuesday")
    case "Wednesday":
        print("It's Wednesday")
    case "Thursday":
        print("It's Thursday")
    case "Friday":
        print("It's Friday")
    case "Saturday":
        print("It's Saturday")
    case "Sunday":
        print("It's Sunday")
    case _: # Default case
        print("Invalid day")
```

#### Java

```java
public class Main {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("It's Monday!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            case "Saturday":
                System.out.println("It's Saturday");
                break;
            case "Sunday":
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

### Output

```
It's Monday!
```