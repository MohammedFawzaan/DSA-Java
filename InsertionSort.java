public class InsertionSort {
    static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {7,2,91,77,3};
        for(int i=1;i<a.length;i++) {
            int j=i;
            while(j>0 && a[j]<a[j-1] ) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    j--;
            }
        }
        printArray(a);
    }
}