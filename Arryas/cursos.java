package Arryas;
import java.util.ArrayList;
public class cursos {
    private int idCurso;
    private String nome;
    private int horas;

    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    public cursos() {
        this.idCurso = idCurso;
        this.nome = nome;
        this.horas = horas;
    }
    @Override
    public String toString() {
        return "cursos [horas=" + horas + ", idCurso=" + idCurso + ", nome=" + nome + "]";
    }
    public static void setidDisciplina(int i) {
    }
    
}
