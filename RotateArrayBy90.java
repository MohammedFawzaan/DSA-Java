import java.util.Scanner;

public class RotateArrayBy90 {
    
    static void printArray(int[][] c) {
        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[i].length;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] a, int r, int c) {
        int[][] ans = new int[c][r];
        for(int i=0;i<c;i++) {
            for(int j=0;j<r;j++) {
                ans[i][j] = a[j][i];
            }
        }
        return reverse(ans,r,c);
    }
    static int[][] reverse(int[][] a, int r, int c) {
        int[][] ans = new int [r][c];
        for(int i=0;i<r;i++) {
            for(int j=0,k=(c-1);j<c;j++,k--) {
                    ans[i][j] = a[i][k];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter rows : ");
        int r = input.nextInt();
        System.out.print("enter column : ");
        int c = input.nextInt();
        int[][] a = new int[r][c];
        System.out.println("enter array elements : ");
        for(int i=0 ; i<r;i++) {
            for(int j=0;j<c; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("the Rotate of matrix is : ");
        int[][] ans = transpose(a,r,c);
        printArray(ans);
        input.close();
    }
}