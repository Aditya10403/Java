# Data Structures and Algorithms

## Table of Contents
1. [Introduction](#introduction)
   - [1.1 Variables](#variables)
   - [1.2 Data Types](#data-types)
   - [1.3 Data Structures](#data-structures)
   - [1.4 Algorithms](#algorithms)
   - [1.5 Types of Analysis of an Algorithm](#types-of-analysis)
   - [1.6 Asymptotic Notation](#asymptotic-notation)
   - [1.7 Big-O Notation](#big-o-notation)
   - [1.8 Omega (Ω) Notation](#omega-notation)
   - [1.9 Theta (&#952;) Notation](#theta-notation)
2. [Recursion and Backtracking](#recursion-backtracking)
   - [2.1 What is Recursion?](#what-is-recursion)
   - [2.2 Recursion versus Iteration](#recursion-vs-iteration)
   - [2.3 What is Backtracking?](#what-is-backtracking)

## <a name="introduction"></a>INTRODUCTION

### <a name="variables"></a>1.1 Variables

Variables are a way of holding data in programming.

### <a name="data-types"></a>1.2 Data Types

A *data type* in a programming language is a set of data with predefined values. Examples include integer, floating point, unit number, character, string, etc.

Data types reduce coding effort. At the top level, there are two types of data types:  
- **System-defined data types (Primitive data types):** Defined by the system, examples include `int`, `float`, `char`, `double`, `bool`.
- **User-defined data types:** Created by programmers when system-defined types are insufficient. Examples include:
  - **Structures (C/C++):** Combine multiple data types into a single entity.
  - **Classes (Java):** Objects that encapsulate data and behavior.

  ```java
  public class Person {
    private String name;
    private String place;
  }
  ```

### <a name="data-structures"></a>1.3 Data Structures

A *data structure* is a particular way of storing and organizing data in a computer so that it can be used efficiently.

Data structures are classified into two types:

1) **Linear data structure:** Elements are accessed in a sequential order, though not necessarily stored sequentially (e.g., Linked Lists). Examples: Linked Lists, Stacks, Queues.
2) **Non-Linear data structure:** Elements are stored/accessed in a non-linear order. Examples: Trees and Graphs.

### <a name="algorithms"></a>1.4 Algorithms

An algorithm is a step-by-step, unambiguous set of instructions to solve a given problem.

Two main criteria for judging algorithms are:
- **Correctness:** Does the algorithm give a solution to the problem in a finite number of steps?
- **Efficiency:** How much resources (memory and time) does it take to execute?

<p align="center">
  <img src="image-1.png" alt="Algorithms">
</p>

### <a name="types-of-analysis"></a>1.5 Types of Analysis of an Algorithm

Analyzing an algorithm requires a formal syntax, forming the basis for asymptotic analysis/notation. There are three types of analysis:

- **Worst Case:** The input for which the algorithm takes the longest time.
- **Best Case:** The input for which the algorithm takes the least time.
- **Average Case:** Provides a prediction about the running time based on a random distribution of inputs.

*<p align="center">Lower Bound <= Average Time <= Upper Bound</p>*

### <a name="asymptotic-notation"></a>1.6 Asymptotic Notation

To represent upper and lower bounds, a function `f(n)` is used.

### <a name="big-o-notation"></a>1.7 Big-O Notation

This notation gives the tight upper bound of the given function, generally represented as `f(n) = O(g(n))`. At larger values of `n`, the upper bound of `f(n)` is `g(n)`.

For example, if `f(n) = n^4 + 100n^2 + 10n + 50`, then `g(n)` would be `n^4`.

<p align="center">
  <img src="image-2.png" alt="bigO">
</p>

- **Big-O Visualization:**  
  `O(g(n))` is the set of functions with smaller or the same order of growth as `g(n)`. For example: `O(n^2)` includes `O(1)`, `O(n)`, `O(nlogn)`, etc.

### <a name="omega-notation"></a>1.8 Omega (Ω) Notation [Lower Bounding Function]

Similar to Big-O, this notation gives the tighter lower bound of the given algorithm, represented as `f(n) = Ω(g(n))`. At larger values of `n`, the tighter lower bound of `f(n)` is `g(n)`.

For example, if `f(n) = 100n^2 + 10n + 50`, then `g(n)` is `Ω(n^2)`.

<p align="center">
  <img src="image-3.png" alt="omega">
</p>

### <a name="theta-notation"></a>1.9 Theta (&#952;) Notation

Theta notation decides whether the upper and lower bounds of a given function (algorithm) are the same. It represents the average running time of an algorithm, which is always between the lower bound and the upper bound.

<p align="center">
  <img src="image-4.png" alt="theta">
</p>

> For analysis (best case, worst case, and average), the upper bound (O), lower bound (Ω), and average running time (&#952;) are given.

## <a name="recursion-backtracking"></a>RECURSION AND BACKTRACKING

### <a name="what-is-recursion"></a>2.1 What is Recursion?

A function that calls itself is called *recursive*. A recursive method solves a problem by calling a copy of itself to work on a smaller problem. This is known as the *recursion step*.

Recursive code is generally shorter and easier to write than iterative code.

```java
if(test for the base case) 
  return some base case value 
else if(test for another base case) 
  return some other base case value 
  
// the recursive case 
else return (some work and then a recursive call) 
```

<p align="center">
  <img src="image-5.png" alt="recursion">
</p>

### <a name="recursion-vs-iteration"></a>2.2 Recursion versus Iteration

**Recursion**  
- Terminates when a base case is reached. 
- Each recursive call requires extra space on the stack frame (memory). 
- Infinite recursion may cause a stack overflow due to memory exhaustion. 
- Some problems are easier to solve using recursion.

**Iteration**  
- Terminates when a condition is proven to be false. 
- Each iteration does not require any extra space. 
- An infinite loop could run forever since no extra memory is being created. 
- Iterative solutions may not always be as obvious as recursive solutions.

### <a name="what-is-backtracking"></a>2.3 What is Backtracking?

Backtracking is an improvement on the brute force approach. It systematically searches for a solution to a problem among all available options.

In backtracking, we start with one possible option out of many available options and try to solve the problem. If we can solve the problem with the selected move, we print the solution; otherwise, we backtrack and select another option. If none of the options work, we conclude that there is no solution to the problem.

##