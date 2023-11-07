/*
  Write a program to accept the two dimensional array from user and display sum of its diagonal
    elements.
*/

import java.util.Scanner;

public class Slip19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions (mXn): ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m == n) {
            int sum = 0;
            int matrix[][] = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("Enter the %d %d number : ", i + 1, j + 1);
                    matrix[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < m; i++) {
                sum += matrix[i][i];
            }

            System.out.println("Diagonal matrix : " + sum);
        } else {
            System.out.println("Entered matrix is not a square matrix");
        }

        sc.close();
    }
}
