package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.ParametrosCancelaCobrancaCartaoCredito;

public class ParametrosCancelaCobrancaCartaoCreditoBuilder {

    private ParametrosCancelaCobrancaCartaoCredito parametrosCancelaCobrancaCartaoCredito;

    public ParametrosCancelaCobrancaCartaoCredito parametrosCancelaCobranca(){

        parametrosCancelaCobrancaCartaoCredito = new ParametrosCancelaCobrancaCartaoCredito();

        parametrosCancelaCobrancaCartaoCredito.setIdPortoPag("String1");
        parametrosCancelaCobrancaCartaoCredito.setIdExterno("String2");
        parametrosCancelaCobrancaCartaoCredito.setIdProduto("String3");

        return parametrosCancelaCobrancaCartaoCredito;
    }
}
