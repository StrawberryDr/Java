import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int numJewelsInStones(String J, String S) {
        //1.需要知道不同石头的个数：S中每个字符出现的次数
        //  石头--->次数（k-v）：不需要有序，使用HashMap
        //2.检测宝石总的次数
        //  只需要检测J中每个字符在S中出现的次数
        Map<Character,Integer> m = new HashMap<>();
        for(int i = 0;i < S.length();++i){
            char ch = S.charAt(i);
            int count = m.getOrDefault(ch,0);
            m.put(ch,count+1);
        }

        int jewelsCount = 0;
        for(int i = 0;i < J.length();i++){
            jewelsCount += m.getOrDefault(J.charAt(i),0);
        }

        return jewelsCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String J = sc.nextLine();
        String S = sc.nextLine();
        System.out.println(numJewelsInStones(J,S));
    }
}
