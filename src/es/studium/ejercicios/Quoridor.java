package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Quoridor implements WindowListener, ActionListener {
	
	// MAIN FRAME
	Frame main_frame = new Frame("Quoridor Main Menu");
		Label lbl_title_mf = new Label("Quoridor");
		
		// Panel buttons
		Button btn_play = new Button("Play");
		Button btn_help = new Button("Help");
		Panel pnl_buttons = new Panel();
		// Panel button
		Button btn_top10 = new Button("Top 10");
		Panel pnl_button = new Panel();
	
	// HELP FRAME
	Frame help_frame = new Frame("Quoridor Main Menu");
		Label lbl_title_hf = new Label("Help");
		
		 
	
	public Quoridor() {
		
		// MAIN FRAME
			main_frame.setLayout(new GridLayout( 5, 1 ));
						
			// ROW 1
			lbl_title_mf.setAlignment( 1 );
			lbl_title_mf.setFont( new Font("Arial", Font.PLAIN, 30) );
			main_frame.add(lbl_title_mf);
			
			// ROW 2
			main_frame.add( new Panel() );
			
			// ROW 3
			btn_play.setPreferredSize( new Dimension(150,50) );
			btn_help.setPreferredSize( new Dimension(150,50) );
			btn_play.addActionListener(this);
			btn_help.addActionListener(this);
			
			pnl_buttons.add(btn_play);
			pnl_buttons.add(btn_help);
			main_frame.add(pnl_buttons);
			
			// ROW 4
			btn_top10.setPreferredSize( new Dimension(305,50) );
			pnl_button.add(btn_top10);
			main_frame.add(pnl_button);
			
			// OTHER
			main_frame.setSize(500,350);
			main_frame.setResizable(false);
			main_frame.setLocationRelativeTo(null);
			main_frame.addWindowListener(this);
			main_frame.setVisible(true);
		
		// HELP FRAME
			help_frame.setLayout(new GridLayout( 5, 1 ));
			//btnGenerar.addActionListener(this);
			
			// ROW 1
			lbl_title_hf.setAlignment( 1 );
			lbl_title_hf.setFont( new Font("Arial", Font.PLAIN, 30) );
			help_frame.add(lbl_title_hf);
		
			
			// OTHER
			help_frame.setSize(300,450);
			help_frame.setResizable(false);
			help_frame.setLocationRelativeTo(null);
			help_frame.addWindowListener(this);
			help_frame.setVisible(false);
		
		
	}
	
	public static void main(String[] args) {
		//new Quoridor();
		
		int arr[] = {0,1,2,3};
		System.out.println(arr[-1]);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn_play) {
			System.out.println("ola");
		} else if(e.getSource() == btn_help) {
			main_frame.setVisible(false);
			help_frame.setVisible(true);
		}
		
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		if(help_frame.isActive()){
			
			main_frame.setVisible(true);
			help_frame.setVisible(false);
		} else {
			System.exit(0);
		}
	}
	@Override
	public void windowClosed(WindowEvent e) {
		
	}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

}
