package classes;

public class App {

	public static void main(String[] args) {
		
		// Observador
		CarroPolicia carroPolicia = new CarroPolicia();
		
		//Observado
		CarroRoubado carroRoubado = new CarroRoubado();
		
		carroRoubado.addObserver(carroPolicia);
		
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.esquerda();
		carroRoubado.para();
	}

}
