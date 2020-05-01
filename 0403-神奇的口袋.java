import java.util.Scanner;

public class Main {
    static int count = 0;  //计算有多少种方式
    static int[] array;   // 用来表示口袋
                          // 为了能够在getVolume方法中方便递归，
                          // 设置为全局变量，就不用进行太多参数的传递和使用
    static int n;  //物品种类的数目

    //递归取得体积总和为40的物品
    /*
    * pocket：口袋剩余容量
    * sum：表示剩下可以选择的东西的数目
    */
    public static void getVolume(int pocket,int sum){
        if(pocket == 0){
            count++;
        }
        if (pocket <= 0 || (pocket > 0 && sum < 0)) {
            //口袋容量不够  或者  口袋容量够物品不够
            return;
        }

        //递归装入物品
        //背包剩余容量-口袋中已经装入的容量，剩余物品数目-1
        getVolume(pocket-array[sum],sum-1);

        //如果当前物品不满足要求，跳过，直接进行sum的递归
        getVolume(pocket,sum-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 0; //物品种类的数目
//        int[] array = new int[]{};
        while (sc.hasNext()){
            //因为不确定会录入多少件物品，所以选择while循环进行输入判断
            //如果有输入，给对应值做出相应改变
            n = sc.nextInt();
            array = new int[n + 1];  //设置数组长度>物品种类数目，防止出现溢出
            for(int i = 1; i <= n;i++){
                array[i] = sc.nextInt();
            }
            //        int count = getVolume(40,n);
            //count设置为全局变量更容易实现
            getVolume(40,n);
            System.out.println(count);
        }
    }
}
