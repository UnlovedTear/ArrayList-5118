package Arryas;

public class inscricoes {
    private int IdFormando;
    private int IdCurso;
    
    public int getIdFormando() {
        return IdFormando;
    }
    public void setIdFormando(int idFormando) {
        IdFormando = idFormando;
    }
    public int getIdCurso() {
        return IdCurso;
    }
    public void setIdCurso(int idCurso) {
        IdCurso = idCurso;
    }

    @Override
    public String toString() {
        return " IdCurso = " + IdCurso + ", IdFormando = " + IdFormando;
    }
}
