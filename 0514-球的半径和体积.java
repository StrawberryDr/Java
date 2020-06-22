import java.util.Scanner;
import java.lang.Math;

public class Main {
    //半径
    public static double getRadius(double x0,double y0,double z0,double x1,double y1,double z1){
        double radius=0;
        double radiusSquare=0;
        radiusSquare=(x1-x0)*(x1-x0)+(y1-y0)*(y1-y0)+(z1-z0)*(z1-z0);
        radius=Math.sqrt(radiusSquare);
        return radius;
    }

    //体积
    public static double getVolume(double x0,double y0,double z0,double x1,double y1,double z1){
        double volume=0;
        volume=4*Math.acos(-1)*Math.pow(getRadius(x0,y0,z0,x1,y1,z1), 3)/3;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double x0 = sc.nextDouble();
            double y0 = sc.nextDouble();
            double z0 = sc.nextDouble();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double z1 = sc.nextDouble();
            System.out.printf("%.3f",getRadius(x0,y0,z0,x1,y1,z1));
            System.out.print(" ");
            System.out.printf("%.3f",getVolume(x0,y0,z0,x1,y1,z1));
            System.out.println();
        }
    }
}
