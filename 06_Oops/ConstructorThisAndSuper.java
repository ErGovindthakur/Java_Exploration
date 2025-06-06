// parent class
class Employee{
     String name;
     double salary;

     // constructor name is same as class name
     Employee(String name, double salary){
          this.name = name;
          this.salary = salary;
          System.out.println("Employee constructor is called");
     }

     // creating method to display the list of details
     void display(){
          System.out.println(name+ " the salary is "+ salary);
     }
}

// child class
class Manager extends Employee{
     String department;

     Manager(String name, double salary, String department){
          super(name, salary); // called parent constructor(Employee)
          this.department = department;
          System.out.println("Manager constructor called");
     };

     @Override
     void display(){
          super.display();
          System.out.println("Department -: "+department);
     }
}
public class ConstructorThisAndSuper {
     public static void main(String[] args) {
          // creating instance of parent class
          Manager manager = new Manager("Govind", 90000, "Software-Development");

          manager.display();
     }
}
