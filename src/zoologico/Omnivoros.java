package zoologico;

public class Omnivoros extends Animal {
	
	String carne_preferida;
	String hierba_preferida;
	String insecto_preferido;
	int precio_carne;
	int precio_hierba;
	int precio_insecto;
	
	public Omnivoros(String nombre, String sexo, String fecha_ingreso, int patas, int peso, String carne_preferida, String hierba_preferida, String insecto_preferido, int precio_carne, int precio_hierba, int precio_insecto) {
		super(nombre, sexo, fecha_ingreso, patas, peso);
		this.carne_preferida=carne_preferida;
		this.hierba_preferida=hierba_preferida;
		this.insecto_preferido=insecto_preferido;
		this.precio_carne=precio_carne;
		this.precio_hierba=precio_hierba;
		this.precio_insecto=precio_insecto;
	}
	
	public double calculaCostes() {
		double hierba = 365*0.03*this.peso*this.precio_hierba*3/12;
		double insecto = 365*0.01*this.peso*this.precio_insecto*5/12;
		double carne = 365*0.05*this.peso*this.precio_carne*4/12;
		return hierba+insecto+carne;
	}

	

}
