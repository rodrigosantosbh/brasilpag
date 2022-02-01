package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.CobrancaAtualizaPagamento;

public class CobrancaAtualizaPagamentoBuilder {

    private CobrancaAtualizaPagamento cobrancaAtualizaPagamento;
    private CartaoCreditoAtualizaPagamentoBuilder cartaoCreditoAtualizaPagamentoBuilder;

    public CobrancaAtualizaPagamento geraCobrancaAtualizaPagamento(){

        cartaoCreditoAtualizaPagamentoBuilder = new CartaoCreditoAtualizaPagamentoBuilder();
        cobrancaAtualizaPagamento = new CobrancaAtualizaPagamento(cartaoCreditoAtualizaPagamentoBuilder.geraCartaoCreditoAtualizaPagamento(), "CARTAO_CREDITO", 100.00);

        return cobrancaAtualizaPagamento;
    }
}
