package classes;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		carro.setNome("Gol");
		carro.setMotor("v8");
		carro.setPlaca("3423da");
		
		System.out.println("Nome: " + carro.getNome());
		System.out.println("Placa: " + carro.getPlaca());
		System.out.println("Motor: " + carro.getMotor());

	}

}
