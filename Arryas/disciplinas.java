package Arryas;

public class disciplinas {
    private int idDisciplinas;
    private String nome;

    public int getIdDisciplinas() {
        return idDisciplinas;
    }
    public void setIdDisciplinas(int idDisciplinas) {
        this.idDisciplinas = idDisciplinas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public disciplinas() {
        this.idDisciplinas = idDisciplinas;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "disciplinas [idDisciplinas=" + idDisciplinas + ", nome=" + nome + "]";
    }
    
}
  
