import java.util.Scanner;

public class Main {
    public static int getTotalCount(int monthCount){
        if(monthCount == 1 || monthCount == 2){
            return 1;  //前两个月没有小兔子出生
        }else {
            return getTotalCount(monthCount-1) + getTotalCount(monthCount-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int monthCount = sc.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
    }
}
