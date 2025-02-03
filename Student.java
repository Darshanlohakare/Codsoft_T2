import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                System.out.print("Enter marks for subject " + i + " again: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

    
        double averagePercentage = (double) totalMarks / subjects;

        
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("\n===== Results =====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
