import java.util.Scanner;

public class Solution {
    public static String Test(String str){
        String[] str1 = str.split(" ");
        String ret = "";
        for(String str2 : str1){
            ret += str2;
        }
        return ret;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = Test(str);
        System.out.println(str1);
    }
}
