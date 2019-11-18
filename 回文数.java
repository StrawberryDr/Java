import java.util.Scanner;

public class TestDemo {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x >= 0 && x < 10){
            return true;
        }
        int ret = reverse(x);
        if(ret == x){
            return true;
        }else {
            return false;
        }
    }
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
        int number = sc.nextInt();
        boolean ret = isPalindrome(number);
        System.out.println(ret);
    }
}
