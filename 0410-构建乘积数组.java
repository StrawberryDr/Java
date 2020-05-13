import java.util.Scanner;

public class Main {
    // B[i] =A[0]×A[1]×… ×A[i-1]×A[i+1]×…×A[n-1]
    /*
    * b0      1      a1      a2      …     a(n-2)    a(n-1)
    * b1      a0      1      a2      …     a(n-2)    a(n-1)
    * b2      a0     a1      1       …     a(n-2)    a(n-1)
    * …      a0     a1      …      1      a(n-2)    a(n-1)
    * b(n-2)  a0     a1      …      …       1       a(n-1)
    * b(n-1)  a0     a1      …      …     a(n-2)       1
    * 分析：
    * 1.以1为分界线，分为左右两部分
    * 2.左部分：每一行满足B[i] = 1× A[0]×A[1]×… ×A[i-1]
    * 3.右部分：每一行满足B[i] = A[i+1]×…×A[n-1]
    * 4.左右两部分的乘积才是最终B[i]的结果
    */
    public static int[] multiply(int[] A) {
        //如果为空或者A的大小小于1，则B中的数据就是A中的数据
        //所以直接返回A即可
        if(A == null || A.length <= 1){
            return A;
        }

        //先计算左部分：每一行满足B[i] = 1× A[0]×A[1]×… ×A[i-1]
        int[] B = new int[A.length];
        B[0] = 1;
        for(int i = 1;i < A.length;i++){
            B[i] = B[i-1] * A[i-1];
        }

        //temp的变化表示右部分
        //B[j] = B[j] * temp;得出最终B[j]的结果
        int temp = A[A.length-1];//从后往前算
        for(int j = A.length-2;j >= 0;j--){
            B[j] = B[j] * temp;
            temp *= A[j];
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int[] b = multiply(a);
        for (int x : b) {
            System.out.print(x + " ");
        }
    }
}
