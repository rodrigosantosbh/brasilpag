package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.ConsultaParcelasContrato;

public class ConsultaParcelasContratoBuilder {

    private ConsultaParcelasContrato consultaParcelasContrato;

    public ConsultaParcelasContrato consultaParcelaPayload(){

        consultaParcelasContrato = new ConsultaParcelasContrato();

        consultaParcelasContrato.setCodProduto("11111");
        consultaParcelasContrato.setIdContrato("22222");
        consultaParcelasContrato.setTipoDocumentoCliente("33333");
        consultaParcelasContrato.setNumeroDocumentoCliente("44444");
        consultaParcelasContrato.setOrigem("55555");

        return consultaParcelasContrato;
    }
}
