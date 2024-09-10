import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        int sum = 0;
        
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        double average = (double) sum / n;
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}
