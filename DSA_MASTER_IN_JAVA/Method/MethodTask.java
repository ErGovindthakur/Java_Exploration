package DSA_MASTER_IN_JAVA.Method;

class StudentUtils{
     static int totalMarks(int m1,int m2, int m3){
          return m1+m2+m3;
     }

     static double calculatePercentage(int total){
          return (total/300.0)*100;
     }

     String getGrade(double percentage){
          if(percentage>=90){
               return"A";
          }else if(percentage>=75){
               return"B";
          }else if(percentage>=60){
               return"C";
          }else{
               return"Fail";
          }
     }

     static void printResult(int total, double percentage, String grade){
          System.out.println("Total Marks -: "+total);
          System.out.println("Percentage : "+percentage);
          System.out.println("You got : "+grade);
     }
}    

public class MethodTask {
     public static void main(String[] args) {
     int total = StudentUtils.totalMarks(90, 87, 95);
     double percentage = StudentUtils.calculatePercentage(total);
     
     StudentUtils st = new StudentUtils();
     String grade = st.getGrade(percentage);

     StudentUtils.printResult(total,percentage,grade);
     }
}
