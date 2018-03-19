package zoologico;

public class TestAnimal {

	public static void main(String[] args) {
		Animal jirafa = new Herbivoros("JiFi", "mujer", "hoy", 4, 50, "jardin", "lidl", 30, 15);
		System.out.println("La jirafa JiFi gasta: "+jirafa.calculaCostes()+"€");
		
		Animal leon = new Carnivoros("Lili", "hombre", "ayer", 4, 100, "buey", 30);
		System.out.println("El león Lili gasta: "+leon.calculaCostes()+"€");
		
		Animal chimpance = new Omnivoros("Momo", "hombre", "el anyo pasao", 2, 60, "elefante", "grillo", "platano", 30, 3, 4);
		System.out.println("El chimpancé Momo gasta: "+chimpance.calculaCostes()+"€");
	}

}
