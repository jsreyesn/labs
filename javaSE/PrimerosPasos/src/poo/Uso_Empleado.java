package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1 = new Empleado("Paco Gomez",85000,1990,12,17);
		Empleado empleado2 = new Empleado("Ana Lopez",95000,1995,6,2);
		Empleado empleado3 = new Empleado("Maria Martin",105000,2002,3,15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dameNombre()+
				           " Sueldo: "+empleado1.damesueldo()+
				           " Fecha de Alta: "+empleado1.dameFechaContrato());
		System.out.println("Nombre: "+empleado2.dameNombre()+
		           " Sueldo: "+empleado2.damesueldo()+
		           " Fecha de Alta: "+empleado2.dameFechaContrato());
		System.out.println("Nombre: "+empleado3.dameNombre()+
		           " Sueldo: "+empleado3.damesueldo()+
		           " Fecha de Alta: "+empleado3.dameFechaContrato());*/
		
		Jefatura jefe_RRHH= new Jefatura("Steve Reyes",55000,2006,9,25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0]= new Empleado("Paco Gomez",85000,1990,12,17);
		misEmpleados[1]= new Empleado("Ana Lopez",95000,1995,6,2);
		misEmpleados[2]= new Empleado("Maria Martin",105000,2002,3,15);
		misEmpleados[3]= new Empleado("Antonio Fernández",30000,2000,1,1);
		misEmpleados[4]= jefe_RRHH; // Polimorfismo en acción. Principio de acción.
		misEmpleados[5]= new Jefatura("Maria",95000,1999,5,26); // Polimorfismo en acción. Principio de acción.
		
		Jefatura jefaFinanzas = (Jefatura)misEmpleados[5]; // Casting de objetos > Convierte de tipo misEmpleados a tipo Jefatura
		jefaFinanzas.estableceIncentivo(55000);
				
		/*for(int i=0;i<3;i++) {
			
			misEmpleados[i].subeSueldo(5);
		}*/
		
		System.out.println(jefaFinanzas.tomar_decisiones("Dar más días de vacaciones a empleados"));
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		/*for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+
			           " Sueldo: "+misEmpleados[i].damesueldo()+
			           " Fecha de Alta: "+misEmpleados[i].dameFechaContrato());
		}*/
		
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: "+e.dameNombre()+
			           " Sueldo: "+e.damesueldo()+
			           " Fecha de Alta: "+e.dameFechaContrato());
		}
		
	}

}

class Empleado implements Comparable{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nom) {
		this(nom,30000,2000,1,1);
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public double damesueldo(){
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado)miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}


class Jefatura extends Empleado implements Jefes{
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom,sue,agno,mes,dia);
		
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la decisión de: "+decision;
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo = b;
		
	}
	
	public double damesueldo() {
		
		double sueldoJefe = super.damesueldo();
		return sueldoJefe + incentivo;
	}
	
    
	
}