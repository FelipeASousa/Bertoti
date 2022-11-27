package classes;

public class Radiador {
	public void on() {
		System.out.println("Radiador ligado");
	}
	public void off() {
		System.out.println("Radiador desligado");
	}
	public void setVelocidade(Integer speed) {
		System.out.println("Definindo velocidade do radiador para " + speed);
	}
}
