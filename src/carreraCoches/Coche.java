package carreraCoches;

public class Coche {
	int numero;
	String piloto;
	double distancia;
	double puntos;
	public Coche(int numero, String piloto) {
		this.numero=numero;
		this.piloto=piloto;
		this.puntos=0;
	}
	//////////////Get y Set//////////////////
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getPuntos() {
		return puntos;
	}
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}
	/////////////////Metodos/////////////////////
	public void incrementarDistancia(double distancia) {
		this.distancia+=distancia;
	}
	public void distanciaCero() {
		this.distancia=0;
	}
	
}
