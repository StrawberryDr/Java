/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 密码器;

/**
 *
 * @author 15114964580
 */
import java.util.*;
public class 密码器 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String key = new String("123456");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        for(count = 1;count <= 3;count ++){
            System.out.println("请输入密码：");
            String string = sc.nextLine();
            if(key.equals(string)){
                System.out.println("登录成功");
            }else if(!(key.equals(string)) && count <=21){
                System.out.println("密码错误");
            }else if(!(key.equals(string)) && count == 3){
                System.out.println("输入密码错误三次，程序退出");
            }
        }
        sc.close();
    } 
}
