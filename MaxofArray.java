public class MaxofArray {
    static void max() {
        int[] a = {5,8,9,1,344,35};
        int ans = a[0];
        int c = 0 ;
        for(int i=0;i<a.length;i++) {
            if(a[i]<ans) {
            ans=a[i];
            c++;
            System.out.println("index of min = " + a[c]);
            break;
            }
        }
        System.out.println();
        System.out.println("Min="+ans);
    }
    public static void main(String[] args) {
        max();
    }
}