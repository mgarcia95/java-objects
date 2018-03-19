package mafiosos;

import mafiosos.Capo;
import mafiosos.Sicario;

public class TestMafioso {

	public static void main(String[] args) {
		Mafioso c = new Capo("Pepe", "pp", "Latin", 15, 5);
		Mafioso s = new Sicario("Manu", "M", "T", 30, 5);
		System.out.println("El sicario: "+s.nombre+" estará en la trena "+s.aLaTrena()+" anyos");
		System.out.println("El capo: "+c.nombre+" estará en la trena "+c.aLaTrena()+" anyos");

	}

}
