package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.VencimentoCartaoCredito;

public class VencimentoCartaoCreditoBuilder {

    private VencimentoCartaoCredito vencimento;

    public VencimentoCartaoCredito geraVencimento(){

        vencimento = new VencimentoCartaoCredito("01", "2025");

        return vencimento;
    }
}
