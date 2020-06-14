import java.util.Scanner;

public class Main {
    //分母：人数的阶乘：n！
    //分子：拿不到自己名字的情况
//    public static void probNone(int n){
//        float ret = 0;
//        ret = (mol(n)/deno(n))*100;
//        System.out.println(String.format("%.2f",ret) + "%");
//    }

    //得到分子
    public static float mol(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }else {
            return (n-1)*(mol(n-1)+mol(n-2));
        }
    }

    //得到分母：n!
    public static float deno(int n){
        if(n == 0){
            return 1;
        }else {
            return n * deno(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int personNum = sc.nextInt();
            float ret = (mol(personNum)/deno(personNum))*100;
            System.out.println(String.format("%.2f",ret) + "%");
        }
    }
}
