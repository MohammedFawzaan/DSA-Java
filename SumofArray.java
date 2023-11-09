public class SumofArray { 
    static void SumArray() {
        int[] arr = {1,3,5};
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    static void Array2(){
        int[] arr = {1,9,5};
        int sum=0;
        for(int i=0;i<arr.length;i++) {
                sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
    SumArray();
    Array2();
    }
}