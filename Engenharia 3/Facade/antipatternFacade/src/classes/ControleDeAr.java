package classes;

public class ControleDeAr {
	private MedidorFluxoDeAr medidor = new MedidorFluxoDeAr();
	
	public void refrescar() {
		System.out.println("Ar fornecido");
	}
	
	public void off() {
		System.out.println("Controlador de ar desligado");
	}
}
