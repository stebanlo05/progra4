class BasicCalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5; 
        char operation = '*'; 

        int result = calculate(a, b, operation);
        System.out.println("Result: " + result);
    }

    static int calculate(int a, int b, char operation) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            default:
                System.out.println("Error: Invalid operation");
                return 0;
        }
    }
}
