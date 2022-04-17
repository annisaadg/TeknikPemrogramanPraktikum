/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optional;

/**
 *
 * @author Annisa
 */
public class Bank {

    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new SavingsAccount(2, 0.25);
        accounts[1] = new CurrentAccount(23, 50);

        for (Account account : accounts) {
            if (account.equals(SavingsAccount)) {
                System.out.println(accounts[0].getInterest());
            }
        }
    }
}
