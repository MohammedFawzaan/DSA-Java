import java.util.Scanner;

public class MatrixMultiplication {
    static void printArray(int[][] c) {
        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[i].length;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter rows for a ");
        int r1 = input.nextInt();
        System.out.print("enter column for a ");
        int c1 = input.nextInt();
        System.out.print("enter rows for b ");
        int r2 = input.nextInt();
        System.out.print("enter column for b ");
        int c2 = input.nextInt();
        System.out.println("enter a elements");
        int[][] a = new int[r1][c1];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                a[i][j]= input.nextInt();
            } 
        }
        System.out.println("enter b elements");
        int[][] b = new int[r2][c2];
        for(int i=0;i<r2;i++) {
            for(int j=0;j<c2;j++) {
                b[i][j]= input.nextInt();
            }
        }
        int[][] c = new int[r2][c1];
        if( r2==c1 ) {
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c2;j++) {
                    for(int k=0;k<r2;k++) {
                        c[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
            System.out.println();
            printArray(c);
        } else {
            System.out.println("wrong input");
        }
        input.close();
    }
}