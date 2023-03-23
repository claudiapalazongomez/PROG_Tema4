package es.studium.ejercicios;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio8 implements WindowListener
{
	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	Menu mnuArticulos = new Menu("Artículos");
	Menu mnuClientes = new Menu("Clientes");
	Menu mnuFacturas = new Menu("Facturas");

	MenuItem mniArticulosNuevo = new MenuItem("Nuevo Artículo");
	MenuItem mniArticulosEliminar = new MenuItem("Eliminar Artículo");
	MenuItem mniArticulosConsultar = new MenuItem("Consultar Artículo");
	MenuItem mniClientesNuevo = new MenuItem("Nuevo Cliente");
	MenuItem mniClientesEliminar = new MenuItem("Eliminar Cliente");
	MenuItem mniClientesConsultar = new MenuItem("Consultar Cliente");
	MenuItem mniFacturasNueva = new MenuItem("Nueva Factura");
	MenuItem mniFacturasConsultar = new MenuItem("Consultar Factura");
	
	Dialog dlgArticulosNuevo = new Dialog(ventana, "Seleccionaste...", false);
	Label lblArticulosNuevo = new Label("Nuevo Artículo");
	Dialog dlgArticulosEliminar = new Dialog(ventana, "Seleccionaste...", false);
	Label lblArticulosEliminar = new Label("Eliminar Artículo");
	Dialog dlgArticulosConsultar = new Dialog(ventana, "Seleccionaste...", false);
	Label lblArticulosConsultar = new Label("Consultar Artículo");
	Dialog dlgClientesNuevo = new Dialog(ventana, "Seleccionaste...", false);
	Label lblClientesNuevo = new Label("Nuevo Cliente");
	Dialog dlgClientesEliminar = new Dialog(ventana, "Seleccionaste...", false);
	Label lblClientesEliminar = new Label("Eliminar Cliente");
	Dialog dlgClientesConsultar = new Dialog(ventana, "Seleccionaste...", false);
	Label lblClientesConsultar = new Label("Consultar Cliente");
	Dialog dlgFacturasNueva = new Dialog(ventana, "Seleccionaste...", false);
	Label lblFacturasNueva = new Label("Nueva Factura");
	Dialog dlgFacturasConsultar = new Dialog(ventana, "Seleccionaste...", false);
	Label lblFacturasConsultar = new Label("Consultar Factura");
	
	public Ejercicio8()
	{
	ventana.setLayout(new FlowLayout());
	ventana.addWindowListener(this);
	ventana.setMenuBar(barraMenu);
	mnuArticulos.add(mniArticulosNuevo);
	mnuArticulos.add(mniArticulosEliminar);
	mnuArticulos.add(mniArticulosConsultar);
	mnuClientes.add(mniClientesNuevo);
	mnuClientes.add(mniClientesEliminar);
	mnuClientes.add(mniClientesConsultar);
	mnuFacturas.add(mniFacturasNueva);
	mnuFacturas.add(mniFacturasConsultar);
	barraMenu.add(mnuArticulos);
	barraMenu.add(mnuClientes);
	barraMenu.add(mnuFacturas);
	dlgArticulosNuevo.setSize(175,75);
	dlgArticulosNuevo.addWindowListener(this);
	dlgArticulosNuevo.setLayout(new FlowLayout());
	dlgArticulosNuevo.add(lblArticulosNuevo);
	dlgArticulosNuevo.setLocationRelativeTo(null);
	dlgArticulosNuevo.setResizable(false);
	ventana.setSize(350,200);
	ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio8();
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

}
