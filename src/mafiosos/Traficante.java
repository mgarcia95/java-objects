package mafiosos;

public abstract class Traficante extends Mafioso {
	protected int operaciones;
	public Traficante(String nombre, String apodo, String banda, int edad, int operaciones) {
		super(nombre, apodo, banda, edad);
		this.operaciones=operaciones;
	}

	public abstract double aLaTrena();

}
