package classes;

public class Departamento {
	public Integer id;
	public String nomeString;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeString() {
		return nomeString;
	}
	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	
	
	public void informacao(Integer id, String nome) {
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
	}
	
}
