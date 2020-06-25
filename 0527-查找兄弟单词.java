import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num = in.nextInt();
            String[] strings = new String[num];
            int count = 0;
            for(int i = 0;i<num;i++){
                strings[i] = in.next();
            }
            String key = in.next();
            char[] keyChar = key.toCharArray();
            Arrays.sort(keyChar);
            int no = in.nextInt();

            ArrayList<String> list = new ArrayList<String>();
            for(int i = 0;i<num;i++){
                int c = check(key,strings[i],keyChar);
                count += c;
                if(c==1)
                    list.add(strings[i]);
            }
            System.out.println(count);
            Collections.sort(list);
            if(count>=no)
                System.out.println(list.get(no-1));
        }
    }

    // 判断是否是兄弟单词（将两个单词按字符排序后看相不相同就行了）
    private static int check(String key,String word,char[] keyChar){
    // 排除相同单词，及长度不一致的单词
        if(key.equals(word)||key.length()!=word.length()){
            return 0;
        }
        char[] wordChar = word.toCharArray();
        Arrays.sort(wordChar);
        return Arrays.equals(keyChar, wordChar)?1:0;
    }
}

