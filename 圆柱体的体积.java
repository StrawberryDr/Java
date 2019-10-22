/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 圆柱体的体积;

/**
 *
 * @author 15114964580
 */
public class 圆柱体的体积 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius;
        double length;
        double area;
        double volume;
        
        //Assign a radius and a length
        radius=5;  //New value is radius
        length=10;  //New value is length
        
        //Compute area
        area=radius*radius*3.1415926;
        
        //Compute volume
        volume=area*length;
        
        //Display results
                System.out.println("The volume for the cylinder"+radius+"is"+volume);
    }
}
