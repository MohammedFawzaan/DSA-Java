import java.util.Scanner;

public class rotatePractice {
    private static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] a = {1,2,3,4,5};
        System.out.print("enter k:");
        int k = sc.nextInt();
        int[] ans = new int[n];
        for(int i=0;i<a.length;i++) {
            if( i<k ) {
                ans[i] = a[n+i-k];
            } else {
                ans[i] = a[i-k];
            }
        }
        printArray(ans);
        sc.close();
    }
}