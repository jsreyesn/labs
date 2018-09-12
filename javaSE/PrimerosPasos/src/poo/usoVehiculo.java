package poo;

public class usoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche1 = new Coche();
		micoche1.establece_color("Rojo");
		
		furgoneta miFurgoneta1 = new furgoneta(7,580);
		miFurgoneta1.establece_color("Azul");
		miFurgoneta1.configura_asientos("si");
		miFurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales()+". "+micoche1.dime_color());
		
		System.out.println(miFurgoneta1.dime_datos_generales()+". "+miFurgoneta1.dimeDatosFurgoneta());
		

	}

}
