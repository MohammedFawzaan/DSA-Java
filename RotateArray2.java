import java.util.Scanner;
// without creating ans array.
public class RotateArray2 
{
    private static void reverse(int[] a, int n, int i, int j) {
        while(i<=j) {
            swap(a,i++,j--);
        }
    }
    private static void swap(int[] a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    private static void rotate2(int[] a, int n, int k) {
        reverse(a,n,(n-k),(n-1));
        reverse(a,n,0,(n-k-1));
        reverse(a, n, 0 ,(n-1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = input.nextInt();
        System.out.print("enter array : ");
        int a[] = new int[n];
        for(int o=0;o<a.length;o++) {
            a[o]=input.nextInt();
        }
        System.out.print("enter k :");
        int k = input.nextInt();
        k=k%n;
        rotate2(a, n, k);
        for(int i=0;i<a.length;i++) 
            System.out.print(" "+a[i]);
        input.close();
    }
}