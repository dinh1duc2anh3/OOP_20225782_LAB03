package hust.soict.ite6.oop.lab01;

import java.util.Scanner;

public class AddMatrix {
    public static void show(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t"); // Print elements of the matrix
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of rows : ");
        int n = sc.nextInt();
        System.out.print("NUmber of columns : ");
        int m = sc.nextInt();

        int[][] matrix_1 = new int[n][m];
        int[][] matrix_2 = new int[n][m];
        int[][] sum = new int[n][m];

        // Input first matrix
        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix_1[" + i + "][" + j + "]: ");
                matrix_1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix_2[" + i + "][" + j + "]: ");
                matrix_2[i][j] = sc.nextInt();
            }
        }

        // Matrix addition
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        // Print matrices
        System.out.println("first matrix:");
        show(matrix_1, n, m);
        System.out.println("second matrix:");
        show(matrix_2, n, m);
        System.out.println("added matrix:");
        show(sum, n, m);

        sc.close(); // Close the scanner
    }
}
