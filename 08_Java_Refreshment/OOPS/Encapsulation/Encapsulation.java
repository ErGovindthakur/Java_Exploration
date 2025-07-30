public class Encapsulation {
     public static void main(String[] args) {
          // creating an instance (object) to get and set name

          InnerEncapsulation inCap = new InnerEncapsulation();

          inCap.setName("Govinda");
          System.out.println(inCap.getName());
     }
}

// Exploring encapsulation => It's something like wrapping up some piece of credential code into a single unit , so that they can't be access , modify and delete directly

class InnerEncapsulation {
     private String myName = "Govind";

     // creating a setter method to set the name
     public void setName(String name){
          myName = name;
     }
     // creating a getter method to get name
     public String getName(){
          return myName;
     }
}
