class LCM {
    public static void main(String[] args) {
        int a = 12; 
        int b = 18;
        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
