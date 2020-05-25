import java.util.Scanner;

public class Main {
    public static int addAB(int A, int B) {
        // write code here
        int sum = 0;
        int temp = 0;
        //利用逻辑运算进行计算
        while (B != 0){//进位为0，则不用再进行进位计算
            sum = A^B; //求和（不包括进位）
            temp = (A&B) << 1;  //得出进位
            A = sum;
            B = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(addAB(a,b));
    }
}
