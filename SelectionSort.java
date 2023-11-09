import java.util.Scanner;

public class SelectionSort {
    static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int[] Selection(int[] a, int n) {
        for(int i=0;i<(n);i++) {
        int minindex = i;
            for(int j=(i+1);j<(n);j++) {
                if(a[minindex]>a[j]) {
                    minindex = j;
                }
            }
            int temp = a[minindex];
            a[minindex] = a[i];
            a[i] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter n:");
        // int n = sc.nextInt();
        // System.out.print("enter array : ");
        // int[] a = new int[n];
        // for(int i=0;i<a.length;i++) {
        //     a[i] = sc.nextInt(); 
        // }  
        int n=9;
        int[] a = {7,5,4,1,3,34,21,73,0};
        int[] selection = Selection(a,n);
        printArray(selection);
        sc.close();
    }
}