package it.simo.event.basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Evento extends Frame implements ActionListener {
	//creo oggetti dei componenti
	TextField text;
	Button btn;
	
	Evento(){
		Frame finestra = new Frame("Esempio di evento");
		text = new TextField();
		//configuro posizione e dimensioni (pos x, pos y, width, height)
		text.setBounds(100,100,100,50);
		btn = new Button("Clicca qui");
		
		btn.setBounds(120,180,80,50);
		
	
		//registro l'evento
		btn.addActionListener(this);
		
		//aggiungo i componenti al frame
		finestra.add(btn);
		finestra.add(text);
		
		//dimensioni frame
		finestra.setSize(400,400);
		finestra.setLayout(null);
		finestra.setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		text.setText("Buongiorno");
		
	}

}
