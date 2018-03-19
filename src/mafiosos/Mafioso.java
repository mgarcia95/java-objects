package mafiosos;

public abstract class Mafioso {
	String nombre;
	String apodo;
	String banda;
	int edad;
	Sicario ejecutor;
	public Mafioso(String nombre, String apodo, String banda, int edad) {
		this.nombre=nombre;
		this.apodo=apodo;
		this.banda=banda;
		this.edad=edad;
	}
	public abstract double aLaTrena();
	public void ejecutor(Sicario s) {
		this.ejecutor = s;
	}
}
