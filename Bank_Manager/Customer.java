/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Manager;

import java.util.ArrayList;
/**
 *
 * @author sheharyar saeed 190880 
 * BSSE B - 4
 */
public class Customer {
    String Cust_ID;
    String Name;
    String Address;
    String Phone;
    
    Saving_Account savingaccount;
    Current_Account currentaccount;
    ArrayList<Loan> loanlist;
            
    Customer(){
        Cust_ID = "";
        Name = "";
        Address = "";
        Phone = "";
        savingaccount = new Saving_Account() ;
        currentaccount = new Current_Account();
        loanlist = new ArrayList();
    }
    
    Customer(String id, String name, String add, String phone){
        Cust_ID = id;
        Name = name;
        Address = add;
        Phone = phone;
        savingaccount = new Saving_Account() ;
        currentaccount = new Current_Account();
        loanlist = new ArrayList();
    }
    
    void setSA(Saving_Account sv){
        savingaccount = sv;
    }
    void setCA(Current_Account cv){
        currentaccount = cv;
    }
    
    Saving_Account getSA(){
        return savingaccount;
    }
    Current_Account getCA(){
        return currentaccount ;
    }
}
