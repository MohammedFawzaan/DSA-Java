public class SearchElementX {
    public static int Greater(int a[], int x) {
        int c=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]>x) 
            c++;
        }
        return c;
    }
    public static int Search(int[] a, int x) {
        int ans = -1;
        for(int i=0;i<a.length;i++) {
            if(a[i]==x)
            ans = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,5,3};
        int x=3;
        System.out.println("found at index = "+Search(a,x));
        System.out.println("elements greater than x = "+Greater(a,x));
    }
}