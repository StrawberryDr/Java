package Kitchen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //HashSet去重！！！！！！
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //因为材料是个字符串，所以用String形式
        Set<String> set = new HashSet<>();
        while (sc.hasNext()){
            String str = sc.nextLine();
            //用字符串数组保存空格分割后的字符串
            String[] array = str.split(" ");
            for(String ret : array){
                set.add(ret);
                //set在添加元素时，会排出重复元素
                //所以出现重复材料时，不会被添加到set集合中
                //最后set集合的大小，就是需要材料的种数
            }
        }
        sc.close();
        System.out.println(set.size());
    }
}
