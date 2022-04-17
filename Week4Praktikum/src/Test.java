/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Annisa
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Cylinder object and display it's properties
        Cylinder myCylinder = new Cylinder(5.0,2.0);
        
        System.out.println("The length :"+myCylinder.getLength());
        System.out.println("The radius :"+myCylinder.getRadius());
        System.out.println("The Cylinder Volume :"+myCylinder.findVolume());
        System.out.println("The area of Circle :"+myCylinder.findArea());
    }
    
}
