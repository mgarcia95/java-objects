package controlVuelos;

public class aeropuerto {
	avion avionEnHangar;
	int psj_salida_total;
	int psj_llegada_total;
	public aeropuerto() {
		/*
		 * this.avionEnHangar=null;
		 * this.pasajerosLlegada=0;
		 * this.pasajerosSalida=0;
		 */
		this(null);
	}
	public aeropuerto(avion a) {
		this.avionEnHangar=a;
		this.psj_llegada_total=0;
		this.psj_salida_total=0;
	}
	public void aterrizarDesde(aeropuerto aeropuertoSalida) {
		if(this.avionEnHangar==null && aeropuertoSalida.avionEnHangar!=null) {
			aeropuertoSalida.psj_salida_total += aeropuertoSalida.avionEnHangar.asientos;
			this.psj_llegada_total += aeropuertoSalida.avionEnHangar.asientos;
			this.avionEnHangar=aeropuertoSalida.avionEnHangar;
			aeropuertoSalida.avionEnHangar = null;
		}
	}
	public void comprar(avion nuevoAvion) {
		if(this.avionEnHangar==null) this.avionEnHangar=nuevoAvion;
		else System.out.println("No puede adquirir un avion, no tiene espacio");
	}
	public String toString() {
		String aeropuerto = "Avión: "+this.avionEnHangar+"\nPasajeros Salida: "+this.psj_salida_total+"\nPasajeros Llegada "+this.psj_llegada_total;
		return aeropuerto;
	}
}
