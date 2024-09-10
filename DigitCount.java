import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int digitCount = countDigits(n);
        System.out.println("The number of digits in " + n + " is: " + digitCount);
        
        scanner.close();
    }

    static int countDigits(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
