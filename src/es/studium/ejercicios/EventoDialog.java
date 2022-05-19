package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoDialog extends Frame implements WindowListener, ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	Button btnBoton = new Button("Pulsar...");
	Dialog dlgUno = new Dialog(this, "Diálogo con mensaje", true);
	Label lblEtiqueta = new Label("Programando en JAVA...");

	public EventoDialog() {
		setLayout(new FlowLayout());
		setTitle("Ventana con Diálogo");
		setSize(300, 100);
		
		add(btnBoton);
		btnBoton.addActionListener(this);
		addWindowListener(this);
		
		dlgUno.setLayout(new FlowLayout());
		dlgUno.add(lblEtiqueta);
		dlgUno.setSize(200, 150);
		dlgUno.addWindowListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventoDialog();
	}

	public void actionPerformed(ActionEvent ae) {
		dlgUno.setVisible(true);
	}
	
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void windowClosing(WindowEvent we) {
		if (dlgUno.isActive()) {
			dlgUno.setVisible(false);
		} else {
			System.exit(0);
		}
	}
}
