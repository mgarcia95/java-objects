package controlVuelos;

public class TestVuelos {

	public static void main(String[] args) {
		//avion ab = new avion(2, 6);
		aeropuerto a = new aeropuerto();
		System.out.println(a.toString());
		System.out.println("----------------");
		avion av = new avion(1, 5);
		
		aeropuerto b = new aeropuerto(av);
		System.out.println(b.toString());
		System.out.println("----------------");
		
		a.aterrizarDesde(b);
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
