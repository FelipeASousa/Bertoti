package classes;

public class App {
	private static final Integer DEFAULT_COOLING_TEMP = 90;
	private static final Integer MAX_ALLOWED_TEMP = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InjetorDeCombustivel injetor = new InjetorDeCombustivel();
		ControleDeAr controleAr = new ControleDeAr();
		Partida partida = new Partida();
		ControleDeRefrigeracao controleRefrigeracao = new ControleDeRefrigeracao();
		ConversorCatalitico conversor = new ConversorCatalitico();
		
		injetor.on();
		controleAr.refrescar();
		injetor.injecao();
		partida.iniciarPartida();
		controleRefrigeracao.setTemperaturaLimite(DEFAULT_COOLING_TEMP);
		controleRefrigeracao.iniciar();
		conversor.on();
		
		injetor.off();
		conversor.off();
		controleRefrigeracao.resfriar(MAX_ALLOWED_TEMP);
		controleRefrigeracao.parar();
		controleAr.off();
	}

}
