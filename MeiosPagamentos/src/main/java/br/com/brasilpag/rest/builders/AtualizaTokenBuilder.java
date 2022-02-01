package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.AtualizaToken;

public class AtualizaTokenBuilder {

    private AtualizaToken atualizaToken;

    public AtualizaToken atualizaTokenComSucesso(){

        atualizaToken = new AtualizaToken("tokenTeste", "partnerIdTeste", "tokenTesteeee");
        return atualizaToken;
    }

    public AtualizaToken atualizaTokenSemCamposObrigatorios(){

        atualizaToken = new AtualizaToken("", "", "");
        return atualizaToken;
    }
}
