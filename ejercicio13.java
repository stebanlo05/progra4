class PerfectNumber {
    public static void main(String[] args) {
        int n = 78; 
        boolean isPerfect = isPerfectNumber(n);
        System.out.println(n + " is a perfect number: " + isPerfect);
    }

    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
