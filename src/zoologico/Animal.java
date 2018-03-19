package zoologico;


public abstract class Animal {
	protected String nombre;
	protected String sexo;
	protected int patas;
	protected int peso;
	protected String fecha_ingreso;
	
	public Animal(String nombre, String sexo, String fecha_ingreso, int patas, int peso) {
		this.nombre=nombre;
		this.sexo=sexo;
		this.fecha_ingreso=fecha_ingreso;
		this.patas=patas;
		this.peso=peso;
	}
	public abstract double calculaCostes();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	
}
