import java.util.Scanner;

public class TestDemo {
    public static int[] rotate(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] ret = rotate(nums,3);
        for(int i =0;i < ret.length;i++){
            System.out.print(ret[i]);
        }
    }
}
