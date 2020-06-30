package Fibonacci;

import java.util.Scanner;

public class Main {
    public static int countStep(int n){
        int temp = 0;
        int afterNum = 0;//记录出现的第一个大于n的斐波那契数
        while (temp >= 0){
            if(Fibonacci(temp) >= n){
                //出现了比n大的第一个斐波那契数
                afterNum = Fibonacci(temp); //num1保存比n大的第一个斐波那契数
                break;//结束循环
            }else {
                temp++;
            }
        }
        int priorNum = Fibonacci(temp-1);//得到afterNum前一个斐波那契数
        return calculate(Math.abs(priorNum-n),Math.abs(afterNum-n));
    }
    private static int Fibonacci(int n){
        //计算斐波那契数
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
    private static int calculate(int num,int n){
        //计算差值，返回小的一个
        if (num - n >= 0) {
            return n;
        }else {
            return num;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countStep(n));
    }
}
