package ejerciciosIniciales;

public class Persona {
	private String nombre;
	private Integer edad;
	private String dni;
	private Double peso;
	private Double altura;
	private char sexo;
	private static final int infrapeso=-1;
	private static final int pesoideal=0;
	private static final int sobrepeso=1;
	/////////////////Constructores/////////////////
	public Persona() {
		this.nombre= "";
		this.edad= 0;
		this.dni = generaDNI();
		this.sexo= 'H';
		this.peso = 0.0;
		this.altura = 0.0;
	}
	public Persona(String nombre,Integer edad, Character sexo) {
		this();
		this.nombre=nombre;
		this.edad=edad;
		compruebaSexo(sexo); //Este método añade el sexo aparte de comprobarlo
	}
	public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
		this(nombre, edad, sexo);
		this.peso=peso;
		this.altura=altura;
	}
	//////////////////////Set//////////////////////
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public void setSexo(Character sexo) {
		compruebaSexo(sexo); //Este método añade el sexo además de comprobarlo
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	///////////////////toString////////////////////
	public String toString() {
		return "Nombre: "+this.nombre+", Edad: "+this.edad+", Sexo: "+this.sexo+", DNI: "+this.dni+", Peso: "+this.peso+", Altura: "+this.altura;
	}
	/////////////////Otros metodos/////////////////
	public int calcularIMC() {
		Double imc = (this.peso/(Math.pow(this.altura, 2)));
		if(imc>25) return Persona.sobrepeso;
		else if(imc>=20 && imc<=25) return Persona.pesoideal;
		else return Persona.infrapeso;
	}
	public boolean esMayorDeEdad() {
		if(this.edad>=18) return true;
		else return false;
	}
	private void compruebaSexo(char sexo) {
		if(sexo=='H' || sexo=='M') this.sexo=sexo;
		else this.sexo='H';
	}
	private String generaDNI() {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		Integer dni = (int) (Math.random() * 99999999) + 10000000;
		return dni+""+letras.charAt(dni%23);
	}	
}
