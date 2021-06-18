/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Manager;
/**
 *
 * @author sheharyar saeed 190880 
 * BSSE B - 4
 */
public class Saving_Account extends Account{
    Double Min_Balance;
    String Date_of_Opening;
    Customer customer;
    
    void addCustomer(String accno, Double blnc, Double minblnc, String DoO, Branch brnch, Customer  cus){
          Acc_No = accno;
          Balance = blnc;
          Min_Balance = minblnc;
          Date_of_Opening = DoO;
          branch = brnch;
          branch.addAccount(this);
          customer = cus;
    }
    public void removeCustomer(){
          branch.removeAccount(this.Acc_No);
          customer = null;
    }
}
