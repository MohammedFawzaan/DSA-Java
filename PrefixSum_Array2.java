import java.util.Scanner;

public class PrefixSum_Array2
{
    static int[] Prefix1(int[] a) 
    {
        int i=1;
        while(i<a.length) {
            a[i]=a[i-1]+a[i];
            i++;
        }
        return a;
    }
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System. in);
		System.out.print("enter n = ");
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=0;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("enter q = ");
		int q = sc.nextInt();
		int[] prefix = Prefix1(a);
		while(q-->0) {
			System.out.print("enter l = ");
			int l = sc.nextInt();
			System.out.print("enter r = ");
			int r = sc.nextInt();
			int ans = ( prefix[r] - prefix[l-1] );
			System.out.print("The Sum Between " + l + " and " + r + " index = " + ans );
            System.out.println();
		}
		sc.close();
	}
}   