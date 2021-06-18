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
class Branch {
    String Branch_Code;
    String City;    
    ArrayList<Account> accountlist = new ArrayList();
    ArrayList<Loan> loanlist = new ArrayList();
    ArrayList<Customer> customerlist = new ArrayList();
    String ZHO;
    
    Branch(){
        Branch_Code = "";
        City = "";
    }
    Branch(String branchcode,String city, String zho){
        Branch_Code = branchcode;
        City = city;
        ZHO = zho;
    }
    
    public void setZHO(String zhocode){
        ZHO = zhocode;
    }
    public void addAccount(Account acc){
        accountlist.add(acc);
    }
    public boolean removeAccount(String accno){
        for(int i=0; i< accountlist.size();i++){
            Account acc = accountlist.get(i);
            if(acc.Acc_No.equals(accno))
            {
                accountlist.remove(acc);
                return true;
            }
        }
        return false;
    }
    public Account getAccount(String accno){
        for(int i=0; i< accountlist.size();i++){
            Account acc = accountlist.get(i);
            if(acc.Acc_No.equals(accno))
            {
                return acc;
            }
        }
        return null;
    }
    
    public void addCustomer(Customer acc){
        customerlist.add(acc);
    }
    public boolean removeCustomer(String custid){
        for(int i=0; i< customerlist.size();i++){
            Customer cust = customerlist.get(i);
            if(cust.Cust_ID.equals(custid))
            {
                customerlist.remove(cust);
                return true;
            }
        }
        return false;
    }
    public Customer getCustomer(String custid){
        for(int i=0; i< customerlist.size();i++){
            Customer cust = customerlist.get(i);
            if(cust.Cust_ID.equals(custid))
            {
                return cust;
            }
        }
        return null;
    }
    public void addLoan(Loan loan){
        loanlist.add(loan);  
    }
    public boolean removeLoan(int loanno){
        for(int i=0; i< loanlist.size();i++){
            Loan loan = loanlist.get(i);
            if(loan.Loan_No == loanno)
            {
                loanlist.remove(loan);
                return true;
            }
        }
        return false;
    }
    public Loan getLoan(int loanno){
        for(int i=0; i< loanlist.size();i++){
            Loan loan = loanlist.get(i);
            if(loan.Loan_No == loanno)
            {
                return loan;
            }
        }
        return null;
    }
}
