import java.util.Scanner;

public class BinarySearch {
    static void binary(int[] a,int target, int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==a[mid]) {
                System.out.print("found at "+ mid);
                break;
            } else if(target<=a[mid]) {
                end = mid-1;  
            } else if(target>=a[mid]) {
                start = mid+1;
            } else {
                System.out.print("not found");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        System.out.print("enter array : ");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt(); }
        System.out.print("enter target : ");
        int target = sc.nextInt();
        binary(a,target,n);
        sc.close();
    }
}