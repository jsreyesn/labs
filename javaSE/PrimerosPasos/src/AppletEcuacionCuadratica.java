import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math;

public class AppletEcuacionCuadratica extends Applet implements ActionListener{
	
	Label l1, l2, l3, l4, l5;
	TextField t1, t2, t3, t4, t5;
	Button b1;
	
	public AppletEcuacionCuadratica() {
		l1 = new Label("a");
		t1 = new TextField();
		l2 = new Label("b");
		t2 = new TextField();
		l3 = new Label("c");
		t3 = new TextField();
		b1 = new Button("Calcula");
		l4 = new Label("Raiz1");
		t4 = new TextField();
		l5 = new Label("Raiz2");
		t5 = new TextField();
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {		
		double a = Double.parseDouble(t1.getText());
		double b =Double.parseDouble(t2.getText());
		double c =Double.parseDouble(t3.getText());
		double raiz1 = (-b)+Math.sqrt(Math.pow(b, 2) - (4*a*c)) / (2*a);
		double raiz2 = (-b)-Math.sqrt(Math.pow(b, 2) - (4*a*c)) / (2*a);
		t4.setText(""+raiz1);
		t5.setText(""+raiz2);
	}

}
