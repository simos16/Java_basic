package it.simo.swing.basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonEx {
	
	public ButtonEx() {
	JFrame f=new JFrame("Pulsante");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Cliccami");  
    b.setBounds(50,100,95,30);  
     
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
    
    
	 b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
        tf.setText("Ciao");  
    } }); 
	}
}
