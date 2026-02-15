package DSA_MASTER_IN_JAVA.Basic_Of_DSA;

public class TypeCasting {
     public static void main(String[] args) {
          // char data type => It contains only single char inside a single curly braces
          char ch1 = 'A';
          System.out.println("A starts form = "+(int)ch1+" to Z = "+(int)(ch1+25));
          char ch2 = 'a';
          System.out.println("a starts form = "+(int)ch2+" to z = "+(int)(ch2+25));


          // Type Casting with ascii value
          int asci1 = ch1; // implicit type casting
          System.out.println(asci1);

          char myChar = 'G';//71
          int myCharVal = (int)myChar;
          System.out.println(myCharVal);

          char myChar2 = 'g'; // 103
          int myCharVal2 = (int)myChar2;
          System.out.println(myCharVal2);


          char zero = '0';
          int zeroChar = (int)zero;
          System.out.println("0 starts form = "+(int)zeroChar+" to 9 = "+(int)(zeroChar+9)); // '0' = 48 and '9'= 57

          /*
          Notes

          1. A -> (ascii value of capital alphabets starts from ) => 65
          and add (+25) to reach Z (90)

          2. a -> (ascii value of small alphabets starts from ) => 97
          and add (+25) to reach z (122)

          3. '0' -> (ascii value of numeric characters starts from ) => 48
          and add (+9) to reach 9 (57)
           */

          
     }
}
