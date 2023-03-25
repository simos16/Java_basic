package it.simo.event.basic;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class CheckboxEx extends Frame {
	 
    public CheckboxEx() {    
 
       Frame f = new Frame ("Esempio Check");    
 
       final Label label = new Label();            
    
       label.setAlignment(Label.CENTER);    
       label.setSize(400,100);    

       Checkbox checkbox1 = new Checkbox("JavaSE");    
       checkbox1.setBounds(100, 100,  100, 50);    
       Checkbox checkbox2 = new Checkbox("JavaEE");    
       checkbox2.setBounds(100, 150,  100, 50);    
 
       f.add(checkbox1);  
       f.add(checkbox2);   
       f.add(label);    
 

       checkbox1.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label.setText("Java SE: "     
               + (e.getStateChange()== 1 ? "scelto":"non scelto"));    
            }    
         });    
       checkbox2.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               label.setText("Java EE: "     
               + (e.getStateChange()== 1 ? "scelto":"non scelto"));    
            }    
         });    

       f.setSize(400,400);    
       f.setLayout(null);    
       f.setVisible(true);    
    }  
	
	

}
