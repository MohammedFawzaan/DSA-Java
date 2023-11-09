import java.util.Scanner;

public class twosum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("enter array ");
        for(int i=0;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("enter target : ");
        int target = sc.nextInt();
        for(int i=0;i<(nums.length);i++) {
            for(int j=i+1;j<(nums.length);j++) {
                if(nums[i]+nums[j]==target) {
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
        sc.close();
    }
}