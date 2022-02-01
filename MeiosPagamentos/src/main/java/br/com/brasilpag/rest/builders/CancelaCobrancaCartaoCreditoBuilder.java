package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.CancelaCobrancaCartaoCredito;

public class CancelaCobrancaCartaoCreditoBuilder {

    private CancelaCobrancaCartaoCredito cancelaCobrancaCartaoCredito;

    public CancelaCobrancaCartaoCredito cancelaCobrancaSucesso(){

        cancelaCobrancaCartaoCredito = new CancelaCobrancaCartaoCredito("String", 200.00);
        return cancelaCobrancaCartaoCredito;
    }

    public CancelaCobrancaCartaoCredito cancelaCobrancaErro(){

        cancelaCobrancaCartaoCredito = new CancelaCobrancaCartaoCredito("ERROR", 200.00);
        return cancelaCobrancaCartaoCredito;
    }

    public CancelaCobrancaCartaoCredito cancelaCobrancaSemMotivo(){

        cancelaCobrancaCartaoCredito = new CancelaCobrancaCartaoCredito("", 200.00);
        return cancelaCobrancaCartaoCredito;
    }

    public CancelaCobrancaCartaoCredito cancelaCobrancaSemMotivoValor(){

        cancelaCobrancaCartaoCredito = new CancelaCobrancaCartaoCredito();
        return cancelaCobrancaCartaoCredito;
    }

    public CancelaCobrancaCartaoCredito cancelaCobrancaComValorMenorQueUm(){

        cancelaCobrancaCartaoCredito = new CancelaCobrancaCartaoCredito("String", 0.0);
        return cancelaCobrancaCartaoCredito;
    }
}
