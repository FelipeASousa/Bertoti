package classes;

public class CarEngineFacade {
	private static final Integer DEFAULT_COOLING_TEMP = 90;
	private static final Integer MAX_ALLOWED_TEMP = 50;
	private InjetorDeCombustivel injetor = new InjetorDeCombustivel();
	private ControleDeAr controleAr = new ControleDeAr();
	private Partida partida = new Partida();
	private ControleDeRefrigeracao controleRefrigeracao = new ControleDeRefrigeracao();
	private ConversorCatalitico conversor = new ConversorCatalitico();
	
	public void startEngine() {
		injetor.on();
		controleAr.refrescar();
		injetor.injecao();
		partida.iniciarPartida();
		controleRefrigeracao.setTemperaturaLimite(DEFAULT_COOLING_TEMP);
		controleRefrigeracao.iniciar();
		conversor.on();
	}
	
	public void stopEngine() {
		injetor.off();
		conversor.off();
		controleRefrigeracao.resfriar(MAX_ALLOWED_TEMP);
		controleRefrigeracao.parar();
		controleAr.off();
	}
}
