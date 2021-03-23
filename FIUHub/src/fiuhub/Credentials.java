//@author Kevin

package fiuhub;
import java.util.*;

public class Credentials {    
    void loginInfo() {
        boolean valid = false; //boolean value that determines if login credentials are valid
        String loginUsrname;
        String loginPassword;
        ArrayList<account> database = new ArrayList<>(); //database to store information of all accounts
        
        //test values to save in the database
        account test = new account();
        test.Usrname = "yes";
        test.Password = "no";
        database.add(0, test);
        System.out.println("Test Username: " + database.get(0).Usrname);
        System.out.println("Test Password: " + database.get(0).Password);
    
        Scanner in = new Scanner(System.in);
    
        //prompt to ask user to enter username and password
        System.out.println("Enter Username");
        loginUsrname = in.nextLine();
        
        System.out.println("Enter Password");
        loginPassword = in.nextLine();
        
        //login information gets saved in a new account object
        account loginAcc = new account();
        loginAcc.Usrname = loginUsrname;
        loginAcc.Password = loginPassword;
        System.out.println("Login Username: " + loginAcc.Usrname);
        System.out.println("Login Password: " + loginAcc.Password);
        
        //loops through the database and compare login info to database enteries
        for(int i = 0; i < database.size(); i++) {
            if(database.get(i).Usrname.equals(loginAcc.Usrname) && database.get(i).Password.equals(loginAcc.Password)) {
                valid = true;
                break;
            }
        }
        
        System.out.println(valid);
        
        
    }
}

//account information will be stored in an account object
class account {
    String Usrname;
    String Password;
}
