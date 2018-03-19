package zoologico;

public class Herbivoros extends Animal {
	String hierba_preferida;
	String pienso;
	int precio_hierba;
	int precio_pienso;
	public Herbivoros(String nombre, String sexo, String fecha_ingreso, int patas, int peso, String hierba_preferida, String pienso, int precio_hierba, int precio_pienso) {
		super(nombre, sexo, fecha_ingreso, patas, peso);
		this.hierba_preferida=hierba_preferida;
		this.pienso=pienso;
		this.precio_hierba=precio_hierba;
		this.precio_pienso=precio_pienso;
	}
	public double calculaCostes() {
		double hierba = this.precio_hierba*this.peso*0.05*365*6/12;
		double pienso = 365*0.02*this.peso*this.precio_pienso*6/12;
		return (hierba+pienso);
	}
	

}
