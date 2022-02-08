/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffp
 */

import edu.iue.woods.*; 
import java.util.Scanner; 

public class TwelveDotFive {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter three sides of a triangle."); 
        System.out.print("Side One: ");
        double side1 = in.nextDouble(); 
        System.out.print("Side Two: "); 
        double side2 = in.nextDouble(); 
        System.out.print("Side Three: "); 
        double side3 = in.nextDouble(); 
        
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("The area is: " + triangle.getArea()); 
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex.toString()); 
        }
        
        System.out.println("But not to worry, our coding can continue!"); 
    }
    
}
