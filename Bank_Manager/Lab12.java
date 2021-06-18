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
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindow jFrame = new MainWindow();
        jFrame.setVisible(true);
        /*
        Bank bank = new Bank();
        
        Branch branch = new Branch("0001","Lahore");
        
        bank.addBranch(branch);
        
        branch = new Branch("0002","Islamabad");
        
        bank.addBranch(branch);
        
        bank.displayBranch();
        
        System.out.println("Removing Branch :");
        boolean remove = bank.removeBranch("0002");
        if(remove)
            System.out.println("0002 Branch removed successfully!");
        else
            System.out.println("Branch didn't remove, error occured!");
        System.out.println("------------------------------------");
        
        bank.displayBranch();
        
        System.out.println("Getting Branch with code 0001 :");
        branch = bank.getBranch("0001");
        System.out.print("Branch Code = ");
        System.out.println(branch.Branch_Code);
        System.out.print("Branch City = ");
        System.out.println(branch.City);
        System.out.println("------------------------------------");
        
        
        ArrayList<Branch> branchlisttmp = bank.getAllBranches();
        System.out.println("Get All Branches :");
        for(int i=0; i< branchlisttmp.size();i++){
            Branch branchtmp = branchlisttmp.get(i);
            System.out.println("Branch " + (i+1) + " =>");
            System.out.print("Branch Code = ");
            System.out.println(branchtmp.Branch_Code);
            System.out.print("Branch City = ");
            System.out.println(branchtmp.City);
        }
        System.out.println("------------------------------------");
        
        
        
        System.out.println("Branch Functions");
        System.out.println("------------------------------------");
        */
        
        /*
        branch = bank.getBranch("0001");
        
        Account acc = new Account("1001" , 100000.0);
        branch.addAccount(acc);
        acc = new Account("1002" , 200000.0);
        branch.addAccount(acc);
         
        Loan loan = new Loan(1, 50000.0, "Personal");
        branch.addLoan(loan);
        loan = new Loan(2, 25000.0, "Bussiness");
        branch.addLoan(loan);
        
        branch.removeAccount("1002");
        branch.removeLoan(1);
        
        acc = branch.getAccount("1001");
        loan = branch.getLoan(1);
        */
        
    }
    
}
