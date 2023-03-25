package it.simo.event.basic;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class Mouse extends Frame implements MouseListener{

	Label etichetta;
	
	
	    Mouse(){  
	        addMouseListener(this);   
	        etichetta=new Label();  
	        etichetta.setBounds(20,50,150,40);  
	        add(etichetta);  
	        setSize(400,400);  
	        setLayout(null);  
	        setVisible(true);  
	    }  
	    public void mouseReleased(MouseEvent e) {  
	        etichetta.setText("Mouse rilasciato");  
	    }  
	    public void mouseClicked(MouseEvent e) {  
	        etichetta.setText("Mouse cliccato");  
	    }  
	    public void mouseEntered(MouseEvent e) {  
	        etichetta.setText("Mouse entra");
	        
	    }  
	    public void mouseExited(MouseEvent e) {  
	        etichetta.setText("Mouse esce");  
	    }  
	    public void mousePressed(MouseEvent e) {  
	        etichetta.setText("Mouse premuto");  
	    }  
	    
}
