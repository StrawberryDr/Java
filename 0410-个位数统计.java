import java.util.Scanner;

public class Main {
    public static void printResult(String str){
        //用数组进行个位数子个数统计，0下标就表示对应的数字
        //例如：0的个数就统计在0号下标
        int[] ret = new int[10];  //保存个位数子：0-9，10个空间即可
        for(int i = 0;i < str.length();i++){
            ret[str.charAt(i)-'0']++;  //将字符转换成数字
        }

        //对统计数组进行遍历
        //如果m位不为0，就说明数字m统计在输入数字中出现
        //然后将m位输出即可
        for(int m = 0;m < ret.length;m++){
            if(ret[m] != 0){
                System.out.println(m + ":" + ret[m]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printResult(str);
    }
}
