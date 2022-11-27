package classes;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departamento departamentoDeVenda = new DepartamentoDeVendas(1, "Departamento de Vendas");
		Departamento departamentoDeFinanca = new DepartamentoDeFinancas(2, "Departamento de Financas");
		HeadDepartamento headDepartamento = new HeadDepartamento(3, "Departamento de Vendas");
		
		headDepartamento.addDepartamento(departamentoDeVenda);
		headDepartamento.addDepartamento(departamentoDeFinanca);
		headDepartamento.escrevaNomeDepartamento();
	}

}
