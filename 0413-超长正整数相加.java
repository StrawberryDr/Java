import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    //超长正整数可以利用BigInteger计算
    //BigInteger最大范围是64位
    //并且BigInteger类中也提供了相加的方法add()
    public static String AddLongInteger(String addend,String augend) {
        BigInteger temp = new BigInteger("0");
        BigInteger number1 = new BigInteger(addend);  //先将str1转换成BigInteger类型
        BigInteger number2 = new BigInteger(augend);
        if((number1.compareTo(temp)) > 0 && (number2.compareTo(temp) > 0)){
            number1 = number1.add(number2);
            String ret = String.valueOf(number1);
            return ret;
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String addend = sc.nextLine();
            String augend = sc.nextLine();
            System.out.println(AddLongInteger(addend,augend));
        }
    }
}
