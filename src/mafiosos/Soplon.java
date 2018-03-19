package mafiosos;

public class Soplon extends Mafioso {
	private int soplos;
	public Soplon(String nombre, String apodo, String banda, int edad, int soplos) {
		super(nombre, apodo, banda, edad);
		this.soplos=soplos;
	}

	public double aLaTrena() {
		return this.soplos/12;
	}

}
