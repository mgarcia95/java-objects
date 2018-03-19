package ejerciciosIniciales;

public class Password {
	private int longitud;
	private String contrasena;
	/////////////////Constructores/////////////////
	public Password() {
		generarPassword(8);
	}
	public Password(int longitud) {
		generarPassword(longitud);
	}
	///////////////////Get y Set///////////////////
	public String getContrasena() {
		return contrasena;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	/////////////////Otros metodos/////////////////
	private void generarPassword(int longitud) {
		/*Variable orden para coger entre numeros o letras mayusculas y minusculas
		 *Luego habrá que ver con un if y hacer otro aleatorio y pasar a ascii y un bucle 
		 *para que se ejecute longitud veces
		 */
		String password = "";
		int ascii;
		for(int i=0; i<longitud; i++) {
			Integer orden = (int) (Math.random() * 3);
			//System.out.println("Orden:"+ orden);
			if(orden==0) ascii = (int)Math.floor(Math.random()*(57-48+1)+(48));
			else if (orden==1) ascii = (int)Math.floor(Math.random()*(90-65+1)+(65));
			else ascii = (int)Math.floor(Math.random()*(122-97+1)+(97));
			if(orden==0) System.out.println("ASCII: "+ascii);
			//System.out.println("Orden: "+orden+"ASCII: "+ascii);
			password+=(char) ascii;
		}
		this.contrasena=password;
	}
	public boolean esFuerte(String password) {
		int mayus=0;
		int minus=0;
		int num=0;
		for(int i=0;i<password.length();i++) {
			int letra = (int) password.charAt(i);
			if(letra>=65 && letra<=90) mayus++;
			if(letra>=97 && letra<=122) minus++;
			if(letra>=48 && letra <=57) num++;
		}
		if(mayus>=2 && minus>=1 && num>=5) return true;
		else return false;
	}
}
