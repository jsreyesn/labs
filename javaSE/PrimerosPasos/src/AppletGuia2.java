import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletGuia2 extends Applet implements ActionListener  {
	
	TextField tfEstatura,tfPeso;//entradas de texto
	Label lEstatura,lPeso;//label de los textos de entrada
	Button boton;
	double resultado;//variable para mostrar el resultado
	//m�todo constructor,donde se crean los objetos a dibujar en el applet
	public AppletGuia2() {
		//Damos la instruccion que no se usar� ningun layout para poder dibujar con setBounds
		this.setLayout((null));
		//setBounds(posicionx, posiciony, ancho, alto)
		lEstatura= new Label("Estatura (mt): ");
		lEstatura.setBounds(20, 20, 100, 20);
		lPeso= new Label("Peso (kg): ");
		lPeso.setBounds(20, 40, 100, 20);
		tfEstatura = new TextField(); 
		tfEstatura.setBounds(120, 20, 100, 20);
		tfPeso = new TextField();
		tfPeso.setBounds(120, 40, 100, 20);
		boton = new Button("Calcula"); 
		boton.setBounds(120,80,100,20);
		//agregamos los elementos a la pantalla
		add(lEstatura);
		add(lPeso);
		add(tfEstatura);
		add(tfEstatura);
		add(tfPeso);
		add(boton);
		boton.addActionListener(this); // se le a�ade al boton la facilidad de ser escuchado
	}
	//m�todo paint en el cual se pone lo que se quiere dibujar
	public void paint(Graphics g) {
		this.setSize(300, 300);
		g.drawString("Su Indice de Masa corporal es = "+resultado, 20, 120);
		//dibuja el cuadrado
	}
	// m�todo para realizar las opciones al oprimir un bot�n
	public void actionPerformed(ActionEvent ae) {
		double estatura = Double.parseDouble(tfEstatura.getText());
		double peso = Double.parseDouble(tfPeso.getText());
		resultado = peso / (Math.pow(estatura, 2));
		repaint();
	}
}
