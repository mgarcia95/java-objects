package comaresComputer;

public class Tecnico extends Empleado {
		String especialidad;
		int arregloEspecialista;
		int arregloNoespecialista;
		
	public Tecnico(int numero, String dni, String nombre, int fechainc, String titulacion, float salario,String especialidad) {
		super(numero, dni, nombre, fechainc, titulacion, salario);
		this.especialidad=especialidad;
		this.arregloEspecialista=0;
		this.arregloNoespecialista=0;
	}

	@Override
	public float comision() {
		
		return (this.arregloNoespecialista*7+this.arregloEspecialista*10)*4;
	}

	public int getArregloEspecialista() {
		return arregloEspecialista;
	}

	public void setArregloEspecialista(int arregloEspecialista) {
		this.arregloEspecialista = arregloEspecialista;
	}

	public int getArregloNoespecialista() {
		return arregloNoespecialista;
	}

	public void setArregloNoespecialista(int arregloNoespecialista) {
		this.arregloNoespecialista = arregloNoespecialista;
	}

	@Override
	public String toString() {
		return "tecnico [especialidad=" + especialidad + ", arregloEspecialista=" + arregloEspecialista
				+ ", arregloNoespecialista=" + arregloNoespecialista + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
