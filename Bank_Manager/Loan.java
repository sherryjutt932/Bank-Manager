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
public class Loan {
    int Loan_No;
    Double Amount;
    String Type;
    Branch branch;
    
    Loan(){
        Loan_No = 0;
        Amount = 0.0;
        Type = "";
    }
    Loan(int loanno,  Double amount, String type, Branch brnch){
        Loan_No = loanno;
        Amount = amount;
        Type = type;
        branch = brnch;
    }
    
    void addCustomer(int loanno, Double amount, String type, Branch brnch){
        Loan_No = loanno;
        Amount = amount;
        Type = type;
        branch = brnch;
        branch.addLoan(this);
    }
    public Double prepayment(Double amnt){
        Amount = Amount - amnt;
        return Amount;
    }
    public Double getEMI(){
        return Amount/36;
    }
}
