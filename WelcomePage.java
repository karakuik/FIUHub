
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musaj
 */
public class WelcomePage {
    
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    
    WelcomePage(String user)
    {
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + user);
        
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
