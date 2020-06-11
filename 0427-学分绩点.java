import java.util.Scanner;

public class Main {
    public static void printGPA(
            int n,float sum,int[] credit, int[] grade,int creditSum){
        for(int i = 0;i<n;++i){
            int grades = grade[i];
            if(grades >= 90 && grades <= 100){
                sum += 4.0 * credit[i];
            }
            if(grades >= 85 && grades <= 89){
                sum += 3.7 * credit[i];
            }
            if(grades >= 82 && grades <= 84){
                sum += 3.3 * credit[i];
            }
            if(grades >= 78 && grades <= 81){
                sum += 3.0 * credit[i];
            }
            if(grades >= 75 && grades <= 77){
                sum += 2.7 * credit[i];
            }
            if(grades >= 72 && grades <= 74){
                sum += 2.3 * credit[i];
            }
            if(grades >= 68 && grades <= 71){
                sum += 2.0 * credit[i];
            }
            if( grades <= 67 && grades >= 64){
                sum += 1.5 * credit[i];
            }
            if(grades <= 63 && grades >= 60){
                sum +=1.0 * credit[i];
            }
            if(grades < 60){
                sum += 0;
            }
        }
        System.out.println(String.format("%.2f",sum/creditSum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] credit = new int[n];  //存放学分
        int[] grade = new int[n];  //存放成绩
        float sum = 0;

        //输入课程学分
        int creditSum = 0; //存放学分总和
        for(int i = 0;i < n;++i){
           credit[i] = sc.nextInt();
           creditSum += credit[i];
        }
        //输入课程成绩
        for(int i = 0;i < n;++i){
            grade[i] = sc.nextInt();
        }
        printGPA(n,sum,credit,grade,creditSum);
    }
}
