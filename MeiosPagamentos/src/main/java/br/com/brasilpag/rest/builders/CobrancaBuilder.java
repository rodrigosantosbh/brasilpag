package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.Cobranca;

public class CobrancaBuilder {

    private Cobranca cobranca;
    private CartaoCreditoBuilder cartaoCreditoBuilder;

    public Cobranca gerarCobranca(){

        cartaoCreditoBuilder = new CartaoCreditoBuilder();
        cobranca = new Cobranca(cartaoCreditoBuilder.gerarCartaoCredito(), "CARTAO_CREDITO", 2500.00);

        return cobranca;
    }
}
