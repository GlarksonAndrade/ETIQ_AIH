package main;

public class Etiqueta {
    private int codUnidade;
    private int ano;
    private long esquerdo;
    private int direito;


    public Etiqueta(int codUnidade, int ano, long esquerdo, int direito) {
        this.codUnidade = codUnidade;
        this.ano = ano;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }

    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public long getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(long esquerdo) {
        this.esquerdo = esquerdo;
    }

    public int getDireito() {
        return direito;
    }

    public void setDireito(int direito) {
        this.direito = direito;
    }


    public String toString(long l) {

        return "o numero digitado foi: " + this.getCodUnidade() + this.getAno() + this.getEsquerdo() + "-" + this.getDireito();
    }
}
