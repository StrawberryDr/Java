import java.util.Scanner;

public class solution {
    public static int pivotIndex(int[] nums) {
        if(nums.length == 0){
            return -1;
        }//数组长度为0，直接返回-1
        int sum = 0;
        int sumLeft = 0;//某位置左侧的和
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }//计算数组总和
        for(int i = 0;i < nums.length;i++){
            if(sumLeft * 2 + nums[i] == sum){
                return i;
            }//如果sumLeft的2倍+i位置的数字 = sum，就说明i为中心索引
            sumLeft += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[6];
        for(int i = 0; i< 6;i++){
            nums[i] = scanner.nextInt();
        }
        int ret = pivotIndex(nums);
        System.out.println(ret);
    }
}
