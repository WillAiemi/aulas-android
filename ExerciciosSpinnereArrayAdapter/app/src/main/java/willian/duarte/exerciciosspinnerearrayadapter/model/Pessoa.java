package willian.duarte.exerciciosspinnerearrayadapter.model;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int calcularIdadeEmMeses(){
        return this.idade*12;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nIdade em meses: " + this.calcularIdadeEmMeses() +
                "\n";
    }
}
