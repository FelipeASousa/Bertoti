package main;

import model.Carro;
import view.CarroView;
import controller.CarroController;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro model = retriveCarroFromDatabase();
		CarroView view = new CarroView();
		CarroController controller = new CarroController(model,view);
		controller.updateView();
		controller.setCarroNome("Porsche");
		controller.setCarroPlaca("3432sd");
		controller.setCarroMotor("v5");
		controller.updateView();
		
	}
	
    private static Carro retriveCarroFromDatabase()
    {
        Carro carro = new Carro();
        carro.setNome("Gol");
        carro.setPlaca("15UCS157");
        carro.setMotor("V8");
        return carro;
    }

}
