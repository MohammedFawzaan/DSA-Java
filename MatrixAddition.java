import java.util.Scanner;

public class MatrixAddition 
{
    static void matrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if( r1!=r2 || c1!=c2 ) {
            System.out.println("wrong input");
        }
        int[][] c = new int[r1][c1];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c1;j++) {
                c[i][j] = a[i][j] + b[i][j];
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
            for(int j=0;j<c2;j++) {
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
        matrix(a,r1,c1,b,r2,c2);

        input.close();   
    }
}