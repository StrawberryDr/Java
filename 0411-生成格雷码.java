import java.lang.*;
import java.util.Scanner;

public class Main {
    //n位格雷码共有2^n个
    //以0开头和以1开头的格雷码各占一半
    //格雷码除去最高位之后，剩余的部分左边和右边是对称的
    //对称形式：最左边是ABC，最右边是CBA
    public static String[] getGray(int n) {
        // write code here
        int count = (int)Math.pow(2,n);
        String[] ret = new String[count];
        if(n == 1){
            //如果n为1，则只有两种可能
            ret = new String[]{"0","1"};
        }else {
            String[] temp = getGray(n-1);
            ret = new String[2 * temp.length];
            for(int i = 0;i < temp.length;i++){
                ret[i] = "0" + temp[i];
                ret[ret.length -1 -i] = "1" + temp[i];
            }
        }
        return ret;
    }

//    public static StringBuffer[] get_gray(int n){
//        int count = (int)Math.pow(2,n);  //先计算共有多少个格雷码
//        //考虑到要进行插入删除等操作，利用StringBuffer更容易操作
//        StringBuffer[] gray = new StringBuffer[count];
//        if(n == 1){
//            //如果n为1，则只有两种可能
//            gray[0] = new StringBuffer("0");
//            gray[1] = new StringBuffer("1");
//        }else {
//            StringBuffer[] temp = get_gray(n - 1);
//            for (int i = 0; i < count; i++) {
//                //判断最高位为0还是1
//                //如果i<count/2，即在前半部分，最高位为0；
//                //如果i>count/2，即在后半部分，最高位为1；
//                if(i < count/2){
//                    gray[i] = new StringBuffer((temp[i]));
//                    gray[i].insert(0,"0");
//                }else {
//                    gray[i] = new StringBuffer((temp[count-1-i]));
//                    gray[i].insert(0,"1");
//                }
//            }
//        }
//        return gray;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
