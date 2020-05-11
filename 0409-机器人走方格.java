import java.util.Scanner;

public class Main {
    //类似于算法中的走迷宫问题，利用递归进行求解
    //因为只能向右走和向下走，所以可以得到递推式：
    // f(x , y) = f(x - 1, y) + f(x , y - 1)
    public static int countWays(int x, int y) {
        // write code here
        //如果行数或者列数为1的时候，都只有一种解法
        //行为1：则只能向右走
        //列为1：则只能向下走
        if(x == 1 || y == 1){
            return 1;
        }
        //行列都不为1的时候，利用递归计算
        //要么按照向下走的形式，递推式为(x-1,y)
        //要么按照向右走的形式，递推式为(x,y-1)
        return countWays(x-1,y) + countWays(x,y-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(countWays(x,y));
    }
}
