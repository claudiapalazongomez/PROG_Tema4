package es.studium.sextoejemplo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class SextoEjemplo
{
	Frame ventana = new Frame("Border Layout:");
	
	Button btnNorte = new Button("Norte");
	Button btnSur = new Button("Sur");
	Button btnEste = new Button("Este");
	Button btnOeste = new Button("Oeste");
	Button btnCentro = new Button("Centro");
	
	Panel pnlNorte = new Panel();
	Panel pnlSur = new Panel();
	Panel pnlEste = new Panel();
	Panel pnlOeste = new Panel();
	Panel pnlCentro = new Panel();
	
	SextoEjemplo(){
		ventana.setSize(400,140);
		ventana.setLayout(new BorderLayout());
		
		pnlNorte.add(btnNorte);
		pnlSur.add(btnSur);
		pnlEste.add(btnEste);
		pnlOeste.add(btnOeste);
		pnlCentro.add(btnCentro);
		
		ventana.add(pnlNorte, "North");
		ventana.add(pnlEste, "East");
		ventana.add(pnlSur, "South");
		ventana.add(pnlOeste, "West");
		ventana.add(pnlCentro, "Center");
		
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new SextoEjemplo();
	}

}
