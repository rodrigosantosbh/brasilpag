package br.com.brasilpag.rest.model;

public class Parcelas {

    private int parcela;
    private Double valor;

    public Parcelas(int parcela, Double valor) {
        this.parcela = parcela;
        this.valor = valor;
    }

    public Parcelas(){
    }

    public int getParcela() { return parcela; }
    public void setParcela(int parcela) { this.parcela = parcela;}

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
}
