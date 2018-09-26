import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet width="200" height="200" code="AppletDecisiones4"></applet>
public class FechaApplet extends Applet implements ActionListener{
	Label l1, l2, l3;
	TextField t1, t2, t3;
	Button b;
	
	public FechaApplet() {
		l1 = new Label("Dia");
		t1 = new TextField(3);
		l2 = new Label("Mes");
		t2 = new TextField(3);
		l3 = new Label("Fecha con Letras");
		t3 = new TextField(16); 
		b = new Button("CAMBIAR");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		add(t3);
		b.addActionListener(this); 
	}
	
	public void actionPerformed(ActionEvent ae) { 
		int dia = Integer.parseInt(t1.getText());
		int mes = Integer.parseInt(t2.getText());
		String resultado = "";
		
		switch (dia){
			case 1:
				resultado = resultado + "Lunes de ";
				break;
			case 2:
				resultado = resultado + "Martes de ";
				break;
			case 3:
				resultado = resultado + "Miércoles de ";
				break;
			case 4:
				resultado = resultado + "Jueves de ";
				break;
			case 5:
				resultado = resultado + "Viernes de ";
				break;
			case 6:
				resultado = resultado + "Sábado de ";
				break;
			case 7:
				resultado = resultado + "Domingo de ";
				break;
			default:
				resultado = resultado + "Error en el día. ";
		}
		
		switch (mes){
			case 1:
				resultado = resultado + "Enero";
				break;
			case 2:
				resultado = resultado + "Febrero";
				break;
			case 3:
				resultado = resultado + "Marzo";
				break;
			case 4:
				resultado = resultado + "Abril";
				break;
			case 5:
				resultado = resultado + "Mayo";
				break;
			case 6:
				resultado = resultado + "Junio";
				break;
			case 7:
				resultado = resultado + "Julio";
				break;
			case 8:
				resultado = resultado + "Agosto";
				break;
			case 9:
				resultado = resultado + "Septiembre";
				break;
			case 10:
				resultado = resultado + "Octubre";
				break;
			case 11:
				resultado = resultado + "Noviembre";
				break;
			case 12:
				resultado = resultado + "Diciembre";
				break;
			default:
				resultado = resultado + "Error en el mes";
		}
		
		t3.setText(resultado);
		
	}
}