/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iue.woods;

/**
 *
 * @author jeffp
 */
public class IllegalTriangleException extends Exception {
    private final double side1; 
    private final double side2; 
    private final double side3; 
    
    public IllegalTriangleException(
            double side1, double side2, double side3, String s) {
        super(s); 
        this.side1 = side1; 
        this.side2 = side2; 
        this.side3 = side3; 
    }
    
    public double getSideOne() {
        return side1; 
    }
    
    public double getSideTwo() {
        return side2; 
    }
    
    public double getSideThree() {
        return side3; 
    }
}
