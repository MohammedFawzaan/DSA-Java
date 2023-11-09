import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<a.length;i++) {
            a[i] = sc.nextInt(); 
        }
        System.out.print("enter target value ");
        int x = sc.nextInt();
        for(int i=0;i<a.length;i++) {
            if(a[i] == x) {
                System.out.print("Element present at " + (i+1) + " Position");
            }
        }
        sc.close();
    }
}