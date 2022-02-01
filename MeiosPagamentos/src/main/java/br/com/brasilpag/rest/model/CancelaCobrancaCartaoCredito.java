package br.com.brasilpag.rest.model;

public class CancelaCobrancaCartaoCredito {

    private String motivo;
    private Double valor;

    public CancelaCobrancaCartaoCredito(String motivo, Double valor) {
        this.motivo = motivo;
        this.valor = valor;
    }

    public CancelaCobrancaCartaoCredito() {
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

}
