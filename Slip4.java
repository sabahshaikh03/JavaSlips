/*
  Write a program to print an array after changing the rows and columns of a given
 two-dimensional array. (transpose)
*/

public class Slip4 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int mat[][] = new int[rows][columns];

        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[1][0] = 4;
        mat[1][1] = 5;
        mat[1][2] = 6;
        mat[2][0] = 7;
        mat[2][1] = 8;
        mat[2][2] = 9;

        int trans[][] = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        System.out.println("Original matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(trans[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
