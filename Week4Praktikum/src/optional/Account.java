/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optional;

/**
 *
 * @author Annisa
 */
public class Account {
    private double bal;  //The current balance
    private int accnum;  //The account number
    
    
    public Account(int a)
    {    
	bal=0.0;
	accnum=a;
    }
    
    public void deposit(double sum)
    {
	if (sum>0)
	    bal+=sum;    
	else
	    System.err.println("Account.deposit(...): "
			       +"cannot deposit negative amount.");    
    }
    
    public void withdraw(double sum)
    {
	if (sum>0)
	    bal-=sum;    
	else
	    System.err.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");    
    }
    
    public double getBalance()
    {
	return bal;
    }
    
    public double getAccountNumber()
    {
	return accnum;
    }
    
    public String toString()
    {
	return "Acc " + accnum + ": " + "balance = " + bal;    
    }
    
    public final void print()
    {
	//Don't override this,
	//override the toString method
	System.out.println( toString() );    
    }

    boolean getInterest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
