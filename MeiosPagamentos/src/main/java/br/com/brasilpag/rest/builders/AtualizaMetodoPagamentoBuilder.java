package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.AtualizaMetodoPagamento;
import br.com.brasilpag.rest.model.CobrancaAtualizaPagamento;
import br.com.brasilpag.rest.model.Parcelas;

import java.util.ArrayList;
import java.util.List;

public class AtualizaMetodoPagamentoBuilder {

    private AtualizaMetodoPagamento atualizaMetodoPagamento;
    private List<CobrancaAtualizaPagamento> listaCobrancaAtualizaPagamento;
    private CobrancaAtualizaPagamentoBuilder cobrancaAtualizaPagamentoBuilder;
    private List<Parcelas> listaParcelas;
    private ParcelasBuilder parcelasBuilder;

    public AtualizaMetodoPagamento gerarAtualizacaoPagamentoComSucesso(){

        parcelasBuilder = new ParcelasBuilder();
        listaParcelas = new ArrayList<>();
        listaParcelas.add(parcelasBuilder.geraParcelas());
        cobrancaAtualizaPagamentoBuilder = new CobrancaAtualizaPagamentoBuilder();
        listaCobrancaAtualizaPagamento = new ArrayList<>();
        listaCobrancaAtualizaPagamento.add(cobrancaAtualizaPagamentoBuilder.geraCobrancaAtualizaPagamento());
        atualizaMetodoPagamento = new AtualizaMetodoPagamento(listaCobrancaAtualizaPagamento, "PAID", listaParcelas);

        return atualizaMetodoPagamento;
    }

    public AtualizaMetodoPagamento gerarAtualizacaoPagamentoComRejeicao(){

        parcelasBuilder = new ParcelasBuilder();
        listaParcelas = new ArrayList<>();
        listaParcelas.add(parcelasBuilder.geraParcelas());
        cobrancaAtualizaPagamentoBuilder = new CobrancaAtualizaPagamentoBuilder();
        listaCobrancaAtualizaPagamento = new ArrayList<>();
        listaCobrancaAtualizaPagamento.add(cobrancaAtualizaPagamentoBuilder.geraCobrancaAtualizaPagamento());
        atualizaMetodoPagamento = new AtualizaMetodoPagamento(listaCobrancaAtualizaPagamento, "REJECT", listaParcelas);

        return atualizaMetodoPagamento;
    }

    public AtualizaMetodoPagamento gerarAtualizacaoPagamentoComIdExternoInexistente(){

        parcelasBuilder = new ParcelasBuilder();
        listaParcelas = new ArrayList<>();
        listaParcelas.add(parcelasBuilder.geraParcelas());
        cobrancaAtualizaPagamentoBuilder = new CobrancaAtualizaPagamentoBuilder();
        listaCobrancaAtualizaPagamento = new ArrayList<>();
        listaCobrancaAtualizaPagamento.add(cobrancaAtualizaPagamentoBuilder.geraCobrancaAtualizaPagamento());
        atualizaMetodoPagamento = new AtualizaMetodoPagamento(listaCobrancaAtualizaPagamento, "String", listaParcelas);

        return atualizaMetodoPagamento;
    }

    public AtualizaMetodoPagamento gerarAtualizacaoPagamentoSemParcelas(){

        parcelasBuilder = new ParcelasBuilder();
        listaParcelas = new ArrayList<>();
        listaParcelas.add(parcelasBuilder.geraParcelas());
        cobrancaAtualizaPagamentoBuilder = new CobrancaAtualizaPagamentoBuilder();
        listaCobrancaAtualizaPagamento = new ArrayList<>();
        listaCobrancaAtualizaPagamento.add(cobrancaAtualizaPagamentoBuilder.geraCobrancaAtualizaPagamento());
        atualizaMetodoPagamento = new AtualizaMetodoPagamento(listaCobrancaAtualizaPagamento, "String", listaParcelas);

        return atualizaMetodoPagamento;
    }
}
