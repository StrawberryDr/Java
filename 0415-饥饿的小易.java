import java.util.Scanner;

public class Main {
    public static int hungryYi(int num){
        int ret = 0;
        int count = 0;
        int place = 1000000007;
        if(num % place == 0){
            return 0;
        }
        while (num != 0 && count <= 300000){
            num = (num * 2 + 1) % place;
            count++;
        }
        ret = (count + 2 ) / 3;
        return ret>100000 ? -1 : ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(hungryYi(num));
        }
    }
}
