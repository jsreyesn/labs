package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" +
		                   trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());		
		
		System.out.println(Empleados.dameIdsiguiente());

	}

}

class Empleados{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion= "Administración";
		id = idSiguiente;
		idSiguiente ++;

	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		
		return "El nombre es " + nombre + " y la sección es " + seccion + " y el ID = " + id;
	}
	
	public static String dameIdsiguiente() {
		
		return "El ID siguiente es: "+idSiguiente;
		
	}
	
}