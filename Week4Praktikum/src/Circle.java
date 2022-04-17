/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Annisa
 */
public class Circle {
    
    private double radius;
    
    Circle(double r){
        radius=r;
    }
    Circle(){
        radius=1.0;
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        return radius*radius*3.14;
    }
}
