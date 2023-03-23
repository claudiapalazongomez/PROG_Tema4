package es.studium.cuartoejemplo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class CuartoEjemplo
{
	//Atributos o Componentes de la clase
	Frame ventana = new Frame("Absoluto"); //aquí tb se puede poner el título de la ventana
	Button btnAceptar = new Button("Aceptar"); 
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20); //20 es el ancho del textfield
	
	//Constructor
	CuartoEjemplo(){
		ventana.setSize(500,300);
		ventana.setLayout(null);
		lblNombre.setBounds(30,50,50,20); //bounds son los límites (la primera posición es la x y la segunda la y, las otras dos es lo que ocupa (ancho y alto))
		ventana.add(lblNombre);
		txtNombre.setBounds(80,50,100,20);
		ventana.add(txtNombre);
		btnAceptar.setBounds(180,50,50,20);
		ventana.add(btnAceptar);
		
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new CuartoEjemplo();
		

	}

}
