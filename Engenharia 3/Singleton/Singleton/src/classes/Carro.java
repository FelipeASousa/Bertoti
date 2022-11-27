package classes;

public class Carro {
	private static Carro uniqueInstance;
	
	private Carro() {
		
	}
	
	public static synchronized Carro getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = 	new Carro();
		}
		return uniqueInstance;
	}
}
