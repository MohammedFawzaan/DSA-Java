import java.util.Scanner;

public class Sortarraycontaining01 {
    static void sort(int[] a) {
        int z=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==0)
            z++;
        }
        for(int i=0;i<(a.length-1);i++) {
            if(i<z){
                a[i]=0;
            } else {
                a[i]=1;
            }
        }
    }
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void printArray(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
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
        // sort(a);
        // System.out.print("SORTED ARRAY : ");
        // printArray(a);
        int i=0;
        int j=(a.length-1);
        while(i<j) {
            if(a[i]==1 && a[j]==0) 
                swap(a,i,j);
            i++;
            j--;
            if(a[i]==0 && a[j]==1){
                i++;
                j--;
            }
        }
        System.out.print("SORTED ARRAY : ");
        printArray(a);
        input.close();
    }
}