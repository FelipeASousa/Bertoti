package hospital;

public class Consulta implements Consultar{
    public String hora_consulta;
    public String sintomas[] = new String[10];
    public String receita;

    @Override
    public void relatarSintomas(){
        for (String sintoma : sintomas) {
            System.out.println(sintoma);
        }
    }

    
    @Override
    public void passarReceita(){
        System.out.println(receita);
    }
}
