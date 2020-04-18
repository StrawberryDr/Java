import java.sql.DriverManager;
import java.util.*;

public class Main {
    public static int Drink(int n){
        if(n <= 0){
            return 0;
        }else if(n == 3 || n == 2){
            return 1;
        }else {
            int tmp = 0;
            tmp = n /3;
            return tmp + Drink(n - 3*tmp + tmp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            n = sc.nextInt();
            System.out.println(Drink(n));
        }
    }
}
