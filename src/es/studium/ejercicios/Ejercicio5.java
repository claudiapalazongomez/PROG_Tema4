package es.studium.ejercicios;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements ActionListener, WindowListener
{
	Frame ventana = new Frame("Vehículos");
	Panel pnlNorte = new Panel();
	Label lblMotorizacion = new Label("Tipo de motorización:");
	CheckboxGroup chkMotorizacion = new CheckboxGroup();
	Checkbox Gasolina = new Checkbox("Gasolina", chkMotorizacion, false);
	Checkbox Diesel = new Checkbox("Diésel", chkMotorizacion, false);
	Checkbox Hibrido = new Checkbox("Híbrido", chkMotorizacion, false);
	Checkbox Electrico = new Checkbox("Eléctrico", chkMotorizacion, false);
	Label lblPuertas = new Label("Número de puertas:");
	CheckboxGroup chkPuertas = new CheckboxGroup();
	Checkbox tres = new Checkbox("3 puertas", chkPuertas, false);
	Checkbox cuatro = new Checkbox("4 puertas", chkPuertas, false);
	Checkbox cinco = new Checkbox("5 puertas", chkPuertas, false);
	Label lblPintura = new Label("Pintura Metalizada:");
	CheckboxGroup chkPintura = new CheckboxGroup();
	Checkbox si = new Checkbox("Si", chkPintura, false);
	Checkbox no = new Checkbox("No", chkPintura, false);
	Panel pnlSur = new Panel();
	Button btnCalcular = new Button("Calcular presupuesto");
	TextField txtPresupuesto = new TextField(10);
	
	Ejercicio5(){
		ventana.setSize(460,150);
		ventana.setResizable(false);
		ventana.setLayout(new BorderLayout());
		pnlNorte.setLayout(new FlowLayout());
		pnlSur.setLayout(new FlowLayout());
		ventana.addWindowListener(this);
		pnlNorte.add(lblMotorizacion);
		pnlNorte.add(Gasolina);
		pnlNorte.add(Diesel);
		pnlNorte.add(Hibrido);
		pnlNorte.add(Electrico);
		pnlNorte.add(lblPuertas);
		pnlNorte.add(tres);
		pnlNorte.add(cuatro);
		pnlNorte.add(cinco);
		pnlNorte.add(lblPintura);
		pnlNorte.add(si);
		pnlNorte.add(no);
		btnCalcular.addActionListener(this);
		pnlSur.add(btnCalcular);
		pnlSur.add(txtPresupuesto);
		txtPresupuesto.setEnabled(false);
		
		ventana.add(pnlNorte, "Center");
		ventana.add(pnlSur, "South");
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio5();

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
		int presupuesto = 0;
		if (Gasolina.getState()) {
			presupuesto = presupuesto + 7000; //tb se podría poner presupuesto += 7000
		}
		else if (Diesel.getState()) {
			presupuesto = presupuesto + 8000;
		}
		else if (Hibrido.getState()) {
			presupuesto = presupuesto + 9000;
		}
		else if (Electrico.getState()) {
			presupuesto = presupuesto + 8500;
		}
		
		if(tres.getState()) {
			presupuesto = presupuesto + 2000;
		}
		else if (cuatro.getState()) {
			presupuesto = presupuesto + 3000;
		}
		else if (cinco.getState()) {
			presupuesto = presupuesto + 2500;
		}
		
		if(si.getState()) {
			presupuesto = presupuesto + 1500;
		}
		else if(no.getState()) {
			presupuesto = presupuesto + 0;
		}
		
		if(btnCalcular.getActionListeners() != null) {
			txtPresupuesto.setText(presupuesto+"€");;
		}
		
	}
}
