/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 汉诺塔;

/**
 *
 * @author 15114964580
 */
import java.util.Scanner;

public class 汉诺塔 {
    static int m =0;//标记移动次数
    public static void move(int disks,char N,char M)
    {
        System.out.println("第 " + (++m) +" 次移动 : " +" 把 "+ disks+" 号圆盘从 " + N +" ->移到->  " + M);
    }
    //递归实现汉诺塔
    public static void hanoi(int n,char A,char B,char C)
    {
        if(n == 1)//圆盘只有一个时，只需将其从A塔移到C塔
            汉诺塔.move(1, A, C);//将编号为1的圆盘从A移到C
        else
        {//否则
            hanoi(n - 1, A, C, B);//递归，把A塔上编号1~n-1的圆盘移到B上，以C为辅助塔
            汉诺塔.move(n, A, C);//把A塔上编号为n的圆盘移到C上
            hanoi(n - 1, B, A, C);//递归，把B塔上编号1~n-1的圆盘移到C上，以A为辅助塔
        }
    }
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.print("请输入圆盘的个数：");
        int disks = imput.nextInt();
        汉诺塔.hanoi(disks, A, B, C);
        System.out.println("移动了" + m + "次");
        imput.close();
    }
}
