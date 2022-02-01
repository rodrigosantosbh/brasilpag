package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.utils.GeraIdExterno;
import br.com.brasilpag.rest.model.Cobranca;
import br.com.brasilpag.rest.model.SolicitacaoPagamento;
import java.util.ArrayList;
import java.util.List;

public class SolicitacaoPagamentoBuilder {

    private SolicitacaoPagamento solicitacaoPagamento;
    private List<Cobranca> listaCobrancas;
    private CobrancaBuilder cobrancaBuilder;
    private GeraIdExterno geraIdExterno;
    private MetadadosBuilder metadadosBuilder;

    public SolicitacaoPagamento gerarSolicitacaoPagamento(){

        metadadosBuilder = new MetadadosBuilder();
        geraIdExterno = new GeraIdExterno();
        cobrancaBuilder = new CobrancaBuilder();
        listaCobrancas = new ArrayList<>();
        listaCobrancas.add(cobrancaBuilder.gerarCobranca());
        solicitacaoPagamento = new SolicitacaoPagamento(listaCobrancas, geraIdExterno.toString(), "12345", metadadosBuilder.geraMetadados());

        return solicitacaoPagamento;
    }

    public SolicitacaoPagamento gerarSolicitacaoPagamentoComIdExternoVazio(){

        metadadosBuilder = new MetadadosBuilder();
        geraIdExterno = new GeraIdExterno();
        cobrancaBuilder = new CobrancaBuilder();
        listaCobrancas = new ArrayList<>();
        listaCobrancas.add(cobrancaBuilder.gerarCobranca());
        solicitacaoPagamento = new SolicitacaoPagamento(listaCobrancas, "", "12345", metadadosBuilder.geraMetadados());

        return solicitacaoPagamento;
    }

    public SolicitacaoPagamento gerarSolicitacaoPagamentoComCodProdutoVazio(){

        metadadosBuilder = new MetadadosBuilder();
        geraIdExterno = new GeraIdExterno();
        cobrancaBuilder = new CobrancaBuilder();
        listaCobrancas = new ArrayList<>();
        listaCobrancas.add(cobrancaBuilder.gerarCobranca());
        solicitacaoPagamento = new SolicitacaoPagamento(listaCobrancas, geraIdExterno.toString(), "", metadadosBuilder.geraMetadados());

        return solicitacaoPagamento;
    }
}

