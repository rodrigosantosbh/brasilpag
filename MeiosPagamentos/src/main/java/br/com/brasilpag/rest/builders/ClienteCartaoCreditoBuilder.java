package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.ClienteCartaoCredito;

public class ClienteCartaoCreditoBuilder {

    private ClienteCartaoCredito cliente;
    private DocumentoClienteBuilder documentoClienteBuilder;

    public ClienteCartaoCredito geraCliente(){

        documentoClienteBuilder = new DocumentoClienteBuilder();
        cliente = new ClienteCartaoCredito("123456","Maria", "Silva",documentoClienteBuilder.geraDocumento());

        return cliente;
    }
}
