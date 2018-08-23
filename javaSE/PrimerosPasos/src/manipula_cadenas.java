
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Felipe de Froilan de todos los santos";
		System.out.println("Mi nombre es "+nombre);
		System.out.println("Mi nombre tiene "+ nombre.length() + " letras.");
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		
		int ultimaLetra;
		ultimaLetra = nombre.length();
		System.out.println("La ultima letra de mi nombre es " + nombre.charAt(ultimaLetra-1));
		
	}

}
