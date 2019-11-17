import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int []a = new int[5];
        a[0] = s.indexOf("a");
        a[1] = s.indexOf("e");
        a[2] = s.indexOf("i");
        a[3] = s.indexOf("o");
        a[4] = s.indexOf("u");
        for (int i =0;i<5;i++){
            if (a[i] == -1){
                a[i] = s.length()+10;
            }
        }
        int count = 0;
        for (int i = 0;i<5;i++){
            if (a[i] == s.length()+10){
                count++;
            }
            if (count == 5){
                System.out.println("n");
                return;
            }
        }
        Arrays.sort(a);
        System.out.println(a[0]+1);
    }


//    int m;
//    int n;
//    int jz[][];
//    int num;
//    Main() throws IOException{
//        Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        while(true){
//            n=cin.nextInt();
//            m=cin.nextInt();
//            int r = cin.nextInt();
//            int c = cin.nextInt();
//            if(n==0&&m==0){
//                System.out.println("Game over!");
//                break;
//            }
//            jz = new int [n][m];
//            solve();
//            for(int i=0;i<n;i++){
//                for(int j=0;j<m;j++){
//                    System.out.print(jz[i][j]);
//                    if(j!=n-1)
//                        System.out.print("\t");
//                }
//                System.out.println();
//            }
//            System.out.println(jz[c-1][r-1]);
//        }
//    }
//    void solve(int x,int y,int z){
//        jz[x][y]=num;
//        num++;
//        switch(z){
//            case 6:
//                if(y+1<=m-1&&jz[x][y+1]==0)
//                    solve(x,y+1,z);
//                else
//                if(x+1<=n-1&&jz[x+1][y]==0)
//                    solve(x+1,y,2);
//                break;
//            case 2:
//                if(x+1<=n-1&&jz[x+1][y]==0)
//                    solve(x+1,y,z);
//                else
//                if(y-1>=0&&jz[x][y-1]==0)
//                    solve(x,y-1,4);
//                break;
//            case 4:
//                if(y-1>=0&&jz[x][y-1]==0)
//                    solve(x,y-1,z);
//                else
//                if(x-1>=0&&jz[x-1][y]==0)
//                    solve(x-1,y,8);
//                break;
//            case 8:
//                if(x-1>=0&&jz[x-1][y]==0)
//                    solve(x-1,y,z);
//                else
//                if(y+1<=m-1&&jz[x][y+1]==0)
//                    solve(x,y+1,6);
//                break;
//        }
//    }
//    void solve(){
//        num=1;
//        solve(0,0,6); //逆时针方向 从（0,0）开始右边开始
//    }
//    public static void main(String[] args) throws IOException{
//        new Main();
//    }
}
