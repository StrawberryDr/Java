import java.util.Scanner;

public class Main {
    private static void pingPang(boolean flag,StringBuffer input,char[] chars){
        for(char ch : chars){
            int index = input.indexOf(String.valueOf(ch));
            if(index != -1){
                input.deleteCharAt(index);
            }else {
                System.out.println("No");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            boolean flag = true;
            StringBuffer input = new StringBuffer(sc.next());
            char[] chars = sc.next().toCharArray();
            pingPang(flag,input,chars);
        }
    }
}
