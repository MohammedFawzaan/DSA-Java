import java.util.Scanner;

public class PascalsTriangle 
{
    static void printArray(int[][] c) {
        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[i].length;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n) {
        int[][] a = new int[n][];
        for(int i=0;i<n;i++) {
            a[i] = new int[i+1];
            a[i][0] = a[i][i] = 1;
            for(int j=1;j<i;j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = input.nextInt();
        int[][] a =  pascal(n);
        printArray(a);
        input.close();
    }
}