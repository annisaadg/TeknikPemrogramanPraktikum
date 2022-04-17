/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Annisa
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        super();
        length=1.0;
    }
    public Cylinder(double r, double l){
        super(r);
        length=l;
    }
    public double getLength(){
        return length;
    }
    public double findArea(){
        System.out.println("Call Cylinder find Area");
        return 2*super.findArea()+2*getRadius()*3.14159*length;
    }
    public double findVolume(){
        return findArea()*length;
    }
}
