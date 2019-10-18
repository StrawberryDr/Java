public class TestDemo1 {
    /**
    *sout:System.out.println(un(5));
    */
//    public static int Hanoi(int n){
//
//    }

//青蛙跳台阶
    public static int ForgJump(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        return ForgJump(n-1) + ForgJump(n-2);
    }


//斐波那契数列
//递归：
    public static  int Fib1(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return Fib1(n-1)+Fib1(n-2);
    }
//非递归：
    public static int Fib2(int n){
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        if(n == 1 || n == 2){
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }

//整数的各位数字之和：
    public static int SumNum(int num){
        if(num < 10) {
            return num;
        }
        return (num % 10)+SumNum(num/10);
    }

//按序输出整数的每一位数字：
    public static void Print(int number){
        if(number > 9){
            Print (number/10);
        }
        System.out.println(number%10);
    }

//求1+2+3+4+……n
    public static int Sum (int num){
        if(num == 1){
            return 1;
        }
        return num + Sum(num-1);
    }

//N的阶乘：
    public static int Fun(int n){
        if(n == 1){
            return 1;
        }
        return n * Fun(n-1);
    }

    public static void main(String[] args){
//        System.out.println(Fun(4));
//        System.out.println(Sum(4));
//        Print(1234);
//        System.out.println(SumNum(123));
//        System.out.println(Fib1(5));
//        System.out.println(Fib2(5));
        System.out.println(ForgJump(4));
    }
}
