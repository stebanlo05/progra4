class SortThreeNumbers {
    public static void main(String[] args) {
        int a = 3; 
        int b = 1; 
        int c = 2;

        int[] sorted = sortNumbers(a, b, c);
        System.out.println("Sorted order: " + sorted[0] + ", " + sorted[1] + ", " + sorted[2]);
    }

    static int[] sortNumbers(int a, int b, int c) {
        int[] numbers = {a, b, c};
        java.util.Arrays.sort(numbers);
        return numbers;
    }
}
