/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optional;

/**
 *
 * @author Annisa
 */
public class SavingsAccount extends Account {
    private double interest;
    
    public SavingsAccount(int accNum, double interest){
        super(accNum);
        this.interest = interest;
    }
    
    public double getInterest(){
        double x = getBalance() + getBalance()*interest;
        return x;
    }
    
    public void setInterest(double interest){
        this.interest = interest;
    }
    
    public void AddInterest(double interest){
        double x = super.getBalance()*interest;
        super.deposit(x);
    }
    
    public String toString(){
        return super.toString()+" Interest : " + interest;
    }
}
