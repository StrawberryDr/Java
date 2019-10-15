/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 打印整数的每一位;

/**
 *
 * @author 15114964580
 */
import java.util.*;
public class 打印整数的每一位 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = Printf(num);
        System.out.println(temp);   
    }
    public static int Printf(int temp){
        if(temp > 9){
            Printf(temp / 10);
        }
        return temp;   
    }
}
