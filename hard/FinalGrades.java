import java.util.Scanner;

public class FinalGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        double[][] grades = new double[numStudents][3];
        double[] finalGrades = new double[numStudents];
        int passCount = 0;
        int failCount = 0;
        
        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grades for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                grades[i][j] = scanner.nextDouble();
            }
        }
        
        // Calculate final grades and count passes and fails
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grades[i][j];
            }
            finalGrades[i] = sum / 3;
            if (finalGrades[i] >= 60) { // Assuming 60 is the passing grade
                passCount++;
            } else {
                failCount++;
            }
        }
        
        // Output final grades and counts
        System.out.println("Final grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + finalGrades[i]);
        }
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);
        
        scanner.close();
    }
}
