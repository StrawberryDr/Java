import java.util.Scanner;

public class Main {
    public static String count(int[] array){
        int A,B,C;
        //首先要满足条件：每个人的糖果不含有半个，也不为负数
        //(A-B)+(A+B) == 2A  ---->A = ((A-B)+(A+B))/2
        //同理，可以得出B
        if(((array[0]+array[2])%2 == 0) && ((array[1]+array[3]) %2 == 0))
        {
            A = (array[0] + array[2])/2;
            B = array[2] - A;
            C = array[3] - B;
            //第一次得出结果后没有判断ABC是否满足>0的条件，导致测试用例没有全部通过
            if(A<0 || B<0 || C<0){
                return "No";
            }
            return A + " " + B + " " + C;
        }
        return "No";  //没有符合条件的ABC
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //将四个等式的值放入数组中
        while (sc.hasNext()){
            int[] array = new int[4];
            for(int i = 0;i < 4;i++){
                array[i] = sc.nextInt();
            }
            System.out.println(count(array));
        }
    }
}
