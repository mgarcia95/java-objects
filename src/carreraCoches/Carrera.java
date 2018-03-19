package carreraCoches;

import java.util.Scanner;

public class Carrera {
	Coche[] numeroCoches;
	double distanciaCarrera;
	
	public Carrera(int numeroCoches, double distanciaCarrera) {
		this.distanciaCarrera=distanciaCarrera;
		this.numeroCoches = new Coche[numeroCoches];
		for(int i=0; i<numeroCoches; i++) {
			System.out.print("Introduce el nombre del piloto: ");
			@SuppressWarnings("resource")
			String piloto = new Scanner(System.in).next();
			System.out.println();
			System.out.print("Introduce el numero del coche: ");
			@SuppressWarnings("resource")
			int numero = new Scanner(System.in).nextInt();
			System.out.println();
			this.numeroCoches[i]=new Coche(numero, piloto);
		}
	}
	/////////Metodos/////////////
	public String startCarrera() {
		boolean finCarrera = false;
		String ganador = "";
		while(!finCarrera) {
			for(int i=0; i<numeroCoches.length; i++) {
				int distancia = generaAleatorio(1,10);
				this.numeroCoches[i].distancia += distancia;
				if(this.numeroCoches[i].distancia>=this.distanciaCarrera) {
					ganador=this.numeroCoches[i].piloto;
					finCarrera=true; 
				}
			}
		}
		return ganador;
	}
	public void imprimeResultados() {
		for(int i=0; i<this.numeroCoches.length;i++) {
			System.out.println("Coche "+this.numeroCoches[i].numero+" Distancia: "+ this.numeroCoches[i].distancia);
		
		}
	}
	private int generaAleatorio(int inicio, int fin) {
		return (int) Math.floor(Math.random()*(fin-inicio+1)+inicio);
	}

}
