import java.util.Scanner;

public class Main {
    public static void seriesDNA(String str,int len){
        int[] count = new int[str.length()-len];//记录字符串中各个位置开始对应子串中GC个数
        int max = 0;//记录出现GC最多的字符串
        for(int i = 0;i < str.length()-len;i++){
            //截取len长度的字符串
            String tempStr = str.substring(i,i+len);

            //计算截取得到字符串中GC的个数
            for(int j = 0;j < len;j++){
                if(tempStr.charAt(j) == 'C' || tempStr.charAt(j) == 'G'){
                    count[i]++;
                }
            }
            if(count[max] < count[i]){
                max = i;
            }
        }
        String ret = str.substring(max,max+len);//获取最后得到的GC个数最多的子串
        System.out.println(ret);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = sc.nextInt();
        seriesDNA(str,len);
    }
}
