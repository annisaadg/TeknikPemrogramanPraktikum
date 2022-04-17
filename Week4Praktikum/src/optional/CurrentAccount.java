/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optional;

/**
 *
 * @author Annisa
 */
public class CurrentAccount extends Account {
    private double limit;
    
    public CurrentAccount(int accNum, double limit){
        super(accNum);
        this.limit = limit;
    }

    CurrentAccount(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double getLimit(){
        return this.limit;
    }
    
    public void setLimit(double limit){
        this.limit = limit;
    }
    
    public void withdraw(double limit){
        if(limit <= this.limit){
            super.withdraw(limit);
        }else{
            System.out.println( "Sorry, Limit Exceeded");
        }
    }
    
    public String toString(){
        return super.toString()+" Limit : "+limit;
    }
}
