package casinoOnline;

public class RuletaRusa extends Mesa {

	public static void JuegoRuletaRusa(Jugador jugador, int numero, double apuesta) {
		if(numero>0 && numero<=36 && jugador.dinero>=apuesta) {
			int aleatorio = generaAleatorio(0,36);
			if(aleatorio==numero) {
				System.out.println("Has ganado");
				jugador.dinero+=apuesta*36;
			}
			else if(aleatorio==0) {
				System.out.println("Ha ganado la banca");
				jugador.dinero-=apuesta;
			}
			else System.out.println("No ha ganado nadie");
		}
		else System.out.println("Número introducido no válido o no dispones de dineros para apostar");
	}

}
