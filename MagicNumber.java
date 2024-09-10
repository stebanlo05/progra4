import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        boolean isMagic = isMagicNumber(n);
        if (isMagic) {
            System.out.println(n + " is a magic number.");
        } else {
            System.out.println(n + " is not a magic number.");
        }
        
        scanner.close();
    }

    static boolean isMagicNumber(int n) {
        int sum = n;
        while (sum >= 10) {
            sum = sumOfDigits(sum);
        }
        return sum == 1;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
