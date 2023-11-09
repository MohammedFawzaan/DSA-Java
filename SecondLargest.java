import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter n : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int max1,max2;
        max1=max2=0;
        for(int j=0;j<n;j++) {
            if(a[j]>max1) {
                max2=max1;
                max1=a[j];
            } else if(a[j]>max2 && a[j]<max1) {
                max2 = a[j];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        sc.close();
        }
}