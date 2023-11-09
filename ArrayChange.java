public class ArrayChange {
    public static void change(int[] a) {
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        return;
    }
    // value of given array changes do not follow pass by value.
    public static void main(String[] args) {
        int[] a = {1,2,3};
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        change(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}