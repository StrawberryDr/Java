import java.util.Scanner;

public class Main {
    private static void reverseWord(String string,int[] arr,StringBuffer sb){
        for(int i = 0;i < string.length();i++){
            char ch = string.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }else {
                if(i == 0 || arr[i-1] == 0){
                    sb.append(" ");
                }
                arr[i] = 1;
            }
        }
        String[] temp = sb.toString().split(" ");
        StringBuffer ret = new StringBuffer("");
        for(int i = temp.length-1;i >= 0;i--){
            ret.append(temp[i]).append(" ");
        }
        System.out.println(ret.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String string = sc.nextLine();
            int[] arr = new int[string.length()];
            StringBuffer sb = new StringBuffer("");
            reverseWord(string,arr,sb);
        }
    }
}
