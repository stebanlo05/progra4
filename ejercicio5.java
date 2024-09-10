class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345; 
        int reversed = reverseDigits(n);
        System.out.println("Reversed number: " + reversed);
    }

    static int reverseDigits(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
