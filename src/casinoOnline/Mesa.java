package casinoOnline;

public abstract class Mesa {
	protected static int generaAleatorio(int inicio, int fin) {
		return (int) Math.floor(Math.random()*(fin-inicio+1)+inicio);
	}
}
