package es.studium.ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Aficiones");
	Panel pnlChecks = new Panel();
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");
	Panel pnlButton = new Panel();
	Button btnComprobar = new Button("Comprobar");
	
	Ejercicio4(){
		ventana.setSize(300,150);
		ventana.setLayout(new BorderLayout());
		pnlChecks.setLayout(new FlowLayout());
		pnlButton.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		pnlChecks.add(chkCorrer);
		pnlChecks.add(chkNadar);
		pnlChecks.add(chkAndar);
		pnlChecks.add(chkLeer);
		pnlChecks.add(chkCine);
		pnlChecks.add(chkBailar);
		pnlChecks.add(chkFutbol);
		pnlChecks.add(chkTenis);
		pnlChecks.add(chkBaloncesto);
		pnlChecks.add(chkVela);
		btnComprobar.addActionListener(this);
		pnlButton.add(btnComprobar);
		
		ventana.add(pnlChecks, "Center");
		ventana.add(pnlButton, "South");
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio4();

	}

	@Override
	public void windowOpened(WindowEvent e)
	{}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent e)
	{}
	public void windowIconified(WindowEvent e)
	{}
	public void windowDeiconified(WindowEvent e)
	{}
	public void windowActivated(WindowEvent e)
	{}
	public void windowDeactivated(WindowEvent e)
	{}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(chkCorrer.getState())	{
			System.out.println("Correr");
		}
		if(chkNadar.getState())	{
			System.out.println("Nadar");
		}
		if(chkAndar.getState())	{
			System.out.println("Andar");
		}
		if(chkLeer.getState())	{
			System.out.println("Leer");
		}
		if(chkCine.getState())	{
			System.out.println("Cine");
		}
		if(chkBailar.getState())	{
			System.out.println("Bailar");
		}
		if(chkFutbol.getState())	{
			System.out.println("Fútbol");
		}
		if(chkTenis.getState())	{
			System.out.println("Tenis");
		}
		if(chkBaloncesto.getState())	{
			System.out.println("Baloncesto");
		}
		if(chkVela.getState())	{
			System.out.println("Deportes de Vela");
		}
	}
}
