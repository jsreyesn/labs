import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Steve";
		String pass = "";
		
		while (clave.equals(pass)==false) {
			pass = JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if(clave.equals(pass)==false) {
				System.out.println("Contrase�a Incorrecta");
			}			
			
		}
		
		System.out.println("Contrase�a Correcta. Acceso permitido");

	}

}
