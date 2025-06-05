
// creating a basic class in java taking example of "Book"

class Book{
     String bookTitle ;
     String bookAuthor ;

     // method to access class props
     void displayData(){
          System.out.println(bookTitle+ " is written by "+ bookAuthor);
     }
}

public class ClassAndObject {
   public static void main(String[] args) {
     
     // creating instance of above book class
     Book myBook = new Book();
     myBook.bookAuthor = "Govind";
     myBook.bookTitle = "Java Basics";

     // invoking method here
     myBook.displayData();
   }  
}
