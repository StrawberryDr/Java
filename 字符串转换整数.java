import java.util.Scanner;

public class solution {
    public static int myAtoi(String str) {
        long ret = 0;
        boolean flag = true;
        int cf = -1;
        char[] temp = str.toCharArray();
        for(int i = 0;i < temp.length;i++){
            if(cf == -1 && (temp[i] == '-' || temp[i] == '+')){
                flag = (temp[i] == '-' ? false : true);
                cf = 1;
            }else if(Character.isDigit(temp[i])){  //isDigit:确定指定字符是否为数字
                ret = ret * 10 + (temp[i] - '0');
                if(ret > Integer.MAX_VALUE){
                    if(!flag){
                        return Integer.MIN_VALUE;
                    }
                    return Integer.MAX_VALUE;
                }
                cf = 1;
            }else if(temp[i] > 30){
                if(cf == -1 && temp[i] == ' '){
                    continue;
                }
                break;
            }
        }
        return (flag == true ? (int)ret : (int)-ret);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(myAtoi(str));
    }
}
