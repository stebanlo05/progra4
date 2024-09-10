class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345; 
        int sum = sumDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);
    }

    static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
