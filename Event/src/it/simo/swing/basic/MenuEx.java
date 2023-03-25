package it.simo.swing.basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuEx implements ActionListener{
	
	
	JFrame f;    
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll;    
	JTextArea ta;    
	MenuEx(){    
	f=new JFrame();    
	cut=new JMenuItem("taglia");    
	copy=new JMenuItem("copia");    
	paste=new JMenuItem("incolla");    
	selectAll=new JMenuItem("seleziona");    
	cut.addActionListener(this);    
	copy.addActionListener(this);    
	paste.addActionListener(this);    
	selectAll.addActionListener(this);    
	mb=new JMenuBar();    
	file=new JMenu("File");    
	edit=new JMenu("Edit");    
	help=new JMenu("Help");     
	edit.add(cut);
	edit.add(copy);
	edit.add(paste);
	edit.add(selectAll);    
	mb.add(file);
	mb.add(edit);
	mb.add(help);    
	ta=new JTextArea();    
	ta.setBounds(5,5,360,320);    
	f.add(mb);f.add(ta);    
	f.setJMenuBar(mb);  
	f.setLayout(null);    
	f.setSize(400,400);    
	f.setVisible(true);    
	}     
	
	@Override
	public void actionPerformed(ActionEvent e) {    
	if(e.getSource()==cut)    
	ta.cut();    
	if(e.getSource()==paste)    
	ta.paste();    
	if(e.getSource()==copy)    
	ta.copy();    
	if(e.getSource()==selectAll)    
	ta.selectAll(); 
	
	
	}
}

	
