class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5; 
        generateTable(n);
    }

    static void generateTable(int n) {
        for (int i = 1; i <= 18; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
