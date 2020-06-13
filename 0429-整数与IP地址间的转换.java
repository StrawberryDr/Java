import java.util.Scanner;

public class Main {
    //IP转换为十进制
    public static long convertTen(String strIP){
        String[] array = strIP.split("\\.");//以.为分界线分割IP
        long ip = Long.parseLong(array[0]);
        for(int i = 1;i < array.length;i++){
            ip <<= 8;
            ip += Long.parseLong(array[i]);
        }
        return ip;
    }

    //十进制转换为IP
    //先将每一位表示成二进制
    //将几段二进制数拼接
    //求出拼接后二进制对应的十进制
    public static void convertIP(String strTen){
        long ten = Long.parseLong(strTen);
        String ip = Long.toBinaryString(ten);
        StringBuffer strB = new StringBuffer();
        while (ip.length()<32){
            ip = "0" + ip; //不足8位用0补上
        }
        ip = ip.substring(ip.length()-32);
        strB.append(ip);
        for(int i = 0;i < strB.length()-8;i+=8){
            System.out.print(Integer.parseInt(strB.substring(i,i+8),2) + ".");
        }
        System.out.println(Integer.parseInt(strB.substring(strB.length()-8),2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String strIP = sc.nextLine();
            String strTen = sc.nextLine();
            System.out.println(convertTen(strIP));
            convertIP(strTen);
        }
    }
}
