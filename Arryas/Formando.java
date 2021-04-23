package Arryas;
import java.util.ArrayList;

public class Formando {
    private int idFormando;
    private String nome;
    private boolean masculino;
    private int telefones;

    public Formando() {
    }

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }


    public int getTelefones() {
        return telefones;
    }

    public void setTelefones(int telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Formando{" +
                "idFormando=" + idFormando +
                ", nome='" + nome + '\'' +
                ", masculino=" + masculino +
                ", telefones=" + telefones +
                '}';
    }
}