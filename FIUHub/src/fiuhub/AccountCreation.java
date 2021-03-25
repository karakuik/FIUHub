/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package fiuhub;

import java.util.*;
/**
 *
 * @author Ryan
 */
public class AccountCreation {
    private String username;
    private String password;
    private String email;
    Scanner scan = new Scanner(System.in);
    
    public AccountCreation(){
        
    }
    
    //Might remove, hate having to repeat code.
    public String enterInfoString(){
        String str = scan.nextLine();
        scan.nextLine();
        
        return str;
    }
    
    public void creation(){
        String entry = new String();
        System.out.println("Please enter in a valid UserName and Password.");
        System.out.println("Passwords must be 8 characters in length, contain at least 1 capital and 1 special character.");
        
        System.out.print("UserName > ");
        entry = scan.nextLine();
        //flush
        scan.nextLine();
        this.setUsername(entry);
        
        System.out.print("\n\nPassWord >");        
        entry = scan.nextLine();
        scan.nextLine();
        this.setPassword(entry);  
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String resetPassword(String password){
        String newPassword = "";
        
        //System.out.println("We have your request to change your password.");
        if(this.password.equals(password)){
            System.out.println("Password accepted, please enter a new Password.");
            
            //Will have to run this through a password checker to check if valid
            newPassword = scan.nextLine();
            //Flush Scanner
            scan.nextLine();
        }
        else{
            //After 3 tries lock out.
            int tries = 0;
            while(!this.password.equals(password)){
                
                if(tries > 3){
                    System.out.println("Returning, too many invalid tries.");
                    return "";
                }
                
                tries++;
                
                System.out.println("Invalid Password please try again.");
                password = scan.nextLine();
                //Flush Scanner
                scan.nextLine();
            }
        }
        
        
        return newPassword;
    }
    
}
