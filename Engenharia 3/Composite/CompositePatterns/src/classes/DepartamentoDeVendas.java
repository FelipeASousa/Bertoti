package classes;

public class DepartamentoDeVendas implements Departamento{
	private Integer id;
	private String nome;
	
	public void escrevaNomeDepartamento() {
		System.out.println(getClass().getSimpleName());
	}

	public DepartamentoDeVendas(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	
}
