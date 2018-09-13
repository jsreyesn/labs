import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet width="200" height="200" code="AppletDaCuadrado"></applet>

public class AppletDaCuadrado extends Applet implements ActionListener {	
	TextField t;
	Button b;
	//método constructor,donde se crean los objetos a dibujar en el applet
	public AppletDaCuadrado() {
		t = new TextField(); // se crea el objeto texto
		b = new Button("Calcula"); // se crea el boton para calcular
		add(t); // se añade el texto a la pantalla
		add(b); // se añade el botón a la pantalla
		b.addActionListener(this); // se le añade al boton la facilidad de ser escuchado
	}
	//método paint en el cual se pone lo que se quiere dibujar
	public void paint(Graphics g) {
		int num = Integer.parseInt(t.getText()); // pasa texto al numero entero
		g.drawString("Cuadrado = "+num*num, 100, 100); //dibuja el cuadrado
	}
	// método para realizar las opciones al oprimir un botón
	public void actionPerformed(ActionEvent ae) {
		repaint(); // se le pide que se repinte la ventana
	}
}
