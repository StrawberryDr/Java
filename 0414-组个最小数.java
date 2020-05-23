import java.util.Scanner;

public class Main {
    public static void combinationNum(int[] array){
        // 最高位：除了0之外最小的数
        // 之后的数字按照从小到大的顺序输出
        //for(int i = 0;i < array.length;i++){
        for(int i = 1;i < array.length;i++){
            // 这里循环应该直接从1开始
            // 因为0号下标如果不为0，会直接打印0位最高位
            if(array[i] != 0){
                //因为数组中存放的是0-9的个数，和下标对应
                //找到第一个不为0的数字一定是除了0之外最小的
                System.out.print(i);
                array[i]--; //输出一个后，对应个数-1
                break;  //结束对最高位的打印
            }
        }
        //最高位之后，按照从小到大的顺序开始进行打印
        //先将所有的0打印到最高位之后的位置
        for(int i = 0;i < array[0];i++){
            System.out.print(0);
        }
        //外层循环：循环数组
        for(int i = 1;i < array.length;i++){
            //内层循环：循环每个数字需要打印的个数
            for(int j = 0;j < array[i];j++){
                System.out.print(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0;i < array.length;i++){
            array[i] = sc.nextInt();
        }
        combinationNum(array);
    }
}
