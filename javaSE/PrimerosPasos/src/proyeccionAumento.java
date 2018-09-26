import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class proyeccionAumento extends Applet implements ActionListener{
	TextField tfSueldo,tfPorcentaje;
	Label lSueldo,lPorcentaje;
	Button boton;
	TextArea txtResultado;
	
	public proyeccionAumento() {
		this.setLayout((null));
		lSueldo= new Label("Sueldo: ");
		lSueldo.setBounds(20, 20, 100, 20);
		lPorcentaje= new Label("% Aumento: ");
		lPorcentaje.setBounds(20, 40, 100, 20);
		tfSueldo = new TextField();
		tfSueldo.setBounds(120, 20, 100, 20);
		tfPorcentaje = new TextField();
		tfPorcentaje.setBounds(120, 40, 100, 20);
		boton = new Button("Calcular");
		boton.setBounds(120,80,100,20);
		txtResultado=new TextArea();
		txtResultado.setBounds(20,120,300,200);
		add(lSueldo);
		add(lPorcentaje);
		add(tfSueldo);
		add(tfPorcentaje);
		add(txtResultado);
		add(boton);		
		boton.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		this.setSize(340, 600);
	}
	
	public void actionPerformed(ActionEvent ae) {
		txtResultado.append("RESULTADO: "+"\n");
		Double sueldo = Double.parseDouble(tfSueldo.getText());
		Double porcentaje = Double.parseDouble(tfPorcentaje.getText());
		
		for (int anio = 1; anio <=10 ; anio++) {
			sueldo = sueldo * (1 + porcentaje/100);
			txtResultado.append("Año "+ anio + "\t" + "$"+sueldo.intValue() + "\n");
		}
		
		repaint();
	}

}
