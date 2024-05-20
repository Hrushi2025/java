/*
 * get marks for a student and print grade (if < 30, fail, <50 third class, 
 * <60 second class, <70 first class, >=70 distinction, =100 then gold medal
 */
import java.util.Scanner;

public class conditional_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained by the student: ");
        int marks = scanner.nextInt();

        String grade;
        if (marks < 30) {
            grade = "Fail";
        } else if (marks < 50) {
            grade = "Third class";
        } else if (marks < 60) {
            grade = "Second class";
        } else if (marks < 70) {
            grade = "First class";
        } else if (marks < 100) {
            grade = "Distinction";
        } else {
            grade = "Gold Medal";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
