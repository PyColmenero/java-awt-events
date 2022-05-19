package es.studium.ejercicios;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoChoice extends Frame implements WindowListener, ItemListener {
	private static final long serialVersionUID = 1L;
	Choice lista = new Choice();

	public EventoChoice() {
		
		setLayout(new FlowLayout());
		setTitle("Lista");
		
		lista.add("Blanco");
		lista.add("Rojo");
		lista.add("Azul");
		add(lista);
		
		addWindowListener(this);
		lista.addItemListener(this);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventoChoice();
	}

	public void itemStateChanged(ItemEvent ie) {
		
		if ("Blanco".equals(ie.getItem())) {
			setBackground(Color.white);
		} else if ("Rojo".equals(ie.getItem())) {
			setBackground(Color.red);
		} else {
			setBackground(Color.blue);
		}
	}

	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}
