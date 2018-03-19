package casinoOnline;

public class RojoNegro extends Mesa {

	public static void JuegoRojoNegro(Jugador jugador, String opcion, double apuesta){
		if(jugador.dinero>=apuesta) {
			String casino;
			if(generaAleatorio(0,1)==0) casino="rojo";
			else casino="negro";
			if(opcion==casino) {
				System.out.println("¡Has ganado!");
				jugador.dinero+=apuesta*2;
			}
			else {
				System.out.println("¡Has perdido!");
				jugador.dinero-=apuesta;
			}
		}
		else System.out.println("No tienes dinero suficiente para apostar");
	}

}
