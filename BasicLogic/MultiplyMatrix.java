
import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows for Matrix A: ");
        int row = sc.nextInt();
        System.out.println("Enter column for Matrix A (rows for B): ");
        int col1 = sc.nextInt();
        System.out.println("Enter rows for Matrix A: ");
        int col2 = sc.nextInt();
        
        int[][] A = new int[row][col1];
        int[][] B = new int[col1][col2];
        int[][] C = new int[row][col2];

        // Input for A
        System.out.println("Enter elements for A: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input of B
        System.out.println("Enter elements for B: ");
        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < col2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        // Multiplication of A and B
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    C[i][j] *= A[i][k] + B[k][j];
                }
            }
        }
        // Display
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
