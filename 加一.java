import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }//从后往前遍历，最后一位不为9则直接+1后返回数组
            digits[i] = 0;
        }//判断数组各个位置是否为9,为9则置0；
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;  //全部为9则数组扩容为原来长度+1；并且将0号位置置为1，其余位置为0不变。
        return temp;
    }
//    public static int[] plusOne(int[] digits) {
//        int[] nums = Arrays.copyOf(digits,digits.length*2);
//        if(digits == null){
//            return null;
//        }
//        int len = digits.length-1;
//        nums[len] += 1;
//        if(len == 0){
//            while (nums[len] > 9){
//                nums[len+1] = nums[len] % 10;
//                nums[len] /= 10;
//            }
//            return nums;
//        }
//        while (nums[len] > 9 && len >= 0){
//            nums[len] %= 10;
//            nums[len-1] += 1;
//            len --;
//        }
//        return nums;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] digits = new int[4];
        for(int i = 0;i < 4;i++){
            digits[i] = scanner.nextInt();
        }
        digits = plusOne(digits);
        for(int x : digits){
            System.out.print(x);
        }
    }
}
