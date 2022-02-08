package edu.iue.woods;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffp
 */ 

public class Triangle extends Object{
    private double side1; 
    private double side2; 
    private double side3; 
    
    public Triangle() {}
    
    public Triangle(double side1, double side2, double side3) 
        throws IllegalTriangleException {
        this.side1 = side1; 
        this.side2 = side2; 
        this.side3 = side3; 
        if (side1 + side2 <= side3 ||
            side2 + side3 <= side1 ||
            side1 + side3 <= side2) {
            throw new IllegalTriangleException(side1, side2, side3, 
                   "The sum of two sides must be greater than remaining side."); 
        }
    }
        
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public String toString() {
        return "Triangle: side one: " + side1 + " side two: " + side2 +
                " side three: " + side3; 
    }

}
    

