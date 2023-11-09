import java.util.Scanner;

public class referencearray {
    static void printarray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printarray(arr);
        System.out.println("copied array");
        int [] arr_1 = arr; // Copied Array (Same memory Same Address, so if we change original array copied array will also be changed).
        printarray(arr_1);
        sc.close();
    }
}