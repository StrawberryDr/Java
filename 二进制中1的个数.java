/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 二进制中1的个数;

/**
 *
 * @author 15114964580
 */
import java.util.*;
public class 二进制中1的个数 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = Count(number);
        System.out.println(count);
    }
    
    public static int Count(int number){
        int count = 0;
        int i = 0;
        for(i = 0;i < 32;i++){
            if(((number >> i) & 1 ) == 1){
                count ++;
            }
        }
        return count;
    }
    
}
