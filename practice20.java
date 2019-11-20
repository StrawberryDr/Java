//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

import java.util.Scanner;

public class TestDemo {
    public static int reverse(int x) {
        int tmp = 0;
        while (x != 0){
            int newTmp = tmp*10 + x%10;
            if((newTmp - x%10)/10 != tmp){
                return 0;
            }
            tmp = newTmp;
            x = x /10;
        }
        return tmp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ret = reverse(x);
        System.out.println(ret);
    }
}
