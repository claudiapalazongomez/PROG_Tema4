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

public class Ejercicio2 implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Conversión de temperaturas:"); 
	Button btnFahrenheit = new Button("Celsius a Fahrenheit"); 
	Button btnCelsius = new Button("Fahrenheit a Celsius"); 
	Label lblCelsius = new Label("Celsius");
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtCelsius = new TextField(20); 
	TextField txtFahrenheit = new TextField(20);
	
	Ejercicio2(){
		ventana.setSize(500,150);
		ventana.setLayout(new GridLayout(3,2));
		ventana.addWindowListener(this);
		ventana.add(lblCelsius);
		ventana.add(txtCelsius);
		ventana.add(lblFahrenheit);
		ventana.add(txtFahrenheit);
		btnFahrenheit.addActionListener(this);
		ventana.add(btnFahrenheit);
		btnCelsius.addActionListener(this);
		ventana.add(btnCelsius);
		
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio2();

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
		if (e.getSource().equals(btnFahrenheit))
		{
			if (!txtCelsius.getText().equals(""))
			{ // para que si le das y está vacío no te de un error
				float grados = (Float.parseFloat(txtCelsius.getText()) * 9.0f / 5.0f) + 32.0f;
				txtFahrenheit.setText(grados + "");
			}
		} else
		{
			if (!txtFahrenheit.getText().equals(""))
			{
				if (e.getSource().equals(btnCelsius))
				{
					float fahrenheit = (Float.parseFloat(txtFahrenheit.getText()) - 32.0f) * 5.0f / 9.0f;
					txtCelsius.setText(fahrenheit + "");
				}
			}
		}

	}
}
