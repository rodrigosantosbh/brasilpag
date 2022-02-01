package br.com.brasilpag.rest.model;

public class DocumentoCliente {

    private String numero;
    private String tipo;

    public DocumentoCliente(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public DocumentoCliente() {
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
