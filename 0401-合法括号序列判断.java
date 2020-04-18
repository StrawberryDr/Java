import java.util.Scanner;

public class Main {
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        if(A == null || n == 0){
            return false;
        }
        int flag = 0;  //计数：左括号的数目
        for(int i = 0;i < A.length();i++){
            if(A.charAt(i) == '('){
                flag++; //出现左括号，flag++
            }else if(A.charAt(i) == ')'){
                flag--;  //出现右括号，flag--，表示有一个左括号被匹配
            }else {
                return false;  //如果出现不是括号的字符，直接返回false
            }
            if(flag < 0){
                return false;  //右括号数目>左括号数目
            }
        }
        if(flag == 0){  //只有当flag==0时，才表示左右括号全部匹配
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(chkParenthesis(str,str.length()));
    }
}
