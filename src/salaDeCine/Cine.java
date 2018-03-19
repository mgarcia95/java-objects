package salaDeCine;


public class Cine {
	Pelicula pelicula;
	double precio;
	boolean asientos [][];
	int fila;
	int letra;
	public Cine(double precio) {
		this.precio=precio;
		generaAsientos(8,9);
	}
	
	private void generaAsientos(int filas, int columnas) {
		boolean [][] asientos = new boolean[filas][columnas];
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				asientos[i][j] = false;
			}
		}
		this.asientos=asientos;
	}
	public void sientaEspectador(Espectador espectador, Pelicula pelicula) {
		int fila = generaAleatorio(0,7);
		int columna = generaAleatorio(0,8);
		if(buscaLibres() && espectador.dinero>=this.precio && espectador.edad>=pelicula.edad_minima) {
		while(this.asientos[fila][columna]) {
			fila = generaAleatorio(0,7);
			columna = generaAleatorio(0,8);
		}
		this.asientos[fila][columna] = true;
		espectador.dinero-=this.precio;
		}
		else System.out.println("Lo sentimos, no hay asientos libres o no cumple los requisitos para ver esta pelicula");
	}
	private boolean buscaLibres() {
		for(int i=0; i<this.asientos.length; i++){
			for(int j=0; j<this.asientos[i].length;j++) {
				if(!this.asientos[i][j]) return true;
			}
		}
		return false;
		
	}
	private int generaAleatorio(int inicio, int fin) {
		 return (int) Math.floor(Math.random()*(fin-inicio+1)+inicio);
	}
	public void imprimeAsientos() {
		for(int i = 0; i<this.asientos.length;i++) {
			for(int j=0; j<this.asientos[i].length;j++) {
				if(this.asientos[i][j]) {
					System.out.println("Asiento ["+i+"]["+j+"] = "+this.asientos[i][j]+" ");
				}
			}
			//System.out.println();
		}
		
	}
}
