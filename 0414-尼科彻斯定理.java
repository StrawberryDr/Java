import java.util.Scanner;

public class Main {
    // 关键是要确定第一个数为多少
    // 之后的的m-1个数字只用依次+2即可

    // m为偶数：连续奇数的第一个为 m*m-2(m/2)+1
    // m位奇数：连续奇数的第一个为 m*m-2(m/2)

    //public static String GetSequeOddNum(int m){
    // 因为要用指定接口实现，需要用对象调用
    public String GetSequeOddNum(int m){
        String ret = ""; //返回值为String，所以用ret接收值
        int first = 0;
        if(m % 2 != 0){
            //为奇数
            first = m*m - 2*(m/2);
        }else {
            //为偶数
            first = m*m - 2*(m/2) + 1;
        }
        ret += first; //记录第一个数
        //之后的数字分别+2
        for(int i = 1;i < m;i++){
            //first + 2 * i：是第几个就在第一个奇数的基础上+几个2
            ret += "+" + (first + 2 * i);
        }
        return ret;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            System.out.println(main.GetSequeOddNum(m));
        }
    }
}
