import java.util.Scanner;

public class PrefixSum_Array3 {
    static void printArray(int[] ans){
        int n = ans.length;
        for(int i=0;i<n;i++) {
            System.out.print(ans[i]+" ");
        }
    }
    static int[] Prefix(int[] a){
        int[] prefix = new int[a.length];
        int i=1;
        prefix[0]=a[0];
        while(i<a.length) {
            prefix[i] = prefix[i-1] + a[i];
            i++;
        }
        return prefix;
    }
    static int[] Suffix(int[] a) {
        int n = a.length;
        int[] suffix = new int[n];
        suffix[n-1]=a[n-1];
        for(int i=(n-2); i>=0; i--) {
            suffix[i]=suffix[i+1]+a[i];
        }
        return suffix;
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
        int[] prefix = Prefix(a);
        int[] suffix = Suffix(a);
        // printArray(suffix);
        // System.out.println();
        // printArray(prefix);
        int count = 0;
        for(int i=0; i<(a.length-1); i++) {
            if(prefix[i]==suffix[i+1]){
                count++;
                break;
            } 
        }
        if(count==1) 
            System.out.println("YES");
        else 
            System.out.println("NO");
        input.close();
    }
}