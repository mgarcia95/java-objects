package comaresComputer;

public class Programador extends Empleado {
		private int lineacod;
		private String lenguaje;
		
	public Programador(int numero, String dni, String nombre, int fechainc, String titulacion, float salario,String lenguaje) {
		super(numero, dni, nombre, fechainc, titulacion, salario);
		this.lenguaje=lenguaje;
		this.lineacod=0;
	}

	@Override
	public float comision() {
		
		return this.lineacod*0.50f*30;
	}

	public int getLineacod() {
		return lineacod;
	}

	public void setLineacod(int lineacod) {
		this.lineacod = lineacod;
	}

	@Override
	public String toString() {
		return "programador [lineacod=" + lineacod + ", lenguaje=" + lenguaje + ", toString()=" + super.toString()
				+ "]";
	}

	

	

	

	
	
	
	
	
	
}
