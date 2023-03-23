package es.studium.AwtGbag;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class AwtGBag
{
	// Contenedor
	Frame ventana = new Frame("AwtGBag");
	// Componentes
	Button btnBoton0 = new Button("Bot�n 0");
	Button btnBoton1 = new Button("Bot�n 1");
	Button btnBoton2 = new Button("Bot�n 2");
	Button btnBoton3 = new Button("Bot�n 3");
	Button btnBoton4 = new Button("Bot�n 4");
	Button btnBoton5 = new Button("Bot�n 5");
	Button btnBoton6 = new Button("Bot�n 6");
	Button btnBoton7 = new Button("Bot�n 7");
	Button btnBoton8 = new Button("Bot�n 8");
	Button btnBoton9 = new Button("Bot�n 9");

	public AwtGBag()
	{
		// Crear la distribuci�n
		GridBagLayout gridbag = new GridBagLayout();
		// Crear las restricciones
		GridBagConstraints gbc = new GridBagConstraints();
		// Establecer la distribuci�n
		ventana.setLayout(gridbag);
		// Establecer restricciones generales
		gbc.fill = GridBagConstraints.BOTH; //estamos diciendo que rellene en ambos sentidos la distribuci�n de los botones
		// Definir restricciones para el primer bot�n
		gbc.weightx = 1.0; // Como si fuera 1 columna
		// Aplicar restricciones al bot�n
		gridbag.setConstraints(btnBoton0,gbc);
		//A�adir bot�n
		ventana.add(btnBoton0);
		// Aplicar restricciones a los dem�s botones
		gridbag.setConstraints(btnBoton1,gbc);
		ventana.add(btnBoton1);
		gridbag.setConstraints(btnBoton2,gbc);
		ventana.add(btnBoton2);
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Espacio restante
		gridbag.setConstraints(btnBoton3,gbc);
		ventana.add(btnBoton3);
		gbc.weightx = 0.0; // Reset
		gridbag.setConstraints(btnBoton4,gbc);
		ventana.add(btnBoton4);
		gbc.gridwidth = GridBagConstraints.RELATIVE; // Ancho relativo (ocupa el ancho que le deja el bot�n 6)
		gridbag.setConstraints(btnBoton5,gbc );
		ventana.add(btnBoton5);
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Lo que quede
		gridbag.setConstraints(btnBoton6,gbc);
		ventana.add(btnBoton6);
		gbc.gridwidth = 1; // Ancho de 1 oclumna
		gbc.gridheight = 2; // Alto de 2 filas
		gbc.weighty = 1.0; // Tama�o relativo
		gridbag.setConstraints(btnBoton7,gbc);
		ventana.add(btnBoton7);
		gbc.weighty = 0.0; // Reset
		gbc.gridwidth = GridBagConstraints.REMAINDER; // Lo que quede
		gbc.gridheight = 1; // Alto de 1 fila
		gridbag.setConstraints(btnBoton8,gbc);
		ventana.add(btnBoton8);
		gridbag.setConstraints(btnBoton9,gbc);
		ventana.add(btnBoton9);
		
		// Tama�o de la ventana
		ventana.setSize(300, 200);
		// Ventana centrada
		ventana.setLocationRelativeTo(null);
		// Hacer visible
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new AwtGBag();
	}

}
