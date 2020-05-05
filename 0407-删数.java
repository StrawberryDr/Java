import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt(); //获取数字个数
            if(n > 1000){
                n = 999;  //n>1000,则按照999计算
            }
            int[] array = new int[n];
            int temp = n;
            int flag = -1; //判断是否要从头开始：数组从0开始，第一次进入循环是第0个数，所以将初始值设置为-1
            int count = 0; //判断是否需要删除：//每三个数的第三个数被删除，以3为循环，进入循环+1，初始值设置为0
            //为了最后可以返回最后一个删除元素的下标
            //一开始使用的动态数组的删除不适用，因为会改变元素的下标
            //为了解决这个问题，还是使用一般数组，将删除元素设置为-1，表示已经删除
            while (temp > 0){
                flag++;
                if(flag >= n){
                    flag = 0;   //从头开始
                }
                if(array[flag] == -1){
                    //说明已经删除过了
                    continue;
                }
                count++;
                //每三个数的第三个数被删除，以3为循环
                if(count == 3){
                    array[flag] = -1;  //用-1表示删除元素
                    count = 0; //计数器设置为0，开始新一轮的计数
                    temp--;
                }
            }
            System.out.println(flag);
        }
    }
}
