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
	"Alicante", "Almería", "Asturias", "Avila", "Badajoz", "Barcelona", "Burgos",
	"Cáceres", "Cádiz", "Cantabria", "Castellón", "Ciudad Real", "Córdoba", "La Coruña", 
	"Cuenca", "Gerona", "Granada", "Guadalajara", "Guipúzcoa", "Huelva",
	"Huesca", "Islas Baleares", "Jaén", "León", "Lérida", "Lugo", "Madrid", "Málaga",
	"Murcia", "Navarra", "Orense", "Palencia", "Las Palmas", "Pontevedra", "La Rioja",
	"Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
	"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza"};
	String[] gentilicios={"No ha elegido ninguna opción","Alavés/Alavesa o Babazorro/rra", 
	"Albaceteño/ña o Albacetense", "Alicantino/na","Almeriense, Urcitano/na","Asturiano/na, Astur",
	"Abulense, Avilés/esa", "Pacense, Badajocense, Badajoceño/ña", "Barcelonés/esa, Barcinonense", 
	"Burgalés/esa", "Cacereño/ña", "Gaditano/na", "Cántabro/a","Castellonense", "Ciudadrealeño/ña", 
	"Cordobés/esa","Coruñés", "Conquense", "Gerundense, Gironés/esa", "Granadino/na","Guadalajarño/ña, "
	+ "Caracense, Arriacense", "Guipuzcoano/na", "Onubense", "Oscense", "Balear", "Jaenés/esa, "
	+ "Jaenero/ro, Jienense, Giennense","Leonés/esa","Leridano","Lucense", "Madrileño/ña", 
	"Malagueño/ña", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na", "Palmense", 
	"Pontevedrés/esa","Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense", 
	"Soriano/na","Tarracconense/a","Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
	"Pucelano/na", "Vizcaíno/na", "Zamorano/na", "Zaragozano/na"};
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
