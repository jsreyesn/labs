import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class IMCGuia extends Applet implements ActionListener{
	TextField tfEstatura,tfPeso,tfGenero;
	Label lEstatura,lPeso,lGenero;
	Button boton;
	double imc;
	String resultado;
	
	public IMCGuia() {
		this.setLayout((null));
		lEstatura= new Label("Estatura (mt): ");
		lEstatura.setBounds(20, 20, 100, 20);
		lPeso= new Label("Peso (kg): ");
		lPeso.setBounds(20, 40, 100, 20);
		lGenero= new Label("Género (Hombre/Mujer)");
		lGenero.setBounds(20, 60, 140, 20);
		tfEstatura = new TextField(); 
		tfEstatura.setBounds(170, 20, 100, 20);
		tfPeso = new TextField();
		tfPeso.setBounds(170, 40, 100, 20);
		tfGenero = new TextField();
		tfGenero.setBounds(170, 60, 100, 20);
		boton = new Button("Calcula"); 
		boton.setBounds(170,100,100,20);
		add(lEstatura);
		add(lPeso);
		add(lGenero);
		add(tfEstatura);
		add(tfPeso);
		add(tfGenero);
		add(boton);
		boton.addActionListener(this);		
	}
	
	public void paint(Graphics g) {
		this.setSize(300, 300);
		g.drawString("Su Indice de Masa corporal es = "+imc, 20, 160);
		g.drawString("Su Estado es = "+resultado, 20, 180);
	}
	
	public void actionPerformed(ActionEvent ae) {
		double estatura = Double.parseDouble(tfEstatura.getText());
		double peso = Double.parseDouble(tfPeso.getText());
		String genero = tfGenero.getText();
		
		genero = genero.toUpperCase();		
		imc = peso / (Math.pow(estatura, 2));
		
		switch (genero){
		case "HOMBRE":
			if(imc < 20)
				resultado = "Bajo Peso";
			else if (imc >= 20 && imc < 25)
				resultado = "Normal";
			else if (imc >= 25 && imc < 30)
				resultado = "Obesidad Leve";
			else if (imc >= 30 && imc <= 40)
				resultado = "Obesidad Severa";
			else
				resultado = "Obesidad muy severa";
			break;
		case "MUJER":
			if(imc < 20)
				resultado = "Bajo Peso";
			else if (imc >= 20 && imc < 24)
				resultado = "Normal";
			else if (imc >= 24 && imc < 29)
				resultado = "Obesidad Leve";
			else if (imc >= 29 && imc <= 37)
				resultado = "Obesidad Severa";
			else
				resultado = "Obesidad muy severa";
			break;
		default:
			break;		
		}
		
		repaint();
	}

}
