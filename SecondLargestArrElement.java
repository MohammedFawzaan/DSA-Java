public class SecondLargestArrElement {
    // V.Imp Program.
    public static void main(String[] args) {
        int a[] = {5,76,345,5234,12,4};
        int max1=0;
        int max2=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]>max1) {
                max2=max1;
                max1=a[i];
            } else if(a[i]>max2 && a[i]<max1) {
                max2 = a[i];
            }
        }
        System.out.println("largest"+max1);
        System.out.println("Sencond largest"+max2);
    }
}