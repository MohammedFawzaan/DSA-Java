import java.util.Scanner;

public class Pairs {

    public static int threepair(int a[], int x) {
        int c=0;
        for(int i=0;i<a.length;i++) {
            for(int j=(i+1);j<a.length;j++){
                for(int k=(j+1);k<a.length;k++) {
                    if(a[i]+a[j]+a[k]==x)
                    c++;
                }
            }
        }
        return c;
    }
    public static int twopair(int a[], int x) {
        int c=0;
        for(int i=0;i<a.length;i++) {
            for(int j=(i+1);j<a.length;j++){
                if(a[i]+a[j]==x)
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length");
        int n = sc.nextInt();
        System.out.print("enter target value");
        int x = sc.nextInt();
        System.out.print("enter array:");
        int a[] = new int[n];
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("no of two pairs are = "+twopair(a,x));
        System.out.println("no of three pairs are = "+threepair(a,x));
        sc.close();
    }
}