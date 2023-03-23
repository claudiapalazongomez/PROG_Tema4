package es.studium.ejercicios;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio6 implements ItemListener, WindowListener 
{
	Frame ventana = new Frame("Provincias");
	String[ ] provincias = {"Seleccione una provincia", "Alava", "Albacete",
	"Alicante", "Almer�a", "Asturias", "Avila", "Badajoz", "Barcelona", "Burgos",
	"C�ceres", "C�diz", "Cantabria", "Castell�n", "Ciudad Real", "C�rdoba", "La Coru�a", 
	"Cuenca", "Gerona", "Granada", "Guadalajara", "Guip�zcoa", "Huelva",
	"Huesca", "Islas Baleares", "Ja�n", "Le�n", "L�rida", "Lugo", "Madrid", "M�laga",
	"Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja",
	"Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
	"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza"};
	String[] gentilicios={"No ha elegido ninguna opci�n","Alav�s/Alavesa o Babazorro/rra", 
	"Albacete�o/�a o Albacetense", "Alicantino/na","Almeriense, Urcitano/na","Asturiano/na, Astur",
	"Abulense, Avil�s/esa", "Pacense, Badajocense, Badajoce�o/�a", "Barcelon�s/esa, Barcinonense", 
	"Burgal�s/esa", "Cacere�o/�a", "Gaditano/na", "C�ntabro/a","Castellonense", "Ciudadreale�o/�a", 
	"Cordob�s/esa","Coru��s", "Conquense", "Gerundense, Giron�s/esa", "Granadino/na","Guadalajar�o/�a, "
	+ "Caracense, Arriacense", "Guipuzcoano/na", "Onubense", "Oscense", "Balear", "Jaen�s/esa, "
	+ "Jaenero/ro, Jienense, Giennense","Leon�s/esa","Leridano","Lucense", "Madrile�o/�a", 
	"Malague�o/�a", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na", "Palmense", 
	"Pontevedr�s/esa","Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense", 
	"Soriano/na","Tarracconense/a","Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
	"Pucelano/na", "Vizca�no/na", "Zamorano/na", "Zaragozano/na"};
	Choice choProvincias = new Choice();
	TextField txtGentilicios = new TextField(30);
	
	public Ejercicio6()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		for(String provincia: provincias) //rellenando el choice
		{
			choProvincias.add(provincia);
		}
		ventana.add(choProvincias);
		choProvincias.addItemListener(this);
		ventana.setSize(300,150);
		ventana.setVisible(true);
		ventana.add(txtGentilicios);
		txtGentilicios.setEnabled(false);
	}

	public static void main(String[] args)
	{
		new Ejercicio6();

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
	public void itemStateChanged(ItemEvent e)
	{
		txtGentilicios.setText(gentilicios[choProvincias.getSelectedIndex()]);
		
		/*
		 * int posicion = 0;
		 * for(String provincia: provincias)
		 * {
		 * 	if(provincia.equals(e.getItem())){
		 * 		txtGentilicio.setText(gentilicios[posicion]);
		 * }
		 * posicion++;
		 * }
		 */
	}

}
