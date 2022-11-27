package strategypattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo carro = new Veiculo(new Carro());
		Veiculo aviao = new Veiculo(new Aviao());
		Veiculo navio = new Veiculo(new Navio());
		
		
		carro.dirigir();
		aviao.dirigir();
		navio.dirigir();
	}

}
