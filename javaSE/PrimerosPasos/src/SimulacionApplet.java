import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SimulacionApplet extends Applet implements ActionListener {
	Label l1, l2;
	TextField t1, t2;
	TextArea ta;
	Button b;
	
	public SimulacionApplet() {
		l1 = new Label("Poblacion Inicial");
		t1 = new TextField(10);
		l2 = new Label("% aumento diario");
		t2 = new TextField(10);
		ta = new TextArea(20,30);
		b = new Button("SIMULAR");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(ta);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		Double pobInicial = Double.parseDouble(t1.getText());
		Double porAumento = Double.parseDouble(t2.getText());
		Double poblacion = pobInicial;
		int dia = 1;
		
		while (poblacion <= pobInicial*2) {
			poblacion = poblacion * (1 + porAumento/100);
			ta.append(" dia " + dia + " Poblacion = " + poblacion + "\n");
			dia++;
		}
	}
}
