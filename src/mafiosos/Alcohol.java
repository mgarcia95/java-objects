package mafiosos;

public class Alcohol extends Traficante {
	public Alcohol(String nombre, String apodo, String banda, int edad, int operaciones) {
		super(nombre, apodo, banda, edad, operaciones);
	}
	public double aLaTrena() {
		return this.operaciones*2.5;
	}

}
