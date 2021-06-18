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
public class Current_Account  extends Account{
    Double Interest_Rate;
    String Date_of_Opening;
    Customer customer;
    
    Current_Account(){
        Interest_Rate = 0.0;
        Date_of_Opening = "";
    }
    void addCustomer(String accno, Double blnc, Double intrate, String DoO, Branch brnch,  Customer  cus){
          Acc_No = accno;
          Balance = blnc;
          Interest_Rate = intrate;
          Date_of_Opening = DoO;
          branch = brnch;
          branch.addAccount(this);
          customer = cus;
    }
    public void removeCustomer(){
          branch.removeAccount(this.Acc_No);
          customer=null;
    }
}
