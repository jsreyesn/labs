package poo;

public class furgoneta extends Coche{
	
	private int capacidadCarga;
	private int plazasExtra;
	
	public furgoneta(int plazasExtra, int capacidadCarga) {
		
		super(); // Llamar al constructor de la clase padre
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra;
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: "+capacidadCarga+" Y las plazas son: "+ plazasExtra;
	}

}
