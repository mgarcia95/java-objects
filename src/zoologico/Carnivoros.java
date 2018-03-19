package zoologico;

public class Carnivoros extends Animal {
	String carne_preferida;
	double precio_carne;

	public Carnivoros(String nombre, String sexo, String fecha_ingreso, int patas, int peso, String carne_preferida, double precio_carne) {
		super(nombre, sexo, fecha_ingreso, patas, peso);
		this.carne_preferida=carne_preferida;
		this.precio_carne=precio_carne;
	}
	public double calculaCostes() {
		return this.peso*this.precio_carne*365*0.02;
	}
}
