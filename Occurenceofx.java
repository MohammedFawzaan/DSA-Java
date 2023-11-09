import java.util.Scanner;

public class Occurenceofx {
    static int lastoccurence(int[] a,int x){
        for(int i=(a.length-1);i>0;i--) {
            if(a[i]==x) {
               System.out.println(i);
               break;
            }
        }
        return 0;
    }
    static int occurence(int[] a, int x) {
        int c=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==x)
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int a[] = {5,1,6,5,5,9,8,8,7,5,7,9,90};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x:");
        int x = sc.nextInt();
        System.out.println("occurence of "+x+"in this array is = "+occurence(a, x));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(lastoccurence(a, x));
        sc.close();
    }
}