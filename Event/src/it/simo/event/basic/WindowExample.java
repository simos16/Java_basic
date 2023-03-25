package it.simo.event.basic;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class WindowExample extends Frame {    
	
	    WindowExample() {    
	 
	        addWindowListener (new WindowAdapter() {    
	            public void windowClosing (WindowEvent e) {    
	                dispose();    
	            }    
	        });    
	 
	        setSize (400, 400);    
	        setLayout (null);    
	        setVisible (true);    
	    }   
	    
}
