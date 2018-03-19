package comaresComputer;

public abstract class Empleado {
	private int numero;
	private String dni;
	private String nombre;
	private int fechainc;
	private String titulacion;
	private float salario;
	
	public Empleado(int numero, String dni, String nombre, int fechainc, String titulacion, float salario) {
		this.numero = numero;
		this.dni = dni;
		this.nombre = nombre;
		if (fechainc > 2018) fechainc=2018;
		this.fechainc = fechainc;
		this.titulacion = titulacion;
		this.salario = salario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechainc() {
		return fechainc;
	}

	public void setFechainc(int fechainc) {
		if (fechainc > 2018) fechainc=2018;
		this.fechainc = fechainc;
		
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String experiencia() {
		String salida;
		if(2018-this.fechainc<1) salida="novato";
		else if((2018-this.fechainc>=1)&&(2018-this.fechainc<=4)) salida="medio";
		else salida="experto";
		return salida;
		
	}
	
	public void incrementaSalario(float porcentaje) {
		this.salario+=this.salario*porcentaje;
	}
	
	public abstract float comision();

	@Override
	public String toString() {
		return "empleado [numero=" + numero + ", dni=" + dni + ", nombre=" + nombre + ", fechainc=" + fechainc
				+ ", titulacion=" + titulacion + ", salario=" + salario + "]";
	}
	
	
}


