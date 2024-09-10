import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("The number of elements must be greater than zero.");
            return;
        }
        
        int[] numbers = new int[n];
        
        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int largest = numbers[0];
        int smallest = numbers[0];
        
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        
        scanner.close();
    }
}
