import java.util.Scanner;

public class Main {
    public static void shuffle(int[] beforeHalf, int[] afterHalf, int n, int[] totle) {
        for (int i = 0; i < n; i++) {
            totle[2 * i] = beforeHalf[i];
        }
        for (int i = 0; i < n; i++) {
            totle[2 * i + 1] = afterHalf[i];
        }
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                beforeHalf[i] = totle[i];
            } else {
                afterHalf[i-n] = totle[i];
            }
        }
    }
//    public static void printfCard(int n,int[] totle){
//        for(int i = 0;i < 2*n;i++){
//            if(i == 2*n-1){
//                System.out.print(totle[i]);
//            }else {
//                System.out.print(totle[i]);
//                System.out.print(" ");
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  //表示要洗几副牌
        while (T > 0) {
            int n = sc.nextInt(); //每副牌个数的一半
            int k = sc.nextByte(); //洗牌的次数
            int[] beforeHalf = new int[n];
            int[] afterHalf = new int[n];
            //先将两部分分别存放到一个数组中
            for (int i = 0; i < n; i++) {
                beforeHalf[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                afterHalf[i] = sc.nextInt();
            }
            int[] total = new int[2 * n];//洗完之后整副牌存在一起
            for (int i = 0; i < k; i++) {
                //循环k次洗牌过程
                shuffle(beforeHalf, afterHalf, n, total);
            }
            for (int i = 0; i < 2 * n; i++) {
                if (i == 2 * n - 1) {
                    System.out.print(total[i]);
                }else {
                    System.out.print(total[i]);
                    System.out.print(" ");
                }
            }
            T--;  //每洗完一副牌，T--
            if (T > 0) {
                System.out.println();
            }
        }
    }
}
