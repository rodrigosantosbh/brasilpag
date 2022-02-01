package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.RegistraNovoToken;

public class RegistraNovoTokenBuilder {

    private RegistraNovoToken registraNovoToken;

    public RegistraNovoToken registraTokenComSucesso(){

        registraNovoToken = new RegistraNovoToken("partnerIdTeste", "tokenTeste");
        return registraNovoToken;
    }

    public RegistraNovoToken registraTokenSemCamposObrigatorios(){

        registraNovoToken = new RegistraNovoToken("", "");
        return registraNovoToken;
    }
}
