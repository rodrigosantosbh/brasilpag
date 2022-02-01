package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.Parcelas;

public class ParcelasBuilder {

    private Parcelas parcelas;

    public Parcelas geraParcelas(){

        parcelas = new Parcelas(1,100.0);

        return parcelas;
    }
}
