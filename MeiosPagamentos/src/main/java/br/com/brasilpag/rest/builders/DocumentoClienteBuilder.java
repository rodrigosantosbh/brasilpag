package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.DocumentoCliente;

public class DocumentoClienteBuilder {

    private DocumentoCliente documento;

    public DocumentoCliente geraDocumento(){

        documento = new DocumentoCliente("19515216095", "CPF");

        return documento;
    }
}
