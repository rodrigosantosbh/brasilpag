package br.com.brasilpag.rest.model;

public class ConsultaParcelasContrato {

    private String codProduto;
    private String idContrato;
    private String numeroDocumentoCliente;
    private String tipoDocumentoCliente;
    private String origem;

    public String getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getIdContrato() {
        return idContrato;
    }
    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }
    public void setNumeroDocumentoCliente(String numeroDocumentoCliente) { this.numeroDocumentoCliente = numeroDocumentoCliente; }

    public String getTipoDocumentoCliente() {
        return tipoDocumentoCliente;
    }
    public void setTipoDocumentoCliente(String tipoDocumentoCliente) { this.tipoDocumentoCliente = tipoDocumentoCliente; }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
}