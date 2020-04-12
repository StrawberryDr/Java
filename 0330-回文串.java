import java.util.Scanner;

public class solution {
    public static boolean isReback(StringBuffer str){
        //双指针判断是否为回文串
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();  //原本的串
        String str2 = scanner.nextLine();  //插入的字符
        int count = 0;
        for(int i = 0;i <= str1.length();i++){  //因为要插入到最后一个字符之后，所以要用<=
            StringBuffer temp = new StringBuffer(str1);
            temp.insert(i,str2);  //通过for循环分别在每一个位置进行插入
            if(isReback(temp)){  //调用判断是否为回文串的方法进行本次插入后的判断
                count++; //插入后是回文串，计数器+1
            }
        }
        System.out.println(count);
    }
}
