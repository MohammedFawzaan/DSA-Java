public class ReverseArray 
{ // by creating new array.
    private static int[] reverse(int a[])
    {
        int n = a.length;
        int[] ans = new int[n];
        int j=0;
        for(int i=(n-1);i>=0;i--) {
            ans[j++]=a[i];
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int a[] = {5,4,6,8,9};
        int ans[] = reverse(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(" "+ans[i]);
        }
    }
}