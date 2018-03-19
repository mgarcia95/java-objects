package salaDeCine;

public class TestCine {

	public static void main(String[] args) {
		Pelicula lazona = new Pelicula("La Zona", "Javier", 120, 16);
		Espectador cristian = new Espectador("Cristian", 21, 99999999);
		Cine artesiete = new Cine(1);
		artesiete.sientaEspectador(cristian, lazona);
		
		Espectador pedro = new Espectador("Pedro", 20, 30);
		artesiete.sientaEspectador(pedro, lazona);
		for(int i=0; i<73;i++) artesiete.sientaEspectador(cristian, lazona);
		artesiete.imprimeAsientos();
	}

}
