package classes;

import java.util.Observable;
import java.util.Observer;

public class CarroRoubado extends Observable implements Carro {
	private String acao = "";
	
	public void frente() {
		acao = "frente";
		System.out.println("Carro roubado segue em frente");
		this.mudaEstado();
	}
	public void direita() {
		acao = "direita";
		System.out.println("Carro roubado segue para a direita");
		this.mudaEstado();
	}
	public void esquerda() {
		acao = "esquerda";
		System.out.println("Carro roubado segue para a esquerda");
		this.mudaEstado();
	}
	public void para() {
		acao = "para";
		System.out.println("Carro roubado para");
		this.mudaEstado();
	}
	
	public void mudaEstado() {
		setChanged();
		notifyObservers(acao);
	}
}
