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
class Bank {
    String Name;
    String Code;
    ArrayList<Branch> branchlist = new ArrayList();
    
     Bank(){
        Name = "";
        Code = "";
    }
     Bank(String name,String code){
        Name = name;
        Code = code;
    }    
    public void addBranch(Branch branch){
        branchlist.add(branch);
    }
    public boolean removeBranch(String code){
        for(int i=0; i< branchlist.size();i++){
            Branch branch = branchlist.get(i);
            if(branch.Branch_Code.equals(code))
            {
                branchlist.remove(branch);
                return true;
            }
        }
        return false;
    }
    public Branch getBranch(String code){
        for(int i=0; i< branchlist.size();i++){
            Branch branch = branchlist.get(i);
            if(branch.Branch_Code.equals(code))
            {
                return branch;
            }
        }
        return null;
    }
    public ArrayList<Branch> getAllBranches(){
            return branchlist;
    }
    public boolean setbranchZHO(String code, String zho){
        for(int i=0; i< branchlist.size();i++){
            if(branchlist.get(i).Branch_Code.equals(code))
            {
                branchlist.get(i).setZHO(zho);
                return true;
            }
        }
        return false;
    }
    public String displayBranch(){
        int i;
        String res = ("Available Branches =>\n");
        
        System.out.println("Available Branches :");
        for(i=0; i< branchlist.size();i++){
            Branch branch = branchlist.get(i);
            System.out.println("Branch " + (i+1) + " =>");
            System.out.print("Branch Code = ");
            System.out.println(branch.Branch_Code);
            System.out.print("Branch City = ");
            System.out.println(branch.City);
            System.out.print("Zone Head Office = ");
            System.out.println(branch.ZHO);
            
            res = res + ("Branch " + String.valueOf(i+1)+" Data :\n");
            res = res + ("Branch Code          = " + branch.Branch_Code + "\n");
            res = res + ("Branch City             = " + branch.City + "\n");
            res = res + ("Zone Head Office   = " + branch.ZHO + "\n");
            
        }
        if(i==0){
            res = res + ("Bank Didn't Have Any Branch yet!\n");
            System.out.println("Bank Didn't Have Any Branch yet!");
        }
        System.out.println("------------------------------------");
        
        return res;
    }
}
