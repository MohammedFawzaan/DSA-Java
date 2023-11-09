import java.util.Scanner;
// creating ans array.
public class frequencyarray {
    static int[] makingfrequency(int[] a) {
        int[] freq = new int[100005];
        for(int i=0;i<a.length;i++) {
            freq[a[i]]++;
        }
        return freq;
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
        System.out.print("enter q :");
        int q = input.nextInt();

        int[] freq = makingfrequency(a);
   
        while(q>0) {
            System.out.print("enter the no to be searched : ");
            int x = input.nextInt();
            q--;
            if(freq[x]>0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        input.close();
    }
}