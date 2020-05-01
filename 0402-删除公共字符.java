import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            char[] arr = new char[str1.length()];//保存删除后的字符串，长度设置为str1的长度，防止越界
            int index = 0;
            for(int i = 0;i < str1.length();i++){
                if(!str2.contains(str1.charAt(i) + "")){
                    arr[index++] = str1.charAt(i);
                }//用contains判断字符串中是否含有子字符串
            }
            System.out.println(String.valueOf(arr));//转换为字符串输出
        }
    }
}
