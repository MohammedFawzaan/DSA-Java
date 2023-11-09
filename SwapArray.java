import java.util.Scanner;

public class SwapArray
{ // inplace array.
    private static void swap(int[] a, int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
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
        int i=0,j=(n-1);
        while(i<=j) {
            swap(a,i,j);
            i++;
            j--;
        }
        for(int o=0;o<a.length;o++) {
            System.out.print(" " + a[o]);
        }
        input.close();
    }
}