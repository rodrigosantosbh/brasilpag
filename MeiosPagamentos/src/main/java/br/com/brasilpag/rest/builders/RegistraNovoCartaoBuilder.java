package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.RegistraNovoCartao;

public class RegistraNovoCartaoBuilder {

    private RegistraNovoCartao registraNovoCartao;
    private ClienteCartaoCreditoBuilder clienteCartaoCreditoBuilder;
    private VencimentoCartaoCreditoBuilder vencimentoCartaoCreditoBuilder;

    public RegistraNovoCartao registraNovoCartaoCreditoComSucesso(){

        vencimentoCartaoCreditoBuilder = new VencimentoCartaoCreditoBuilder();
        clienteCartaoCreditoBuilder = new ClienteCartaoCreditoBuilder();
        registraNovoCartao = new RegistraNovoCartao(clienteCartaoCreditoBuilder.geraCliente(), "Maria Silva", "5336655359848277", true, vencimentoCartaoCreditoBuilder.geraVencimento());

        return registraNovoCartao;

    }
}
