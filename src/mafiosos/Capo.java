package mafiosos;

public class Capo extends Mafioso {
	private int barrios;
	public Capo(String nombre, String apodo, String banda, int edad, Integer barrios) {
		super(nombre, apodo, banda, edad);
		this.barrios=barrios;
	}
	public double aLaTrena() {
		return this.barrios*5;
	}
}
