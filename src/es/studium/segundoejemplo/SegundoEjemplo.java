package es.studium.segundoejemplo;

import java.awt.Color;
import java.awt.Frame;
import java.util.Random;

public class SegundoEjemplo
{
	Color colores[] = {Color.red, Color.green, Color.magenta, Color.blue, Color.yellow}; 
	Random aleatorio = new Random();
	Frame ventana;

	SegundoEjemplo(){
		Frame ventana = new Frame();
		ventana.setBackground(colores[aleatorio.nextInt(colores.length)]);
		ventana.setSize(500,300);
		ventana.setLocation(aleatorio.nextInt(3000), aleatorio.nextInt(1000));
		
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		final int CANTIDAD = 10;
		
		for(int i = 0; i < CANTIDAD; i++) {
			new SegundoEjemplo();
		}

	}

}
