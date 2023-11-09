import java.util.Scanner;

public class SortedArrayorNot {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        System.out.print("enter array length:");
        int n = sc.nextInt();
        System.out.print("enter array : ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){ 
            a[i]=sc.nextInt();
        }
        for(int i=0;i<(a.length-1);i++) {
            if(a[i]>a[i+1]) {
                c = false;
                break;
            }
        }
        if(c==true) 
            System.out.println("Array is Sorted");
        else
            System.out.println("array is not sorted");
        sc.close();
    }
}