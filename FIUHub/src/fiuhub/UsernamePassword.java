/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiuhub;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
///

///

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musaj
 */
public class UsernamePassword {
    
    HashMap<String, String> login = new HashMap<String, String>();
    
    UsernamePassword()
    {
        login.put("Bro", "Pizza");
        login.put("BroCode", "abc123");
    }
    
    protected HashMap getLoginInfo()
    {
        return login;
    }
    /* //Testing
    public static Map<String, String> getMapData()
    {
        try {
            FileInputStream fileInputStream = new FileInputStream("./files/demo3.xlsx");
            
            //Workbook workbook = new XSSFWorkbook(fileInputStream);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            //Logger.getLogger(UsernamePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    */
    
    public void WriteDatabase() // Incomplete
    {
        try 
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter
            ("C:\\Users\\musaj\\OneDrive\\Documents\\Text Database\\output.txt"));
            
            bw.write("testing1");
            bw.write("testing2");
            bw.write("testing3");
            bw.close();
        } catch (IOException ex) {
            //Logger.getLogger(UsernamePassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }   
    }
    
    public void ReadDatabase()  // Incomplete, it reads entire line
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader
            ("C:\\Users\\musaj\\OneDrive\\Documents\\Text Database\\input.txt"));
            
            String str;
            while((str = br.readLine())!= null)
            {
                System.out.println(str);
            }
        } catch (Exception ex)
        {
            return;
        }
    }
    
    public void Read() throws FileNotFoundException // reads word by word
    {
        File file = new File("input.txt");
        
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine())
        {
            String username = scan.next();
            String password = scan.next();
            //System.out.println(username + " " + password);
            login.put(username, password);
        }        
    }
    
    public void print()
    {
        
    }
}