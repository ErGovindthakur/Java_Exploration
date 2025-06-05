# Java Learning Guide: From Basics to Advanced 🚀

A comprehensive guide to learning Java with real-world examples. This document is perfect for beginners and intermediate learners aiming to master Java fundamentals and core concepts.

---

## 📘 Table of Contents

1. [Introduction](#introduction)  
2. [Getting Started](#getting-started)  
3. [Java Basics](#java-basics)  
4. [Object-Oriented Programming (OOP)](#object-oriented-programming-oop)  
5. [Advanced Concepts](#advanced-concepts)  
6. [Real-World Project: Library Management System](#real-world-project-library-management-system)  
7. [Resources](#resources)  

---

## Introduction

Java is a high-level, object-oriented programming language known for its portability, robustness, and wide range of applications—from web development to mobile apps and enterprise solutions.

---

## Getting Started

### Prerequisites

- Basic understanding of programming concepts  
- Java Development Kit (JDK) installed  
- An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse  

### Hello World Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Java Basics
Variables and Data Types

```java
int age = 30;
double salary = 50000.50;
char grade = 'A';
boolean isEmployed = true;
String name = "John Doe";
```
## Control Structures
If-Else Statement

``` java 
if (age > 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

## For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}

```

## Arrays

``` java 
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Outputs 1

```
### ✅ Object-Oriented Programming (OOP) Concepts in Java (In-Depth)
OOP is a programming paradigm based on the concept of objects, which can contain data (fields/attributes) and methods (functions). Java is built on OOP, and understanding it deeply is essential for building scalable and maintainable applications.

1. Class and Object
Class: A blueprint for creating objects or class is the named group of features and functionality. It defines properties and behaviors.

Object: An instance of a class.

``` java
public class Dog {
    String breed;
    int age;

    public void bark() {
        System.out.println("woof Dog!");
    }
}

Dog myDog = new Dog(); // Object creation
myDog.bark(); // Method call
```
## 2. Encapsulation (Data Hiding)
Encapsulation is the process of wrapping variables (data) and methods into a single unit (class). Use private access modifier and provide public getters and setters.

``` java
public class BankAccount {
    private double balance; // Encapsulated field

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```
## ✅ Why use Encapsulation?

Prevents unauthorized access

Improves code maintainability

## 3. Inheritance (Code Reusability)
Inheritance allows one class (child) to acquire the properties and methods of another class (parent).

``` java
public class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

public class Cat extends Animal {
    public void meow() {
        System.out.println("Meow!");
    }
}

// Usage:
Cat kitty = new Cat();
kitty.eat();  // Inherited method
kitty.meow(); // Own method

```
## ✅ Why use Inheritance?

Promotes code reuse

Helps create a class hierarchy

4. Polymorphism (Many forms)
Compile-time Polymorphism (Method Overloading): Same method name, different parameters.

``` java
public class MathUtil {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```
Run-time Polymorphism (Method Overriding): Subclass provides specific implementation of a parent method.

``` java
public class Bird {
    public void sound() {
        System.out.println("Some sound");
    }
}

public class Parrot extends Bird {
    public void sound() {
        System.out.println("Squawk!");
    }
}

// Usage:
Bird myBird = new Parrot();
myBird.sound(); // Outputs "Squawk!"
```
## ✅ Why use Polymorphism?

Enhances flexibility

Helps achieve loose coupling

## 5. Abstraction (Hiding implementation)
Abstraction means showing only essential details and hiding unnecessary information.

a. Using Abstract Class

``` java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```
b. Using Interface
``` java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```
## ✅ Why use Abstraction?

Provides a clear structure

Focus on what an object does instead of how it does it

## Advanced Concepts
Exception Handling

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}

```

## File I/O

``` java
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, File!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

## Collections Framework

``` java
import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

```

## Real-World Project: Library Management System 📚
1. Overview
A console-based application to manage books in a library, allowing users to:

> Add new books

>Delete existing books

>Search for books by title

>Display all books

## Sample Code Snippet

``` java
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
        System.out.println("Book added: " + title);
    }

    public void removeBook(String title) {
        if (books.remove(title)) {
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found");
        }
    }

    public void searchBook(String title) {
        if (books.contains(title)) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found");
        }
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}

```

## Running Application
``` java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        // Implement menu-driven interface here
    }
}

```