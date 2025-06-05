// Inheritance -> It is the process in which a child can access the properties and methods of parent class

class Student {
    String name;
    int age;

    void showStudentDetails() {
        System.out.println(name + " is " + age + " yrs old.");
    }
}

// Child class Library inherits from Student
class Library extends Student {
    String department;

    String bookData(String department, int age, String name) {
        this.age = age;
        this.name = name;
        this.department = department;

        if (age > 18) {
            return name + " is able to access books from the " + department + " department.";
        } else {
            return name + " is not allowed to access books from the " + department + " department.";
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating instance of parent class
        Student std = new Student();
        std.name = "Govind";
        std.age = 20;

        // Calling method from parent class
        std.showStudentDetails();

        // Creating instance of child class
        Library lib = new Library();
        // Calling child class method that uses inherited fields
        System.out.println(lib.bookData("Sexologist", std.age, std.name));
    }
}
