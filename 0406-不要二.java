import java.util.Scanner;
/*
* 欧几里得距离：( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
* 可得：( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) != 4
* 分析：
* 括号中是两个乘积相加的结果，坐标不存在根号2这种情况
* 只能是2*2+0*0 或者 0*0+2*2
* 也就是说在同一行或者同一列摆放时不能间隔为2
* 就会有11001100……的摆放规律
* 以4为一个周期
* 1.如果格子数目为4的倍数个，则最多摆放的情况为每4个格子放两个
*   最多的个数为格子总数目的一半，即：maxCake = w * h / 2;
* 2.如果格子数目不为4的倍数个，按照11001100的方式进行摆放
*   最多的个数为格子总数目的一半多一个，即：maxCake = w * h / 2 + 1;
*/
public class Main {
    public static int maxCake(int row,int col){
        if(row * col % 4 == 0){
            return row * col / 2;
        }else {
            return row * col / 2 + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(maxCake(w,h));
    }
}
