import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int a;
        int sum = 0;
        boolean a1=false,a2=false,a3=false,a4=false,a5=false;//是否存在的标志位
        int A1=0,A2=0,A3=0,A5=0;
        double A4 = 0; //4要求精确小数
        int i = 1,k = 1;

        N = sc.nextInt();
        while (N > 0){
            a = sc.nextInt();
            //switch语句判断是哪一个数
            switch (a % 5){
                case 0:
                    if(a % 2 == 0){
//                        boolean a1 = true;
                        a1 = true;
                        A1 += a;
                    }
                    break;
                case 1:
                    A2 += a*i;
                    i = i * -1;
                    a2 = true;
                    break;
                case 2:
                    A3++;
                    a3 = true;
                    break;
                case 3:
                    sum += a;
                    A4 = sum / (1.0 * k);
                    k++;
                    a4 = true;
                    break;
                case 4:
                    if(A5 < a){
                        A5 = a;
                        a5 = true;
                    }
                    break;
            }
            N--;
        }

        System.out.print(a1==true ? A1+" " : 'N'+" ");
        System.out.print(a2==true ? A2+" " : 'N'+" ");
        System.out.print(a3==true ? A3+" " : 'N'+" ");
        //确定A4的格式
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.print(a4==true ? decimalFormat.format(A4)+" " : 'N'+" ");

        if(a5 == true){
            System.out.println(A5);
        }else {
            System.out.println("N");
        }
    }
}
