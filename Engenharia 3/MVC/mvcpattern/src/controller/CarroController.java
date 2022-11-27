package controller;

import model.Carro;
import view.CarroView;

public class CarroController {
	private Carro model;
	private CarroView view;
	
	public CarroController(Carro model, CarroView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setCarroNome(String nome) {
		model.setNome(nome);
	}
	
	public String getCarroNome() {
		return model.getNome();
	}
	
	public void setCarroPlaca(String placa) {
		model.setPlaca(placa);
	}
	
	public String getCarroPlaca() {
		return model.getPlaca();
	}
	
	public void setCarroMotor(String motor) {
		model.setMotor(motor);
	}
	
	public String getCarroMotor() {
		return model.getMotor();
	}
	
	public void updateView() {
		view.printCarDetails(getCarroNome(), getCarroPlaca(), getCarroMotor());
	}
	
}
