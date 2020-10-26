import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chase Staples
 * Creating a simple GUI login using java coding
 */
public class GUI_Login implements ActionListener{
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    

    public static void Prompt_GUI() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400, 190);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        //Creating user text label
        userLabel = new JLabel("User");
        userLabel.setBounds(20, 20, 80, 25);
        panel.add(userLabel);

        //Creating user text field with 20 characters
        userText = new JTextField(20);
        userText.setBounds(100, 20, 225, 25);
        panel.add(userText);
        
        //Creating password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 50, 80, 25);
        panel.add(passwordLabel);
        
        //Creating password text field
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 225, 25);
        panel.add(passwordText);
        
        //Creating button
        button = new JButton("Login");
        button.setBounds(150, 100, 80, 25);
        button.addActionListener(new GUI_Login());
        panel.add(button);
        
        //Succesful login
        success = new JLabel("");
        success.setBounds(10,120,300,25);
        panel.add(success);
        
        
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        //System.out.println("Button Clicked");
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + " + " + password);
        
        if(user.equals("ChaseStaples") && password.equals("1234")){
            success.setText("Login Successful!");
        }
        else{
           success.setText("Login Failed: Try Again!");
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Prompt_GUI();
    }
}
