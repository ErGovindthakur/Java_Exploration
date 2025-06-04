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

## Object-Oriented Programming (OOP)
Classes and Objects

``` java
public class Car {
    String model;
    int year;

    public void drive() {
        System.out.println("Driving " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Toyota";
        car.year = 2020;
        car.drive();
    }
}

```

## Inheritance
``` java
public class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}

public class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
}

```

## Polymorphism

``` java
Vehicle myVehicle = new Bike();
myVehicle.start(); // Outputs "Bike started"

```

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