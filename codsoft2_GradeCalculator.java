import java.util.Scanner;

public class codsoft2_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
	System.out.println("The marks should be between 0 to 100.");
        
        for (int i = 0; i < numberOfSubjects; i++) {
            int mark;
            do {
                System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
                mark = scanner.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid input. Marks should be between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);
            
            marks[i] = mark;
            totalMarks += marks[i];
        }
        
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        char grade;
        
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
