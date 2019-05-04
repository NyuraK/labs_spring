package lab1;
/*
@author Me
@version 1.0
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting project");
        int i = 65999; //width = 32
        float f = 0.33333334f; //width = 32
        byte b = 120; //width = 8
        short s = 129; //width = 16
        char c = 'a'; //width = 8
        long l = 120; //width = 64
        double d = 0.3333333333333333; //width = 64
        boolean bool = true;
        System.out.println("This is int " + i);
        System.out.println("This is float " + f);
        System.out.println("This is double " + d);
        System.out.println("This is long " + l);
        System.out.println("This is char " + c);
        System.out.println("This is short " + s);
        System.out.println("This is byte " + b);
        System.out.println("This is boolean " + bool);

        //Упражнение 3.1
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
        System.out.println();
        //Упражнение 3.2
        long begin = new java.util.Date().getTime();
        long i3 = 0;
        while (i3 <= 100000000) {
            i3++;
        }
        long end = new java.util.Date().getTime();
        System.out.println("Perfomance " + (end - begin));

        int[] mas = {12, 43, 12, -65, 778, 123, 32, 76};
        System.out.print(max(mas));

        int [][] matrix = new int[3][3];
        for (int ii =0;ii<matrix.length;ii++){
            for (int j=0; j<matrix[ii].length;j++)
                matrix[ii][j]=(int)Math.round(Math.random()*10);
        }
        transport(matrix);
    }

    private static void transport(int [][] matrix) {
        System.out.println("Matrix before");
        printMatrix(matrix);
        for (int i=0; i< matrix.length;i++)
            for (int j=i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        System.out.println("Matrix after");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    private static int max(int[] mas) {
        int max = mas[0];
        for (int i = 1; i < mas.length; i++)
            if (max < mas[i])
                max = mas[i];
        return max;
    }
}