import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletPromedio extends Applet implements ActionListener {
	TextField tfNum1,tfNum2,tfNum3,tfNum4;
	Label lNum1,lNum2,lNum3,lNum4;
	Button boton;
	double promedio;
	
	public AppletPromedio() {
		this.setLayout((null));
		lNum1 = new Label("Numero 1");
		lNum1.setBounds(20, 20, 100, 20);
		lNum2 = new Label("Numero 2");
		lNum2.setBounds(20, 40, 100, 20);
		lNum3 = new Label("Numero 3");
		lNum3.setBounds(20, 60, 100, 20);
		lNum4 = new Label("Numero 4");
		lNum4.setBounds(20, 80, 100, 20);
		tfNum1 = new TextField();
		tfNum1.setBounds(120, 20, 100, 20);
		tfNum2 = new TextField();
		tfNum2.setBounds(120, 40, 100, 20);
		tfNum3 = new TextField();
		tfNum3.setBounds(120, 60, 100, 20);
		tfNum4 = new TextField();
		tfNum4.setBounds(120, 80, 100, 20);
		boton = new Button("Calcula");
		boton.setBounds(120,120,100,20);
		add(lNum1);
		add(lNum2);
		add(lNum3);
		add(lNum4);
		add(tfNum1);
		add(tfNum2);
		add(tfNum3);
		add(tfNum4);
		add(boton);
		boton.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		this.setSize(300, 300);
		g.drawString("El promedio es = "+promedio, 20, 180);
	}
	
	public void actionPerformed(ActionEvent ae) {
		double num1 = Double.parseDouble(tfNum1.getText());
		double num2 = Double.parseDouble(tfNum2.getText());
		double num3 = Double.parseDouble(tfNum3.getText());
		double num4 = Double.parseDouble(tfNum4.getText());
		promedio = (num1+num2+num3+num4) / 4;
		repaint();
	}

}
