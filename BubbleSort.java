import java.util.Scanner;

public class BubbleSort {
    public static void print(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = s.nextInt();
        System.out.print("enter array ");
        int [] a = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++) {
            for(int j=1;j<(n-i);j++) {
                if(a[j-1]>a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        print(a);
        s.close();
    }
}