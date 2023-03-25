package it.simo.event.basic;

    //importing AWT class  
    import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
   
    
    
    @SuppressWarnings("serial")
	public class TextAreaEsempio  extends Frame implements ActionListener 
    {    
    	
    	Label l1, l2;    
    	TextArea area;    
    	Button b;    
    	Frame f;
    
         TextAreaEsempio() {  
       
        	    addWindowListener (new WindowAdapter() {    
    	            public void windowClosing (WindowEvent e) {    
    	                dispose();    
    	            }    
    	        });  
        	 
            l1 = new Label();    
            l1.setBounds(50, 50, 100, 30);    
            l2 = new Label();    
            l2.setBounds(160, 50, 150, 30);  
            b = new Button("Conta le parole");    
            b.setBounds(100, 400, 100, 30);    
   
            area = new TextArea();    
    
            area.setBounds(20, 100, 300, 300);                         
            b.addActionListener(this);        
           add(l1);  
        add(l2);  
       add(area);  
        add(b);  
      
            setSize(400, 450);    
            setLayout(null);    
            setVisible(true);    
            
                   
         }    
  
      
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = area.getText();    
	    String words[]=text.split("\\s");    
	    l1.setText("Parole: "+words.length);    
	    l2.setText("Caratteri: "+text.length());    
		
	}    
    }    
