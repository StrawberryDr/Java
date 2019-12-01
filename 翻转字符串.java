import java.util.Scanner;

public class TestDemo {
    public static String func(int size,String chas){
        String str1 = chas.substring(0,size);
        String str2 = chas.substring(size,chas.length());
        String ret = str2+str1;
        return ret;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String chas = sc.next();
        String ret = func(n,chas);
        System.out.println(ret);
    }
}
