package MutiplyMatrices;

import java.util.Scanner;
public class MultipleTwoMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c;

        System.out.println("Enter matrix1: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();
        System.out.println("Enter matrix2: ");
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
                b[i][j] = input.nextDouble();

        c = MutipleTwoMatricesMethod.multiplyMatrix(a,b);

        System.out.println("The matrices are added as follows");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(a[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print("  *  ");
                } else {
                    System.out.print("     ");
                }
            }
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(b[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" = ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < c[0].length; j++) {
                System.out.printf("%.1f ",c[i][j] );
            }
            System.out.println();
        }

    }
}

