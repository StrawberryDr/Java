import java.util.Scanner;

public class Main {
    private static void nameName(String string,String[] word,String ret){
        for(int i = 1;i < word.length;i++){
            ret += (char)(word[i].charAt(0) - 'a' + 'A');
            for(int j = 1;j < word[i].length();j++){
                ret += word[i].charAt(j);
            }
        }
        System.out.println(ret);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string = sc.nextLine();
            String[] word = string.split("_");
            String ret = word[0];
            nameName(string,word,ret);
        }
    }
}
