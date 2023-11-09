public class Solution {
    static void printArray(int[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if( i<k ) {
                ans[i] = nums[(nums.length)+i-k];
            } else {
                ans[i] = nums[i-k];
            }
        }
        printArray(ans);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7};
        // System.out.print("enter k:");
        int k = 2;
        rotate(nums,k);
        // sc.close();
    }
}
