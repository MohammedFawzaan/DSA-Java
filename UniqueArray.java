public class UniqueArray
{
    private static int Unique(int[] a)
    {
        for(int i=0;i<a.length;i++) {
            for(int j=(i+1);j<a.length;j++) {
                if(a[i]==a[j]) {
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        for(int i=0;i<a.length;i++) {
            if(a[i]!=-1) 
                return a[i];
        }
        return 0;
    }
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,2,1};
        System.out.println("the unique value : "+Unique(a));
    }
}