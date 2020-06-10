import java.util.Scanner;

public class Main {
    public static int getMax(int[] a,int m,int n){
        int temp = 0;
        if(m > n){
            temp = n;
            n = m;
            m = temp;
        }
        int max = a[m-1];
        for(int i = m;i < n;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            int n = 0,m =0; //n表示学生数目；m表示操作数目
            String[] nums = str.split(" ");
            n = Integer.parseInt(nums[0]);
            m = Integer.parseInt(nums[1]);
            String grade = sc.nextLine();//获得学生的初始成绩
            String[] grades = grade.split(" ");//n个成绩
            //int len = grades.length;
            int[] gradeNum = new int[grades.length];
            int[] max = new int[3000];
            int count = 0;//咨询次数，输出对应次数的最大值
            for(int i = 0;i < grades.length;i++){
                gradeNum[i] = Integer.parseInt(grades[i]);
            }
            for(int i = 0;i < m;i++){
                String opera = sc.nextLine();
                String[] operas = opera.split(" ");
                if(operas[0].equalsIgnoreCase("Q")){
                    count++;
                    max[count-1] = getMax(gradeNum,Integer.parseInt(operas[1]),Integer.parseInt(operas[2]));
                }
                if(operas[0].equalsIgnoreCase("U")){
                    gradeNum[Integer.parseInt(operas[1])-1] = Integer.parseInt(operas[2]);
                }
            }
            for(int i = 0;i < count;i++){
                System.out.println(max[i]);
            }
        }
    }
}
