package entities;

public class Jogador {

    private String nome;
    private Integer idade;
    private Integer numeroDaCamisa;

    public Jogador(String nome, Integer idade, Integer numeroDaCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNumeroDaCamisa(Integer numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }
}
