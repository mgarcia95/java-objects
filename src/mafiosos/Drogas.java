package mafiosos;

public class Drogas extends Traficante {

	

	public Drogas(String nombre, String apodo, String banda, int edad, int operaciones) {
		super(nombre, apodo, banda, edad, operaciones);
		
	}

	public double aLaTrena() {
		return this.operaciones*4;
	}

}
