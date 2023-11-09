public class FirstRepeatingValue
{
    static int method(int a[])
    {   
        int b=-1;
        for(int i=0;i<a.length;i++) {
            for(int j=(i+1);j<a.length;j++) {
                if(a[i]==a[j]) 
                    return a[i];
            }
        }
        return b;
    }
    public static void main(String[] args) 
    {
        int a[] = {2,3,4,5,6,5,4};
        System.out.println("The First Repeating value is : "+method(a));
    }
}