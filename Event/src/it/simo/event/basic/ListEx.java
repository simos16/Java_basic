package it.simo.event.basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class ListEx extends Frame{
	
	 
    ListEx() {    
         
       addWindowListener (new WindowAdapter() {    
           public void windowClosing (WindowEvent e) {    
               dispose();    
           }    
       }); 
      
       final Label label = new Label();            
       label.setAlignment(Label.CENTER);    
       label.setSize(500, 100);    
 
      
       Button b = new Button("Mostra");   
       b.setBounds(200, 150, 80, 30);   
 
       final List l1 = new List(4, false);    
       l1.setBounds(100, 100, 70, 70);    
       l1.add("Java");    
       l1.add("JavaScript");    
       l1.add("PHP");    
       l1.add("FrontEnd");    
 
 
       final List l2=new List(4, true);    
       l2.setBounds(100, 200, 70, 70);    
       l2.add("Spring Boot");    
       l2.add("Node.js");    
       l2.add("Laravel");    
       l2.add("Vue.js");   
 
       
       add(l1);  
       add(l2);  
       add(label);  
       add(b);    
 
      
       setSize(450,450);    
       setLayout(null);    
       setVisible(true);    
 
      
       b.addActionListener(new ActionListener() {    
        
    	   public void actionPerformed(ActionEvent e) {         
         String data = "Linguaggio scelto: "+l1.getItem(l1.getSelectedIndex());    
         data += ", Framework scelto:";    
         for(String frame:l2.getSelectedItems()) {    
                  data += frame + " ";    
         }    
         label.setText(data);    
         }    
        });  
	
    }

}
