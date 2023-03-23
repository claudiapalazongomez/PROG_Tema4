package es.studium.ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio7 implements ItemListener, WindowListener
{
	Frame ventana = new Frame("Baloncesto");
	List lisEquipos = new List(5, false);
	String[] equipos = {"Seleccione un equipo", "Real Madrid", "Barça",
	"Iberoestar Tenerife", "TD Systems Baskonia", "Hereda San Pablo Burgos", "Valencia Basket", 
	"Club Joventut de Badalona", "Unicaja", "UCAM Murcia", "Baxi Manresa", "MoraBanc Andorra", 
	"Herbalife Gran Canaria", "Monbus Obradoiro", "Movistar Estudiantes", "Casademont Zaragoza", 
	"Urbas Fuenlabrada", "Coosur Real Betis", "RETAbet Bilbao Basket", "Acunsa Gipuzkoa Basket"};
	String[] ciudades = {"No ha elegido ninguna opción", "Madrid", "Barcelona", "Tenerife", "Vitoria", 
	"Burgos", "Valencia", "Badalona", "Malaga", "Murcia", "Manresa", "Andorra", "Las Palmas de Gran Canaria", 
	"Santiago de Compostela", "Madrid", "Zaragoza", "Fuenlabrada", "Sevilla", "Bilbao", "San Sebastián"};
	TextField txtCiudades = new TextField(20);
	
	public Ejercicio7()
	{
		ventana.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		for(String equipo: equipos)
		{
			lisEquipos.add(equipo);
		}
		ventana.add(lisEquipos);
		ventana.setSize(250,150);
		lisEquipos.addItemListener(this);
		ventana.setVisible(true);
		ventana.add(txtCiudades);
		txtCiudades.setEnabled(false);
		}

	public static void main(String[] args)
	{
		new Ejercicio7();

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
		System.out.println(lisEquipos.getSelectedIndex());
		txtCiudades.setText(ciudades[lisEquipos.getSelectedIndex()]);
		
	}

}
