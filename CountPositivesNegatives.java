import java.util.Scanner;

public class CountPositivesNegatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int positiveCount = 0;
        int negativeCount = 0;
        
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }
        
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        
        scanner.close();
    }
}
