/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incomemonitor;

/**
 *Objects of class Creditor represent creditors.
 * 
 * @author matthewstokes
 */
public class Creditor implements Comparable<Creditor> {
    String name = "";
    int date = 1;
    double amount = 0;
    double balance = 0;
    boolean status;
            
    Creditor (String aName, int aDate, double anAmount, double aBalance) {
        name = aName;
        date = aDate;
        amount = anAmount;
        balance = aBalance;
        status = false;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }
    
    public boolean getStatus() {
        return status;
    }

    private void setDate(int date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    private void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }
            
    void changeStatus()
    {
        status = !status;
    }

    @Override
    public String toString(){
        return name;
    }
    
    @Override
    public int compareTo(Creditor aCreditor){
        return this.getDate() - aCreditor.getDate();
    }

}
