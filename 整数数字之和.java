/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 整数数字之和;

/**
 *
 * @author 15114964580
 */
import java.util.Scanner;
public class 整数数字之和 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new  Scanner(System.in);
        System.out.print("Please enter a number:");
        int n=input.nextInt();
        int count=0,m,i;
        
        for(i=n;i>0;i=i/10)
        {
            m=i%10;
            count=count+m; 
        }
        System.out.println(count);
    }   
}
