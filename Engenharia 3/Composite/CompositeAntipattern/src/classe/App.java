package classe;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departamento dep = new Departamento();
		dep.setId(2);
		dep.setNome("Departamento de financas");
		
		Departamento dep2 = new Departamento();
		dep2.setId(1);
		dep2.setNome("Departamento de Estratégia");
		
		System.out.println("ID: " + dep.getId());
		System.out.println("Nome: " + dep.getNome());
		
		System.out.println("ID: " + dep2.getId());
		System.out.println("Nome: " + dep2.getNome());
		
	}

}
