/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuhub;
import java.io.FileNotFoundException;
/**
 *
 * @author Ryan
 */
public class FIUHub {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
         System.out.println("Begin");
        UsernamePassword usernamePasswords = new UsernamePassword();
        
        usernamePasswords.Read();
                
        LoginPage loginPage = new LoginPage(usernamePasswords.getLoginInfo());
        
        
        System.out.println(usernamePasswords);
        
        
        //usernamePasswords.WriteDatabase();
    }
    
}
