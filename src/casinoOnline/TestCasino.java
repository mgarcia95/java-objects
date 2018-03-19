package casinoOnline;

public class TestCasino {

	public static void main(String[] args) {
		Jugador jugador = new Jugador(300);
		BlackJack.JuegoBlackJack(jugador, 100);
		System.out.println(jugador.dinero);
		RojoNegro.JuegoRojoNegro(jugador, "rojo", 150);
		System.out.println(jugador.dinero);
		RuletaRusa.JuegoRuletaRusa(jugador, 3, 51);
		System.out.println(jugador.dinero);

	}

}
