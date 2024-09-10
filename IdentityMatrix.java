import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the identity matrix: ");
        int n = scanner.nextInt();
        
        int[][] identityMatrix = generateIdentityMatrix(n);
        printMatrix(identityMatrix);
        
        scanner.close();
    }

    static int[][] generateIdentityMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
