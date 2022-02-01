package br.com.brasilpag.rest.model;

import java.util.List;

public class SolicitacaoPagamento {

    private List<Cobranca> cobrancas;
    private String idExterno;
    private String codProduto;
    private Metadados metadados;

    public SolicitacaoPagamento(List<Cobranca> cobrancas, String idExterno, String codProduto, Metadados metadados) {
        this.cobrancas = cobrancas;
        this.idExterno = idExterno;
        this.codProduto = codProduto;
        this.metadados = metadados;
    }

    public SolicitacaoPagamento(){

    }

    public List<Cobranca> getCobrancas() { return cobrancas; }
    public void setCobrancas(List<Cobranca> cobrancas) {
        this.cobrancas = cobrancas;
    }

    public String getIdExterno() {
        return idExterno;
    }
    public void setIdExterno(String idExterno) {
        this.idExterno = idExterno;
    }

    public String getCodProduto() { return codProduto; }
    public void setCodProduto(String codProduto) { this.codProduto = codProduto; }

    public Metadados getMetadados() { return metadados; }
    public void setMetadados(Metadados metadados) { this.metadados = metadados; }
}
