import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class factorialApplet extends Applet implements ActionListener{
	Label l1, l2;
	TextField t1,t2;
	Button b;
	
	public factorialApplet(){
		l1 = new Label("Numero");
		t1 = new TextField(2);
		l2 = new Label("Factorial");
		t2 = new TextField(2); 
		b = new Button("CALCULAR"); 
		add(l1);
		add(t1);
		add(b);
		add(l2);
		add(t2);
		b.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent ae) { 
		int num = Integer.parseInt(t1.getText());
		int factorial = 1;
		
		for (int i=1; i <= num ; i++) {
			factorial = factorial*i;
		}
		
		t2.setText("" + factorial);
	}
}
