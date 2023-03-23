package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements ActionListener, WindowListener
{
	//Atributos o Componentes de la clase
		Frame ventana = new Frame("Horas"); 
		Button btnAceptar = new Button("Calcular"); 
		Label lblHoras = new Label("HH:");
		Label lblHoras2 = new Label("HH:");
		Label lblMinutos = new Label("MM:");
		Label lblMinutos2 = new Label("MM:");
		TextField txtHoras = new TextField(20); 
		TextField txtMinutos = new TextField(20);
		TextField txtHoras2 = new TextField(20);
		TextField txtMinutos2 = new TextField(20);
		TextField txtCalcular = new TextField(20);
		
		Ejercicio1(){
			ventana.setSize(500,150);
			ventana.setLayout(new GridLayout(3,4));
			ventana.addWindowListener(this);
			ventana.add(lblHoras);
			ventana.add(txtHoras);
			ventana.add(lblMinutos);
			ventana.add(txtMinutos);
			ventana.add(lblHoras2); //edit -> find replace -> cambiar el 1 por el 2 
			ventana.add(txtHoras2);
			ventana.add(lblMinutos2);
			ventana.add(txtMinutos2);
			btnAceptar.addActionListener(this);
			ventana.add(btnAceptar);
			ventana.add(txtCalcular);
			txtCalcular.setEnabled(false);
			
			ventana.setVisible(true);
			
		}

	public static void main(String[] args)
	{
		new Ejercicio1();

	}

	@Override
	public void windowOpened(WindowEvent e)
	{}
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}
	@Override
	public void windowClosed(WindowEvent e)
	{}
	@Override
	public void windowIconified(WindowEvent e)
	{}
	@Override
	public void windowDeiconified(WindowEvent e)
	{}
	@Override
	public void windowActivated(WindowEvent e)
	{}

	@Override
	public void windowDeactivated(WindowEvent e)
	{}

	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int horas1 = Integer.parseInt(txtHoras.getText());
		int horas2 = Integer.parseInt(txtHoras2.getText());
		int minutos1 = Integer.parseInt(txtMinutos.getText());
		int minutos2 = Integer.parseInt(txtMinutos2.getText());
		int horas = Math.abs((horas1*60+minutos1)-(horas2*60+minutos2));
		txtCalcular.setText(String.format("%02d:%02d", horas/60, horas%60));	
	}

}
