class Factorial {
    public static void main(String[] args) {
        int n = 5; 
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
