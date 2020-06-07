import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int getValue(int[] gifts, int n) {
        // write code here
        int len = n/2;
        //如果一个红包金额出现次数超过了总次数的一半
        //将红包金额按顺序排序之后:
        //   如果存在这个金额，一定会出现在最中间的位置
        //   如果不存在，返回0
        //所以要对中间金额的出现次数进行判断：
        //   如果中间金额的次数 > n/2：则说明存在这个金额，返回该中间金额
        //   如果中间金额的次数 <= n/2：不存在这个金额，返回0
        Arrays.sort(gifts);  //将红包金额排序
        int count = 0;
        for(int i = 0;i < n;i++){
            if(gifts[i] == gifts[len]){
                count++;
            }
        }
        if(count > len){
            return gifts[n/2];
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] redPacket = new int[n];
        for(int i = 0;i < n;i++){
            redPacket[i] = sc.nextInt();
        }
        System.out.println(getValue(redPacket,n));
    }
}
