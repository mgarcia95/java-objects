package carreraCoches;

import carreraCoches.Carrera;

public class TestCarrera {

	public static void main(String[] args) {
		Carrera c=new Carrera(5, 100);
		System.out.println("El ganador es "+ c.startCarrera());
		c.imprimeResultados();
		
	}

}
