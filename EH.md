# Exception Handling in Java

Exception handling in Java is a powerful mechanism that handles runtime errors to maintain normal application flow. Java offers several ways to handle exceptions, including `try-catch` blocks, the `throws` keyword, and custom exceptions.

## Basic Exception Handling

### Try-Catch Block

The `try-catch` block is the basic way to handle exceptions. The code that might throw an exception is placed inside the `try` block, and the exception handling code goes into the `catch` block.

```java
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```

### Multiple Catch Blocks

```java
public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc"); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
```

## What are the differences between Checked Exception and Unchecked Exception?

| Checked Exception                     | Unchecked Exception                         |
| ------------------------------------- | ------------------------------------------- |
| Known as compile-time exceptions      | Known as runtime exceptions                 |
| Propagated using the `throws` keyword | Automatically propagated                    |
| Custom exceptions extend `Exception`  | Custom exceptions extend `RuntimeException` |

## What is the difference between Exception and Error in Java?

- **Exception**: A subclass of the `Throwable` class, used for conditions that a user's program should catch and handle.

- **Error**: Also a subclass of the `Throwable` class, but represents serious problems that are not expected to be caught by the user's program.

## Difference between `throw` and `throws`

| Throw                                     | Throws                                               |
| ----------------------------------------- | ---------------------------------------------------- |
| Used for throwing an exception explicitly | Used to declare an exception                         |
| Can’t propagate checked exceptions        | Can propagate checked exceptions                     |
| Always used with an instance              | Used in the method signature                         |
| Used inside the method                    | Always used with the method signature                |
| Can't throw multiple exceptions at once   | Can declare multiple exceptions separated by a comma |

`Throw`
```java
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
    }
}
```

`Throws`
```java
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("IO exception occurred: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
    }
}
```

## Custom Exceptions

```java
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            checkNumber(0);
        } catch (InvalidNumberException e) {
            System.out.println("Custom exception occurred: " + e.getMessage());
        }
    }

    public static void checkNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Number must be greater than zero");
        }
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
```

## Importance of the `finally` block in exception handling

The `finally` block is executed regardless of whether an exception is thrown or not, ensuring that essential clean-up tasks (like releasing resources) are always performed.

```java
public class DivideByZeroException {
     public static void main(String []args){
        try {
            int a = 1;
            System.out.println(a / 0);
        } catch (Exception exception) {
          System.out.println("Exception is thrown");
        } finally {
            System.out.println("After the exception is handled");
        }
     }
}
```

## What will happen to the Exception object after exception handling?

The Exception object will be garbage collected in the next garbage collection cycle.

## keywords final, finally, and finalize.

`Final`: Used to apply restrictions on class (immutable), method (cannot be overridden), and variable (constant).

`Finally`: A block that always executes when the try block exits, even if an exception occurs.

`Finalize`: A method called to clean up or release resources by the Garbage Collector before destroying the object.
