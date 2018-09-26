import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet width="200" height="200" code="AppletDecisiones4"></applet>
public class ConversionAniosDias extends Applet implements ActionListener {
	Label l1, l2, l3, l4, l5;
	TextField t1, t2, t3, t4, t5;
	Button b;
	public ConversionAniosDias() {
		l1 = new Label("Año");
		t1 = new TextField(4);
		l2 = new Label("Dias");
		t2 = new TextField(4);
		l3 = new Label("Año");
		t3 = new TextField(4);
		l4 = new Label("Mes");
		t4 = new TextField(4);
		l5 = new Label("Dias");
		t5 = new TextField(4);
		b = new Button("CONVERSION");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		b.addActionListener(this); 
	}
	
	public void actionPerformed(ActionEvent ae) { 
		int anio = Integer.parseInt(t1.getText());
		int dias = Integer.parseInt(t2.getText());
		int bisiesto = 0;
		
		if((anio%100 != 0 && anio%4 == 0) || (anio%100 == 0 && anio%400 == 0)) 
			bisiesto = 1;
		
		if(dias > 0 && dias <= 31) {
			t3.setText(""+anio);
			t4.setText(""+1);
			t5.setText(""+dias);			
		}
		else if (dias > 31 && dias <= (59+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+2);
			t5.setText(""+(dias-31));				
		}
		else if (dias > (59+bisiesto) && dias <= (90+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+3);
			t5.setText(""+(dias-59-bisiesto));				
		}
		else if (dias > (90+bisiesto) && dias <= (120+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+4);
			t5.setText(""+(dias-90-bisiesto));			
		}
		else if (dias > (120+bisiesto) && dias <= (151+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+5);
			t5.setText(""+(dias-120-bisiesto));				
		}
		else if (dias > (151+bisiesto) && dias <= (181+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+6);
			t5.setText(""+(dias-151-bisiesto));				
		}
		else if (dias > (181+bisiesto) && dias <= (212+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+7);
			t5.setText(""+(dias-181-bisiesto));				
		}
		else if (dias > (212+bisiesto) && dias <= (243+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+8);
			t5.setText(""+(dias-212-bisiesto));				
		}
		else if (dias > (243+bisiesto) && dias <= (273+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+9);
			t5.setText(""+(dias-243-bisiesto));				
		}
		else if (dias > (273+bisiesto) && dias <= (304+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+10);
			t5.setText(""+(dias-273-bisiesto));				
		}
		else if (dias > (304+bisiesto) && dias <= (334+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+11);
			t5.setText(""+(dias-304-bisiesto));				
		}
		else if (dias > (334+bisiesto) && dias <= (365+bisiesto) ){
			t3.setText(""+anio);
			t4.setText(""+12);
			t5.setText(""+(dias-334-bisiesto));				
		}
		else {
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
		}
	}
}