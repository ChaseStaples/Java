
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S528345
 */
public class GUI_Login {
    
    public static void Prompt_GUI(){
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        
        
        frame.setVisible(true);
        
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Prompt_GUI();
    }
}
