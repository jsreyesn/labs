import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet width="100" height="100" code="AppletDecisiones3"></applet>
public class ImpuestoApplet extends Applet implements ActionListener{
	Label l1,l2;
	TextField t1,t2;
	Button b;
	public ImpuestoApplet() {
		l1 = new Label("Precio Artículo");
		t1 = new TextField(10);
		l2 = new Label("Impuesto a Pagar");
		t2 = new TextField(10);
		b = new Button("Calcula");
		add(l1);
		add(t1);
		add(b);
		add(l2);
		add(t2);
		b.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent ae) {
		double precio = Integer.parseInt(t1.getText());
		double impuesto;
		
		if(precio < 10000) {
			impuesto = precio*5/100;
		}
		else if (precio >= 10000 && precio < 25000) {
			impuesto = precio * 10/100;
		}
		else {
			impuesto = precio * 15/100;
		}
			
		t2.setText(""+impuesto);
		
	}
	
}
