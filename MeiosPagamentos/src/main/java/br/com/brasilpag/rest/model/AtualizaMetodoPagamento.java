package br.com.brasilpag.rest.model;

import java.util.List;

public class AtualizaMetodoPagamento {

    private List<CobrancaAtualizaPagamento> cobrancas;
    private String idExterno;
    private List<Parcelas> parcelas;

    public AtualizaMetodoPagamento(List<CobrancaAtualizaPagamento> cobrancas, String idExterno, List<Parcelas> parcelas) {
        this.cobrancas = cobrancas;
        this.idExterno = idExterno;
        this.parcelas = parcelas;
    }

    public List<CobrancaAtualizaPagamento> getCobrancas() { return cobrancas; }
    public void setCobrancas(List<CobrancaAtualizaPagamento> cobrancas) { this.cobrancas = cobrancas; }

    public String getIdExterno() { return idExterno; }
    public void setIdExterno(String idExterno) { this.idExterno = idExterno; }

    public List<Parcelas> getParcelas() { return parcelas; }
    public void setParcelas(List<Parcelas> parcelas) { this.parcelas = parcelas; }
}
