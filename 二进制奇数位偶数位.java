/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 二进制奇数位偶数位;

/**
 *
 * @author 15114964580
 */
import java.util.*;
public class 二进制奇数位偶数位 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        OddEven(number);
    }
    
    public static void OddEven(int num){
        int i = 0;
        int j = 0;
        int ret = 0;
        System.out.println("奇数位为：");
        for(i = 31;i >= 1;i-=2){
            ret = 0;
            ret = (num >> i) & 1;
            System.out.print(ret);
        }
        System.out.print("\n");
        System.out.println("偶数位为：");
        for(i = 30;i >= 0;i-=2){
            ret = 0;
            ret = (num >> i) & 1;
            System.out.print(ret);
        }
    }   
}
