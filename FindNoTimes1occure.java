public class FindNoTimes1occure {
    public static void main(String[] args) {
        int[] a = {0,0,1,0,1,1,1,0,1,1};
        int n = a.length;
        int i = 0;
        int count = 0;
        int temp;     // to store count value each time it is repeated.
        for(i=0;i<n;i++) {
            temp = 0;     // temp value restored at 0 again.
            while(a[i]>0) {
                temp++;
                i++;
                if(i==n)
                    break;
            }
            if(count < temp )   // store temp value in count if its is repeated.
                count = temp;
        }
        System.out.println(count);
    }
}