import java.util.Scanner;

public class solution {
    public static String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        StringBuffer str = new StringBuffer();
        int i = a.length()-1;
        int j = b.length()-1;
        //i和j表示二进制最低位，也就是字符串的最后索引
        //加法运算时由低位向高位计算

        int cf = 0; //进位标志
        while (i >= 0 || j >= 0){
            if(i >=0 ){
                cf += a.charAt(i--) - '0';
            }//字符串a的i位值为1，cf就置为几；
            if(j >= 0){
                cf += b.charAt(j--) - '0';
            }
            str.append(cf % 2);  //逢2进1，将余数加到str字符串
            cf >>= 1;
        }
        String ret = str.reverse().toString();  //反转str
        return cf > 0 ? '1' + ret : ret;  //如果进为标志cf>0，就说明有进位，利用字符串拼接，将'1'置于最高位
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String ret = addBinary(a,b);
        System.out.println(ret);
    }
}
