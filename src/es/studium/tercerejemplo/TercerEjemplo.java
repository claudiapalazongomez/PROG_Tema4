package es.studium.tercerejemplo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TercerEjemplo
{
	Frame ventana = new Frame("Componentes");
	Button btnAceptar = new Button("Aceptar"); //btn referente a botón
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);

	TercerEjemplo(){
		ventana.setSize(500,300);
		ventana.setLayout(new FlowLayout());
		//lblNombre.setLocation(100,300);
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(btnAceptar);
	
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TercerEjemplo();
	}

}
