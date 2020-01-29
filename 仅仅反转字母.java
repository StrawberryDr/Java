import java.util.Scanner;

public class solution {
    public static String reverseOnlyLetters(String S) {
        char[] ret = S.toCharArray();  //转换成字符数组
        int head = 0, low = ret.length-1;  //头尾双指针
        while(head<low) {
            while(head < low && !isletter(ret[head])) {
                head++;
            }//当前字符不是字母，head向后一个

            while(head < low && !isletter(ret[low])) {
                low--;
            }//当前字符不是字母，low向前一个

            //交换位置
            char ch = ret[head];
            ret[head] = ret[low];
            ret[low] = ch;

            head++;
            low--;
        }
        return new String(ret);
    }
    //判断字符是否为字母
    public static boolean isletter(char c) {
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String("ab-cd");
        String ret = reverseOnlyLetters(str);
        System.out.println(ret);
    }
}
