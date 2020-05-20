import java.util.Scanner;

public class Main {
    // 输出第一行---》输出中间行---》输出最后行
    // 输出的行数为列数的一半
    // 如果为奇数则为一半的向上取整进行四舍五入
    public static void studyAo(int n,String str){
        for(int i = 0;i < n;i++){
            System.out.print(str);
        }
        int height = n%2==0 ? n/2 : n/2+1;
        for(int j = 0;j < height-2;j++){
            System.out.println();
            for(int i = 0;i < n;i++){
                if(i == 0 || i == n-1){
                    System.out.print(str);
                }else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        for(int i = 0;i < n;i++){
            System.out.print(str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //输出的列数
        String str = sc.next(); //输出的字符
        studyAo(n,str);
    }
}
