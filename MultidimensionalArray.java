import java.util.Scanner;

public class MultidimensionalArray{
    static void printArray(int[][] a) {
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r : ");
        int r = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        printArray(a);
        System.out.println();
        printArray(arr);
        sc.close();    
    }
}