package ejerciciosIniciales;
import java.util.Scanner;



public class TestPersona {
	
	private static Scanner pideTeclado(String h) {
		System.out.print("Introduce "+h+": ");
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	private static void calculaIMC(Persona p) {
		int n = p.calcularIMC();
		if(n==-1) System.out.println("IMC: infrapeso");
		else if (n==0) System.out.println("IMC: peso ideal");
		else System.out.println("IMC: sobrepeso");
	}
	private static void mayoriaEdad(Persona p) {
		if(p.esMayorDeEdad()) System.out.println("Es mayor de edad");
		else System.out.println("No es mayor de edad");
	}
	public static void main(String[] args) {
		///////////////////////////////////////////////////
		Scanner scnombre = pideTeclado("Nombre");
		String nombre = scnombre.next();
		//////////////////////////////////////////////////
		Scanner scedad = pideTeclado("Edad");
		Integer edad = scedad.nextInt();
		//////////////////////////////////////////////////
		Scanner scsexo = pideTeclado("Sexo");
		Character sexo = scsexo.next().charAt(0);
		//////////////////////////////////////////////////
		Scanner scpeso = pideTeclado("Peso");
		Double peso = scpeso.nextDouble();
		/////////////////////////////////////////////////
		Scanner scaltura = pideTeclado("Altura");
		Double altura = scaltura.nextDouble();
		////////////////////////////////////////////////
		
		
		
		Persona p0 = new Persona(nombre, edad, sexo, peso, altura);
		Persona p1 = new Persona(nombre, edad, sexo);
		Persona p2 = new Persona();
		p2.setNombre("Manuel");
		p2.setEdad(17);
		p2.setSexo('M');
		p2.setPeso(80.0);
		p2.setAltura(1.80);
		
		
		
		///////////////////////////////////////////////////
		System.out.println("==========Hablemos de p0:=========");
		System.out.println(p0.toString());
		calculaIMC(p0);
		mayoriaEdad(p0);
		System.out.println("==========Hablemos de p1:=========");
		System.out.println(p1.toString());
		calculaIMC(p1);
		mayoriaEdad(p1);
		System.out.println("==========Hablemos de p2:=========");
		System.out.println(p2.toString());
		calculaIMC(p2);
		mayoriaEdad(p2);
		

	}
}
