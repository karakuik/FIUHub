
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musaj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        UsernamePassword usernamePasswords = new UsernamePassword();
        
        usernamePasswords.Read();
                
        LoginPage loginPage = new LoginPage(usernamePasswords.getLoginInfo());
        
        
        System.out.println(usernamePasswords);
        
        
        //usernamePasswords.WriteDatabase();
    }
    
}
