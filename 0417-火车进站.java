import java.util.*;

public class Main {
    /*
    * inbound：入站次数
    * outbound：出站次数
    */
    // 存储每一次trainSerial()之后得到的结果
    // 方便后面对list排序然后输出
    static List<String> list = new ArrayList<>();

    public static void trainSerial(int[] array,int inbound,Stack<Integer> stack,String str,int outbound){
        if(outbound == array.length){
            // 如果出栈次数和火车辆数相同
            // 说明已经全部出站完毕
            list.add(str);  // 将本次出站序列保存到list中
        }
        if(!stack.isEmpty()){
            // 火车出站操作
            // 如果栈不为空，则出站
            int temp = stack.pop();
            // 递归找下一个出站火车
            // 此时出站次数要+1,进行n次递归后，出站完毕
            trainSerial(array,inbound,stack,str+temp+" ",outbound+1);
            stack.push(temp);
        }
        if(inbound < array.length){
            // 火车进站操作
            stack.push(array[inbound]);
            trainSerial(array,inbound+1,stack,str,outbound);
            stack.pop();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i = 0;i < n;i++){
                array[i] = sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            //利用递归进行出站入站操作
            trainSerial(array,0,stack,"",0);
            Collections.sort(list);  //对list进行排序
            for(String str : list){
                System.out.println(str);
            }
        }
    }
}
