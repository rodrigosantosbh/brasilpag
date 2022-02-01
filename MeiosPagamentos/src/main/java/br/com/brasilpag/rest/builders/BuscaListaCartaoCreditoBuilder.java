package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.BuscaListaCartaoCredito;

public class BuscaListaCartaoCreditoBuilder {

    private BuscaListaCartaoCredito buscaListaCartaoCredito;

    public BuscaListaCartaoCredito buscaListaCartaoComSucesso(){

        buscaListaCartaoCredito = new BuscaListaCartaoCredito();

        buscaListaCartaoCredito.setNumero("58620493043");
        buscaListaCartaoCredito.setTipo("CPF");

        return buscaListaCartaoCredito;
    }

    public BuscaListaCartaoCredito buscaListaCartaoSemCpf(){

        buscaListaCartaoCredito = new BuscaListaCartaoCredito();

        buscaListaCartaoCredito.setNumero("");
        buscaListaCartaoCredito.setTipo("CPF");

        return buscaListaCartaoCredito;
    }
}
