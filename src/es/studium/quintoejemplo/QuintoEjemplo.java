package es.studium.quintoejemplo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class QuintoEjemplo
{
	//Atributos o Componentes de la clase
	Frame ventana = new Frame("GridLayout"); //aquí tb se puede poner el título de la ventana
	Button btnAceptar = new Button("Aceptar"); 
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20); //20 es el ancho del textfield
	
	QuintoEjemplo(){
		ventana.setSize(500,65);
		ventana.setLayout(new GridLayout(1,3)); //le especificas las filas y las columnas que quieres
		ventana.add(lblNombre);
		ventana.add(txtNombre);
		ventana.add(btnAceptar);
	
		
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new QuintoEjemplo();

	}

}
