/*
1、产生一个随机数
2、输入猜的数字
3、比较
    猜大了；
    猜小了；
    猜对了；
4、多次机会，猜中就结束
    while循环，猜中break；
*/


import java.util.Scanner;

public class guessNember {
    public static void main(String[] args){
        //产生随机数
        int number = (int)(Math.random()*100+1);

        while (true) {
            //输入数据
            System.out.println("请输入1-100的的数字：");
            Scanner sc = new Scanner(System.in) ;
            int guessNumber = sc.nextInt();
            //比较
            if (guessNumber > number) {
                System.out.println("你猜大了");
            } else if (guessNumber < number) {
                System.out.println("你猜小了");
            } else {
                System.out.println("猜对了");
            }
        }
    }
}
