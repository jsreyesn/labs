import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		System.out.println("Hola " + Nombre_usuario + ". El año que viene tendrás "+ (Integer.parseInt(edad)+1) + " años.");

	}

}
