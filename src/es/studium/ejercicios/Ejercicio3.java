package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Calcular el IVA");
	Label lblCantidad = new Label("Introduzca la cantidad:");
	TextField txtCantidad = new TextField(20);
	Label lblPorcentaje = new Label("Introduzca el porcentaje:");
	TextField txtPorcentaje = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	Label lblResultado = new Label("Resultado");
	TextField txtResultado = new TextField(20);
	Dialog dlgMensaje = new Dialog(ventana, "Error", true); //asociado al frame, titulo y decir si es modal o no (es modal cdo sale el diálogo y el usuario no puede interactuar con nada más)
	Label lblMensaje = new Label("Debes meter un número");
	
	Ejercicio3(){
	ventana.setSize(1000,70);
	ventana.setLayout(new FlowLayout());
	ventana.addWindowListener(this);
	ventana.add(lblCantidad);
	ventana.add(txtCantidad);
	ventana.add(lblPorcentaje);
	ventana.add(txtPorcentaje);
	btnCalcular.addActionListener(this);
	ventana.add(btnCalcular);
	ventana.add(lblResultado);
	ventana.add(txtResultado);
	txtResultado.setEnabled(false);
	dlgMensaje.setSize(175,75);
	dlgMensaje.addWindowListener(this);
	dlgMensaje.setLayout(new FlowLayout());
	dlgMensaje.add(lblMensaje);
	dlgMensaje.setLocationRelativeTo(null);
	dlgMensaje.setResizable(false);
	
	ventana.setVisible(true); //aquí NO mostramos el diálogo, solo cdo se produzca el error
	}
	
	public static void main(String[] args)
	{
		new Ejercicio3();

	}
	

	@Override
	public void windowOpened(WindowEvent e)
	{}
	public void windowClosing(WindowEvent e)
	{
		if(dlgMensaje.isActive()) {
			dlgMensaje.setVisible(false);
		}
		else {
		System.exit(0);
		}
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
		try {
			float cantidad = Float.parseFloat(txtCantidad.getText());
			float porcentaje = Float.parseFloat(txtPorcentaje.getText());
			float resultado = cantidad*porcentaje/100f;
			txtResultado.setText(String.format("%.2f €", resultado));	//plantilla
		}
		catch(NumberFormatException nfe) {
			dlgMensaje.setVisible(true);;
		}
	}
}
