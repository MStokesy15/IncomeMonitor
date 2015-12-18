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
public class Creditor {
    String name = "";
    String date = "";
    double amount = 0;
    double balance = 0;
    boolean status;
            
    Creditor (String aName, String aDate, double anAmount, double aBalance) {
        name = aName;
        date = aDate;
        amount = anAmount;
        balance = aBalance;
        status = false;
    }
            
public void changeStatus()
{
    status = !status;
}

@Override
public String toString(){
    return name;
}

}
