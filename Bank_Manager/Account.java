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
public class Account {
    String Acc_No;
    Double Balance;
    Branch branch;
    
    Account(){
        Acc_No = "";
        Balance = 0.0;
    }
    Account(String accno, Double blnc, Branch brnch ){
        Acc_No = accno;
        Balance = blnc;
        branch = brnch;
    }
    
    public boolean debitAccount(Double amnt){
        if(amnt>0 && amnt<Balance){
            Balance = Balance - amnt;
            return true;
        }
        else
            return false;
    }
    
    public boolean creditAccount(Double amnt){
        if(amnt>0){
            Balance = Balance + amnt;
            return true;
        }
        else
            return false;
    }
    
    public Double getBalance(){
        return Balance;
    }
}
