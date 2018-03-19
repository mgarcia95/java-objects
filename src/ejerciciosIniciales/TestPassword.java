package ejerciciosIniciales;
public class TestPassword {

	public static void main(String[] args) {
		Password pass0 = new Password();
		Password pass1= new Password(20);
		System.out.println(pass0.getContrasena());
		System.out.println(pass1.getContrasena());
		System.out.println(pass1.esFuerte("12345HHo"));
	}

}
