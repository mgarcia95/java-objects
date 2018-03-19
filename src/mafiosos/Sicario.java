package mafiosos;

public class Sicario extends Mafioso {
	private int asesinatos;
	public Sicario(String nombre, String apodo, String banda, int edad, int asesinatos) {
		super(nombre, apodo, banda, edad);
		this.asesinatos=asesinatos;
	}
	public double aLaTrena() {
		return this.asesinatos*15;
	}

}
