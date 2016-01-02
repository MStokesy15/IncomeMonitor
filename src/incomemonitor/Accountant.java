/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incomemonitor;

import java.util.*;
/**
 *
 * @author matthewstokes
 */
public class Accountant {
    List<Creditor> creditors;
    int statusesTrue = 0;
    Calendar calendar = Calendar.getInstance();
    
    public Accountant() {
        creditors = new ArrayList<>();
    }
    
    public final static Accountant getAccountant(){
        return new Accountant();
    }
    
    public void addCreditor (String aName, int aDate, double anAmount, double aBalance) {
        creditors.add(new Creditor(aName, aDate, anAmount, aBalance));
        Collections.sort(creditors);
    }
    
    public Creditor getCreditor(int anIndex) {
        return creditors.get(anIndex);
    }

    public int getStatusesTrue() {
        return statusesTrue;
    }
    
    public void changeStatus(Creditor aCreditor){
        aCreditor.changeStatus();
        if (aCreditor.getStatus()){
            statusesTrue++;
        }
        else{
            statusesTrue--;
        }
    }
    
    public List<Creditor> getCreditors(){
        return new ArrayList<Creditor>(creditors);
    }
    
    public String[] getDOM(){
        String[] maxDays = new String[31];
        
        for (int i=0; i<31; i++){
            maxDays[i] = "" + (i + 1);
        }
        
        return maxDays;
    }
    
    public void removeCreditor(Creditor aCreditor){
        creditors.remove(aCreditor);
    }
}
