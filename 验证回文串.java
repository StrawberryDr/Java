import java.util.Scanner;

public class solution {
    public static boolean isPalindrome(String s) {
        if(s == null || s.length()==0){
            return true;
        }
        String newStr = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
        //利用正则表达式[^0-9a-zA-Z]筛选字符串中除了字母和数字外的数字
        //不考虑大小写的情况下，将newStr统一为小写toLowerCase()
        for(int left = 0,right = newStr.length()-1;left < right;left++,right--){
            if(newStr.charAt(left) != newStr.charAt(right)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));
    }
}
