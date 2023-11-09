public class DEMO {
    public static void main(String[] args) {
        int r, sum=0;
        int n = 38;
        // int a = sum;
        while(n>10) 
        {
            while(n>0) {
                r = n%10;
                sum = r + sum;
                n = n/10;
            }
            int a=sum;
            n = a;
        }
        System.out.println(sum);
    }
} 