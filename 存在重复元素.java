import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j <nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for(int i = 0;i < 4;i++){
            nums[i] = scanner.nextInt();
        }
        boolean ret = containsDuplicate(nums);
        System.out.println(ret);
    }
}
