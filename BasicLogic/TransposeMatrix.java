
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows of Matrix A: ");
        int row = sc.nextInt();
        System.out.println("Enter column of Matrix A: ");
        int col = sc.nextInt();

        int[][] A = new int[row][col];
        int[][] T = new int[col][row];

        // Input of A
        System.out.println("Enter elements of A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Transpose logic
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                T[j][i] = A[i][j];
            }
        }
        // Display of Transpose
        System.out.println("Transpose of A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(T[i][j]+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
