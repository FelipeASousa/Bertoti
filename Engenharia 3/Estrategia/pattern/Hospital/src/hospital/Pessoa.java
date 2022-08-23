package hospital;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cidade;
    private String estado;
    public RG rg;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public RG getRg() {
        return rg;
    }
    public void setRg(RG rg) {
        this.rg = rg;
    }

    
}
