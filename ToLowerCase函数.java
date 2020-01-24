import java.util.Scanner;


public class TestDemo {
    public static String toLowerCase(String str) {
        String newStr="";
        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            if(temp >= 65 && temp <= 90){
                temp += 32;
                newStr = newStr + temp;
            }else {
                newStr = newStr + temp;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = toLowerCase(str);
        System.out.println(result);
    }
}
