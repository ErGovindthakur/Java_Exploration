package DSA_MASTER_IN_JAVA.Loops.ForLoop;

import java.util.Scanner;

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Student count must be an integer.");
            sc.close();
            return;
        }

        int totalStudents = sc.nextInt();

        if (totalStudents <= 0) {
            System.out.println("Student count must be greater than zero.");
            sc.close();
            return;
        }

        int highestMarks = Integer.MIN_VALUE;
        int lowestMarks = Integer.MAX_VALUE;
        int totalMarks = 0;
        int passedStudents = 0;
        int failedStudents = 0;
        int processedStudents = 0;

        for (int i = 1; i <= totalStudents; i++) {

            System.out.print("Enter marks for student " + i + " (-1 to exit): ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear invalid input
                i--;       // retry same student
                continue;
            }

            int marks = sc.nextInt();

            if (marks == -1) {
                System.out.println("Program terminated early.");
                break;
            }

            if (marks < 0 || marks > 100) {
                System.out.println("Marks must be between 0 and 100.");
                i--; // retry same student
                continue;
            }

            processedStudents++;
            totalMarks += marks;

            if (marks >= 40) {
                passedStudents++;
            } else {
                failedStudents++;
            }

            highestMarks = Math.max(highestMarks, marks);
            lowestMarks = Math.min(lowestMarks, marks);
        }

        if (processedStudents == 0) {
            System.out.println("No valid student data entered.");
            sc.close();
            return;
        }

        double averageMarks = (double) totalMarks / processedStudents;

        System.out.println("\n===== STUDENT PERFORMANCE REPORT =====");
        System.out.println("Students Processed : " + processedStudents);
        System.out.println("Passed Students    : " + passedStudents);
        System.out.println("Failed Students    : " + failedStudents);
        System.out.println("Highest Marks      : " + highestMarks);
        System.out.println("Lowest Marks       : " + lowestMarks);
        System.out.println("Average Marks      : " + averageMarks);

        sc.close();
    }
}
