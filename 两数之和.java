import java.util.Scanner;

public class solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] target = new int[]{3};
        int[] ret = twoSum(target,6);
        for(int x : ret){
            System.out.print(x);
        }
    }
}
