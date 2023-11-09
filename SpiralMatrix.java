import java.util.Scanner;

public class SpiralMatrix {
    static void spiral(int[][] a, int r, int c){
        int Tr=0, Br=(r-1), Lc=0, Rc=(c-1),n=0;
        while(n<r*c) {
            for(int j=Lc;j<=Rc && n<(r*c);j++) {
                System.out.print(a[Tr][j] + " ");
                n++;
            }
            Tr++;
            for(int i=Tr;i<=Br && n<(r*c);i++) {
                System.out.print(a[i][Br] + " ");
                n++;
            }
            Rc--;
            for(int j=Rc;j>=Lc && n<(r*c);j--) {
                System.out.print(a[Br][j]+" ");
                n++;
            }
            Br--;
            for(int i=Br;i>=Tr && n<(r*c);i--){
                System.out.print(a[i][Lc] + " ");
                n++;
            }
            Lc++;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter rows");
        int r = sc.nextInt();
        System.out.print("enter column");
        int c = sc.nextInt();
        System.out.println("enter input : ");
        int [][] a = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        spiral(a,r,c);
        sc.close();
    }
}