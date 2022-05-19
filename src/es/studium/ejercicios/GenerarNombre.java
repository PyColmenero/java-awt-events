package es.studium.ejercicios;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class GenerarNombre implements WindowListener, ActionListener {

	Frame ventana = new Frame("Nombres");
	Label lblNombre = new Label("Nombre");
	Label lblApellidos = new Label("Apellidos");
	TextField txtNombre = new TextField(20);
	TextField txtApellidos = new TextField(20);
	Button btnGenerar = new Button ("Generar");

	public GenerarNombre() {

		ventana.setLayout(new FlowLayout());
		btnGenerar.addActionListener(this);

		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(lblApellidos);
		ventana.add(txtApellidos);
		ventana.add(btnGenerar);

		ventana.setSize(270,150);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.addWindowListener(this);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		new GenerarNombre();
	}
	
	public void actionPerformed(ActionEvent evento) {

		String[] nombres = {"ANTONIO","BALDO", "MANUEL", "MARIA", "JOSE", "CARMEN", "FRANCISCO", "ANA", "DAVID", "JOSEFA", "JUAN", "ISABEL", "JOSE", "PILAR", "JAVIER", "DOLORES", "DANIEL", "LAURA", "LUIS", "TERESA", "CARLOS", "CRISTINA", "JESUS", "MARTA", "ALEJANDRO", "ANGELES", "MIGUEL", "FRANCISCA", "LUCIA", "RAFAEL", "ANGEL", "PEDRO", "ANTONIA", "PABLO", "DOLORES", "ANGEL", "SARA", "SERGIO", "PAULA", "ELENA", "FERNANDO", "LUISA", "JORGE", "RAQUEL", "LUIS", "ROSA", "ALBERTO", "PILAR", "CONCEPCION", "ALVARO", "MANUELA", "ADRIAN", "JESUS", "MERCEDES", "DIEGO", "JULIA", "RAUL", "BEATRIZ", "IVAN", "NURIA", "SILVIA", "RUBEN", "ROSARIO", "ENRIQUE", "JUANA", "OSCAR", "ALBA", "RAMON", "IRENE", "VICENTE", "TERESA", "ANDRES", "ENCARNACION", "PATRICIA", "JOAQUIN", "MONTSERRAT", "SANTIAGO", "ANDREA", "VICTOR", "ROCIO", "EDUARDO", "MONICA", "MARIO", "ROBERTO", "ALICIA", "JAIME", "MAR", "SONIA", "MARCOS", "SANDRA", "IGNACIO", "ANGELA", "ALFONSO", "MARINA", "JORDI", "SUSANA", "HUGO", "NATALIA", "RICARDO", "YOLANDA", "SALVADOR", "MARGARITA", "GUILLERMO", "EMILIO", "CLAUDIA", "GABRIEL", "EVA", "MARC", "GONZALO", "INMACULADA", "JULIO", "SOFIA", "JULIAN", "MOHAMED", "CARLA", "TOMAS", "ESTHER", "MARTIN", "NOELIA", "AGUSTIN", "VERONICA", "ANGELES", "NICOLAS", "NEREA", "ISMAEL", "CAROLINA", "JOAN", "VICTORIA", "FELIX", "SAMUEL", "INES", "CRISTIAN", "MIRIAM", "AITOR", "LUCAS", "DANIELA", "HECTOR", "LORENA", "BELEN", "IKER", "JOSEP", "VICTORIA", "ALEX", "AMPARO", "MARIANO", "DOMINGO", "CATALINA", "SEBASTIAN", "MARTINA", "ALFREDO", "LIDIA", "CESAR", "ALEJANDRA", "CELIA", "FELIPE", "NIEVES", "IGNACIO", "CONSUELO", "VICTOR", "OLGA", "RODRIGO", "AINHOA", "FATIMA", "MATEO", "GLORIA", "EMILIA", "SOLEDAD", "XAVIER", "CLARA", "ALBERT", "GREGORIO", "LUISA", "PAU", "AURORA", "LORENZO", "ESPERANZA", "VIRGINIA", "ESTEBAN", "ANNA", "BORJA", "VANESA", "CRISTOBAL", "MILAGROS", "AARON", "ADRIANA", "ARTURO", "JOSEFINA", "ERIC", "LUZ", "LOURDES", "IZAN", "BLANCA", "EUGENIO", "PURIFICACION", "ISAAC", "BEGOÑA", "MOHAMMED", "ESTEFANIA", "JOEL", "BEGOÑA", "ELISA", "GEMA", "ASIER", "JAUME", "VALERIA", "GERMAN", "LAIA", "ABEL", "EMMA", "JONATHAN", "MAGDALENA", "DARIO", "LOURDES", "VALENTIN", "PAZ", "VICENTE", "ARACELI", "UNAI", "ESTHER", "MIKEL", "TAMARA", "BRUNO", "MATILDE", "MOISES", "ASUNCION", "SERGI", "REMEDIOS", "AHMED", "VICENTA", "CHRISTIAN", "ELVIRA", "NOA", "MARCO", "REBECA", "ADOLFO", "SOLEDAD", "PALOMA", "IÑIGO", "GEMMA", "TRINIDAD", "GERARD", "MIREIA", "JON", "VANESSA", "POL", "ALMUDENA", "OMAR", "ARIADNA", "ERNESTO", "NATIVIDAD", "ISIDRO", "INMACULADA", "ARNAU", "CRUZ", "MIQUEL", "NOEMI", "BENITO", "AITANA", "ISRAEL", "VALENTINA", "ORIOL", "ASCENSION", "LEO", "CARLOTA", "AMPARO", "BERNARDO", "TANIA", "GERARDO", "EUGENIA", "ELOY", "NIEVES", "JONATAN", "DIANA", "CARMELO", "RAFAELA", "FEDERICO", "LEIRE", "ADAM", "ADELA", "FRANCESC", "FELISA", "PASCUAL", "JESSICA", "ROCIO", "AINARA", "AMALIA", "ADRIA", "CARMEN", "ROGER", "AMELIA", "ALONSO", "LARA", "JOSEP", "LEONOR", "BARTOLOME", "RAMONA", "IÑAKI", "ELISABET", "KEVIN", "LETICIA", "ELIAS", "CANDELA", "OLIVER", "BARBARA", "BENJAMIN", "MARIANA", "SAUL", "JOAQUINA", "CARLES", "AROA", "MATIAS", "JUDITH", "MARCELINO", "GUADALUPE", "PERE", "ESTER", "PABLO", "CECILIA", "FERMIN", "GABRIELA", "MARTI", "MAGDALENA", "SHEILA", "LLUIS", "BERTA", "GUILLEM", "JENNIFER", "ANTONI", "JUDIT", "ANDER", "JULIANA", "MARCO", "PETRA", "ROSALIA", "ERIK", "ALEXANDRA", "ALEXANDER", "ESTRELLA", "AGUSTINA", "HELENA", "AURELIO", "ABRAHAM", "LOLA", "SORAYA", "XABIER", "RUTH", "SAID", "MONTSERRAT", "ALEIX", "JIMENA", "GORKA", "ADORACION", "JERONIMO", "NADIA", "JULEN", "YOLANDA", "JACINTO", "GLORIA", "ROMAN", "ELSA", "FERRAN", "MILAGROS", "EUSEBIO", "CONSUELO", "GUSTAVO", "ERIKA", "NAIARA", "PAOLA", "AIDA", "VICTORIANO", "MAR", "DAMIAN", "AINA", "OLIVIA", "LEONARDO", "LEYRE", "EUGENIA", "YERAY", "ESTELA", "RACHID", "MACARENA", "ISIDORO", "REMEDIOS", "ENRIC", "ELISABETH", "YAIZA", "ENZO", "AFRICA", "JAN", "EULALIA", "BAUTISTA", "REYES", "ARMANDO", "TATIANA", "AMAIA", "BLAS", "HERMINIA", "TEODORO", "SARAY", "DIONISIO", "ARANZAZU", "SANTOS", "AMANDA", "GINES", "ENRIQUETA", "CANDIDO", "TRINIDAD", "JUSTO", "ITZIAR", "ARANZAZU", "EDUARD", "ESPERANZA", "FLORENCIO", "JOANA", "ALI", "IRIA", "KHADIJA", "ENEKO", "VERA", "JAIRO", "IRIS", "PIEDAD", "EDGAR", "MAITE", "EMILIANO", "FLORENTINA", "IAN", "MIRIAN", "ANE"};
		String[] apellidos = {"RODRIGUEZ","ORTEGA","MORO", "GARCÍA", "GUTIERREZ", "FORQUE", "DE ESTEBAN", "MORILLO", "ROMERO", "ALCAIDE", "PÉREZ", "CALVO", "LÓPEZ", "RUIZ","VÁZQUEZ","GOMEZ"};
		Random generadorAleatorios = new Random();
		
		int nombreAleatorio = generadorAleatorios.nextInt(nombres.length);
		int primerApellido =generadorAleatorios.nextInt(apellidos.length);
		int segundoApellido =generadorAleatorios.nextInt(apellidos.length);
		
		txtNombre.selectAll();
		txtNombre.setText(nombres[nombreAleatorio]);
		txtApellidos.selectAll();
		txtApellidos.setText(apellidos[primerApellido].toString() + " " + apellidos[segundoApellido].toString());
	}
	
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}

}