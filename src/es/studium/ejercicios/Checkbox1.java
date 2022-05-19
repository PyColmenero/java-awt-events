package es.studium.ejercicios;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Checkbox1 extends Frame implements WindowListener, ItemListener {
	private static final long serialVersionUID = 1L;
	
	Checkbox chkUno = new Checkbox("Uno");
	Checkbox chkDos = new Checkbox("Dos");
	Checkbox chkTres = new Checkbox("Tres");
	Label lblEtiqueta1 = new Label("Desactivado");
	Label lblEtiqueta2 = new Label("Desactivado");
	Label lblEtiqueta3 = new Label("Desactivado");

	public Checkbox1()
	{
		setLayout(new FlowLayout());
		setTitle("Botones de Opción");
		
		add(chkUno);
		add(lblEtiqueta1);
		add(chkDos);
		add(lblEtiqueta2);
		add(chkTres);
		add(lblEtiqueta3);
		addWindowListener(this);
		
		// Añadir los listeners a los botones de opción
		chkUno.addItemListener(this);
		chkDos.addItemListener(this);
		chkTres.addItemListener(this);
		setBounds(-1550, 50, 500,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Checkbox1();
	}


	public void itemStateChanged(ItemEvent ie) {

		if ("Uno".equals(ie.getItem())) {

			if (ie.getStateChange() == ItemEvent.SELECTED) {
				lblEtiqueta1.setText("Activado");
			} else {
				lblEtiqueta1.setText("Desactivado");
			}
			
		} else if ("Dos".equals(ie.getItem())) {
			
			if (ie.getStateChange() == ItemEvent.SELECTED) {
				lblEtiqueta2.setText("Activado");
			} else {
				lblEtiqueta2.setText("Desactivado");
			}
			
		} else if ("Tres".equals(ie.getItem())) {
			
			if (ie.getStateChange() == ItemEvent.SELECTED) {
				lblEtiqueta3.setText("Activado");
			} else {
				lblEtiqueta3.setText("Desactivado");
			}
			
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
