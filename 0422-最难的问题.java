import java.util.Scanner;

public class Main {
    public static void problem(String str){
        StringBuffer strB = new StringBuffer();
        for(int i = 0;i < str.length();++i){
            char ch = str.charAt(i);
            if(ch == ' '){
                strB.append(" ");
                continue;
            }
            int chA = ch - 'A';
            if(chA < 5){
                char temp = (char)('Z' - 4 + chA);
                strB.append(temp);
            }else {
                char other = (char)(ch - 5);
                strB.append(other);
            }
        }
        System.out.println(strB.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            problem(str);
        }
    }
}
