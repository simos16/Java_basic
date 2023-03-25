package it.simo.event.basic;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

@SuppressWarnings("serial")
public class Motion extends Frame implements MouseMotionListener {
	
	Label l;  
    Color c;  
	
	public Motion() {
			
	     
	    l=new Label();  
	    l.setBounds(20,40,100,20);  
	    add(l);  
	    
		
		
		addMouseMotionListener(this);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		 Graphics g=getGraphics();  
		    g.setColor(Color.GREEN);  
		    g.fillOval(e.getX(),e.getY(),30,30);  
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		l.setText("X="+e.getX()+", Y="+e.getY());  
		
	
	
	}

}
