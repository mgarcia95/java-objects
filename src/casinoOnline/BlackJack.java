package casinoOnline;

public class BlackJack extends Mesa {
	
	public static void JuegoBlackJack(Jugador jugador, double apuesta) {
		if(jugador.dinero>=apuesta) {
			if (generaAleatorio(19,27)<=21) {
				System.out.println("Has ganado");
				jugador.dinero+=apuesta*3;
			}
			else {
				System.out.println("Has perdido");
				jugador.dinero-=apuesta;
			}
		}
		else System.out.println("No dispones dinero suficiente para apostar");
	}

}