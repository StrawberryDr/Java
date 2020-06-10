import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入计算类型：");
            String s = scanner.next();

            switch(s) {
                case "+":
                    System.out.println("请输入加数与被加数");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    System.out.println(Add(num1, num2));
                    break;
                case "-":
                    System.out.println("请输入减数与被减数");
                    double num3 = scanner.nextDouble();
                    double num4 = scanner.nextDouble();
                    System.out.println(Subtract(num3, num4));
                    break;
                case "*":
                    System.out.println("请输入乘数与被乘数");
                    double num5 = scanner.nextDouble();
                    double num6 = scanner.nextDouble();
                    System.out.println(Multiply(num5, num6));
                    break;
                case "/":
                    System.out.println("请输入除数与被除数");
                    double num7 = scanner.nextDouble();
                    double num8 = scanner.nextDouble();
                    System.out.println(Divide(num7, num8));
                    break;
                default:
                    System.out.println("输入错误！");
                    break;
            }
        }
    }
    public static double Add(double num1,double num2){
        return num1+num2;
    }
    public static double Subtract(double num3,double num4){
        return num3-num4;
    }
    public static double Multiply(double num5,double num6){
        return num5*num6;
    }
    public static double Divide(double num7,double num8){
        return num7/num8;
    }
}
