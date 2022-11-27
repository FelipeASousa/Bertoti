package classes;

public class DepartamentoDeFinancas implements Departamento {
	private Integer id;
	private String nomeString;
	
	public void escrevaNomeDepartamento() {
		System.out.println(getClass().getSimpleName());
	}

	public DepartamentoDeFinancas(Integer id, String nomeString) {
		this.id = id;
		this.nomeString = nomeString;
	}
	
}
