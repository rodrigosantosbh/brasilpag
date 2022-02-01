package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.builders.AtualizaTokenBuilder;
import br.com.brasilpag.rest.core.ApiPath;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AtualizaTokenTest extends ApiPath {

    private final String ENDPOINT = Endpoint.ATUALIZA_TOKEN;

    private final AtualizaTokenBuilder atualiza = new AtualizaTokenBuilder();

    @Test
    public void AtualizaTokenComSucesso (){

        given()
            .pathParam("cardId", "12862b33-7e57-494b-b1bf-f353fbe1d347")
            .body(atualiza.atualizaTokenComSucesso())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(200);
    }

    @Test
    public void AtualizaTokenComCardIdInvalido (){

        given()
            .pathParam("cardId", "teste")
            .body(atualiza.atualizaTokenComSucesso())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(404)
            .body("mensagem", Matchers.is("Card not found"));
    }

    @Test
    public void AtualizaTokenSemCamposObrigatorios (){

        given()
            .pathParam("cardId", "12862b33-7e57-494b-b1bf-f353fbe1d347")
            .body(atualiza.atualizaTokenSemCamposObrigatorios())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("partnerId"))
            .body("erros.erro[0]", Matchers.is("must not be blank"))
            .body("erros.campo[1]", Matchers.is("expiredTokenId"))
            .body("erros.erro[1]", Matchers.is("must not be blank"))
            .body("erros.campo[2]", Matchers.is("token"))
            .body("erros.erro[2]", Matchers.is("must not be blank"));;
    }
}


