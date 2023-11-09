import java.util.Scanner;
public class PrefixSum_Array {
    static void printArray(int[] ans){
        int n = ans.length;
        for(int i=0;i<n;i++) {
            System.out.print(ans[i]+" ");
        }
    } // By creating new array.
    static int[] Prefix(int[] a){
        int[] prefix = new int[a.length];
        int i=1;
        prefix[0]=a[0];
        while(i<a.length) {
            prefix[i] = prefix[i-1] + a[i];
            i++;
        }
        return prefix;
    } // Without creating new array.
    static int[] Prefix1(int[] a) {
        int i=1;
        while(i<a.length) {
            a[i]=a[i-1]+a[i];
            i++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = input.nextInt();
        System.out.print("enter array : ");
        int a[] = new int[n];
        for(int o=0;o<a.length;o++) {
            a[o]=input.nextInt(); } 
        Prefix1(a);
        // int[] prefix = Prefix(a);
        printArray(a);
        input.close();
    }
}