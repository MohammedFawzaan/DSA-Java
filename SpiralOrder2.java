import java.util.Scanner;

public class SpiralOrder2 {
    static void printArray(int[][] c) {
        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[i].length;j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] spiral(int n) {
        int[][] a = new int[n][n];
        int Tr=0, Br=(n-1), Lc=0, Rc=(n-1), c=1;
        while(c<=n*n) {
            for(int j=Lc;j<=Rc && c<=n*n;j++) {
                a[Tr][j] = c++;
            }
            Tr++;
            for(int i=Tr;i<=Br && c<=n*n;i++) {
                a[i][Br] = c++;
            }
            Rc--;
            for(int j=Rc;j>=Lc && c<=n*n;j--) {
                a[Br][j] = c++;
            }
            Br--;
            for(int i=Br;i>=Tr && c<=n*n;i--){
                a[i][Lc] = c++;
            }
            Lc++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter n : ");
        int n = sc.nextInt();
        System.out.println();
        int[][] a = spiral(n);
        printArray(a);
        sc.close();
    }
}