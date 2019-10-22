/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n.末尾0的个数;

/**
 *
 * @author 15114964580
 */
import java.util.Scanner;
public class N末尾0的个数 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();
    int sum=0;
     for(int i=1;i<=n;i++){
        int num=i;
        while(num%5==0&&num>=5){
            num=num/5;
            sum++;
        }
     }
     System.out.println(sum);
  }
}
