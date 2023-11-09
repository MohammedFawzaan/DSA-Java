import java.util.Scanner;
// creating ans array.
public class RotateArray {
    private static int[] array(int[] a, int k){
        int n = a.length;
        int ans[] = new int[n];
        k=k%n;
        int j=k;
        for(int i=0;i<a.length;i++){
            if(j!=n) {
                ans[j]=a[i];
                j++;
            }
            else{
                if(j==n)
                    j=0;
                ans[j]=a[i];
                j++;
            }
        }
        return ans;
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
        int ans[] = array(a,k);
        for(int i=0;i<a.length;i++) 
            System.out.print(" "+ans[i]);
        input.close();
    }
}