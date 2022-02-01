package br.com.brasilpag.rest.model;

public class VencimentoCartaoCredito {

    private String mes;
    private String ano;

    public VencimentoCartaoCredito(String mes, String ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public VencimentoCartaoCredito() {
    }

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }

    public String getAno() { return ano; }
    public void setAno(String ano) { this.ano = ano; }
}
