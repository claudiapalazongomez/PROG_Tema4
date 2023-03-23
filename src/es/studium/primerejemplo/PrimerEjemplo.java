package es.studium.primerejemplo;

import java.awt.Color;
import java.awt.Frame;

public class PrimerEjemplo
{
	Frame ventana = new Frame();
	
	PrimerEjemplo(){
		ventana.setTitle("Ventana"); 
		ventana.setBackground(Color.DARK_GRAY);
		ventana.setSize(500,300);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		
		ventana.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		new PrimerEjemplo();
	}

}
