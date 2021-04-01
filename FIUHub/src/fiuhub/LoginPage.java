package fiuhub;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author musaj
 */
public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userLabel = new JLabel("username");
    JLabel passLabel = new JLabel("password");
    JLabel messageLabel = new JLabel("THIS IS A TEST");
    HashMap<String, String> logininfo = new HashMap<String,String>();
    
    LoginPage(HashMap<String, String> loginInfoOriginal)
    {
        logininfo = loginInfoOriginal;
        
        userLabel.setBounds(50, 100, 75, 25);
        passLabel.setBounds(50, 150, 75, 25);
        
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
        
        usernameField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);
        
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        
        resetButton.setBounds(225, 200, 100, 25);
        loginButton.setFocusable(false);
        resetButton.addActionListener(this);
        
        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(messageLabel);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource() == resetButton)
        {
            usernameField.setText("");
            passwordField.setText("");
        }
        
        if(e.getSource() == loginButton)
        {
            String user = usernameField.getText();
            String pass = String.valueOf(passwordField.getPassword());
        
            if(logininfo.containsKey(user))
            {
                if(logininfo.get(user).equals(pass))
                {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    frame.dispose();    // close the login frame
                    WelcomePage welcomePage = new WelcomePage(user);
                }
                else
                {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong Password");
                }
            }
            else
            {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wrong Username");
            }
        }
    }
    
}