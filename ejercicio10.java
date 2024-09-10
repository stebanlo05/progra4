class ArithmeticSeries {
    public static void main(String[] args) {
        int n = 5; 
        int a = 2; 
        int d = 3; 
        int sum = sumArithmeticSeries(n, a, d);
        System.out.println("Sum of the first " + n + " terms: " + sum);
    }

    static int sumArithmeticSeries(int n, int a, int d) {
        return n * (2 * a + (n - 1) * d) / 2;
    }
}
