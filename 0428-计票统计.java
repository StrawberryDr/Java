import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            //k：候选人姓名
            //v：候选人的票数
            Map<String,Integer> map = new LinkedHashMap<>();
            for(int i = 0;i < n;++i){
                map.put(sc.next(),0);//录入候选人姓名，并将票数初始化为0
            }
            int peopleNum = sc.nextInt(); //投票人数目
            int falseNum = 0; //无效票数目
            for(int i = 0;i < peopleNum;++i){
                String vote = sc.next();
                //计票:如果vote和map中的key值没有互相对应的，则说明为无效票
                if(map.get(vote) == null){
                    falseNum ++;
                }else {
                    //如果vote和map中的key值有互相对应的，则对应key++
                    map.put(vote,map.get(vote)+1);
                }
            }
            for(Map.Entry entry : map.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Invalid : " + falseNum);
        }
    }
}
