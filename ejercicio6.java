class FibonacciSequence {
    public static void main(String[] args) {
        int n = 5; 
        generateFibonacci(n);
    }

    static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
