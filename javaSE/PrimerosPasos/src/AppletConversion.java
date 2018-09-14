import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.Math;

//<applet width="200" height="300" code="AppletCuadrado"></applet>

public class AppletConversion extends Applet implements ActionListener{
	
	Label l1, l2;
	TextField t1, t2;
	Button b;
	
	public AppletConversion() {
		l1 = new Label("Centigrados");
		t1 = new TextField();
		l2 = new Label("Farenheit");
		t2 = new TextField();
		b = new Button("Calcula");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		double celsius = Double.parseDouble(t1.getText());
		t2.setText(""+(celsius* 1.8 + 32));
	}

}
