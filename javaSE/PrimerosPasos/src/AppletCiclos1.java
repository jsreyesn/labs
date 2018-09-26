import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet width="300" height="400" code="AppletCiclos1"></applet>
public class AppletCiclos1 extends Applet implements ActionListener  {
	Label l1, l2, l3,l4;
	TextField t1, t2,t3;
	TextArea ta;
	Button b;
	
	public AppletCiclos1() {
		l1 = new Label("Inversión Inicial");
		t1 = new TextField(8);
		l2 = new Label("% interes mensual");
		t2 = new TextField(5);
		l3 = new Label("Inversión Final");
		t3 = new TextField(8);
		l4 = new Label("Resultados de la Inversión");
		ta = new TextArea(20,30);
		b = new Button("VER MES");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		add(l4);
		add(ta);
		b.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent ae) {
		double invinicial = Double.parseDouble(t1.getText());
		double interes = Double.parseDouble(t2.getText());
		double invfinal = Double.parseDouble(t3.getText());
		ta.setText("");
		int mes = 1;
		double saldo = invinicial;
		while (saldo < invfinal) {
			saldo = saldo * (1 + interes/100);
			ta.append(" mes " + mes + " Saldo = " + saldo + "\n");
			mes ++;
		}
	}
}
