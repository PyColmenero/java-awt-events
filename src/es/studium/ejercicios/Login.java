package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login implements WindowListener,ActionListener {
	Frame ventanaLogin = new Frame("Login");
	Label lblUsuario = new Label("Usuario");
	Label lblClave = new Label("Clave");
	TextField txtUsuario = new TextField(20);
	TextField txtClave = new TextField(20);

	Button btnAceptar = new Button ("Aceptar");
	Button btnLimpiar = new Button("Limpiar");

	Frame ventanaInicio = new Frame("Gestión v1.0");
	Dialog dlgError = new Dialog(ventanaInicio, "Error Login", true);
	Label lblInicio = new Label("Bienvenido");
	Label lblError = new Label("Credenciales Incorrectas");

	public Login() {
		
		// VENTANA LOGIN
		ventanaLogin.setLayout(new FlowLayout());
		btnAceptar.addActionListener(this);
		btnLimpiar.addActionListener(this);

		ventanaLogin.add(lblUsuario);
		ventanaLogin.add(txtUsuario);
		
		ventanaLogin.add(lblClave);
		txtClave.setEchoChar('*');
		ventanaLogin.add(txtClave);
		
		ventanaLogin.add(btnAceptar);
		ventanaLogin.add(btnLimpiar);
		
		ventanaLogin.setSize(250,150);
		ventanaLogin.setResizable(false);
		ventanaLogin.setLocationRelativeTo(null);
		ventanaLogin.addWindowListener(this);
		ventanaLogin.setVisible(true);
		
		// VENTANA INICIO
		ventanaInicio.setLayout(new FlowLayout());
		ventanaInicio.add(lblInicio);
		ventanaInicio.setSize(200,150);
		ventanaInicio.setLocationRelativeTo(null);
		ventanaInicio.addWindowListener(this);
		
		// DIALOGO ERROR
		dlgError.setLayout(new FlowLayout());
		dlgError.add(lblError);
		dlgError.setSize(200,150);
		dlgError.setLocationRelativeTo(null);
		dlgError.addWindowListener(this);

		
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
	public void actionPerformed(ActionEvent evento) {

		Object botonPulsado = evento.getSource();
		String usuario = "baldo";
		String clave = "1234";

		if (botonPulsado == btnAceptar) {
			if (txtUsuario.getText().equals(usuario) && txtClave.getText().equals(clave)) {
				ventanaInicio.setVisible(true);
				ventanaLogin.setVisible(false);
			}else {
				dlgError.setVisible(true);
			}
		} else if (botonPulsado == btnLimpiar) {
			txtUsuario.selectAll();
			txtUsuario.setText("");
			txtClave.selectAll();
			txtClave.setText("");
			txtUsuario.requestFocus();
		}	
	}
	public void windowClosing(WindowEvent arg0) {

		if(dlgError.isActive()){
			dlgError.setVisible(false);
			
		}else if (ventanaInicio.isActive()) {
			ventanaInicio.setVisible(false);
			txtUsuario.selectAll();
			txtUsuario.setText("");
			txtClave.selectAll();
			txtClave.setText("");
			txtUsuario.requestFocus();
			ventanaLogin.setVisible(true);
		}
		else{
			System.exit(0);
		}
	}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

}