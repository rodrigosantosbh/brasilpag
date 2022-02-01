package br.com.brasilpag.rest.model;

public class ParametrosCancelaCobrancaCartaoCredito {

    private String idPortoPag;
    private String idExterno;
    private String idProduto;

    public ParametrosCancelaCobrancaCartaoCredito() {
    }

    public String getIdPortoPag() { return idPortoPag; }
    public void setIdPortoPag(String idPortoPag) { this.idPortoPag = idPortoPag; }

    public String getIdExterno() { return idExterno; }
    public void setIdExterno(String idExterno) { this.idExterno = idExterno; }

    public String getIdProduto() { return idProduto; }
    public void setIdProduto(String idProduto) { this.idProduto = idProduto; }
}
