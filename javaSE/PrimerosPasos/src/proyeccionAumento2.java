import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class proyeccionAumento2 extends Applet implements ActionListener{
	TextField tfSueldo,tfPorcentaje, tfAnios;
	Label lSueldo,lPorcentaje, lAnios;
	Button boton;
	TextArea txtResultado;
	
	public proyeccionAumento2() {
		this.setLayout((null));
		lSueldo= new Label("Sueldo: ");
		lSueldo.setBounds(20, 20, 100, 20);
		lPorcentaje= new Label("% Aumento: ");
		lPorcentaje.setBounds(20, 40, 100, 20);
		lAnios= new Label("Años: ");
		lAnios.setBounds(20, 60, 100, 20);
		tfSueldo = new TextField();
		tfSueldo.setBounds(120, 20, 100, 20);
		tfPorcentaje = new TextField();
		tfPorcentaje.setBounds(120, 40, 100, 20);
		tfAnios = new TextField();
		tfAnios.setBounds(120, 60, 100, 20);
		boton = new Button("Calcular");
		boton.setBounds(120,100,100,20);
		txtResultado=new TextArea();
		txtResultado.setBounds(20,140,300,200);
		add(lSueldo);
		add(lPorcentaje);
		add(lAnios);
		add(tfSueldo);
		add(tfPorcentaje);
		add(tfAnios);
		add(txtResultado);
		add(boton);		
		boton.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		this.setSize(340, 600);
	}
	
	public void actionPerformed(ActionEvent ae) {		
		Double sueldo = Double.parseDouble(tfSueldo.getText());
		Double porcentaje = Double.parseDouble(tfPorcentaje.getText());
		int anios = Integer.parseInt(tfAnios.getText());
		txtResultado.append("RESULTADO SIMULACION EN "+anios+" AÑOS\n");
		
		for (int anio = 1; anio <=anios ; anio++) {
			sueldo = sueldo * (1 + porcentaje/100);
			txtResultado.append("Año "+ anio + "\t" + "$"+sueldo.intValue() + "\n");
		}
		
		repaint();
	}
}
