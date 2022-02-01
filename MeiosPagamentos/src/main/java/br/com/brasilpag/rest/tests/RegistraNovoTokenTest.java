package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.core.ApiPath;
import br.com.brasilpag.rest.builders.RegistraNovoTokenBuilder;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RegistraNovoTokenTest extends ApiPath {

    private final String ENDPOINT = Endpoint.REGISTRA_NOVO_TOKEN;

    private final RegistraNovoTokenBuilder token = new RegistraNovoTokenBuilder();

    @Test
    public void registraTokenComSucesso (){

        given()
            .pathParam("cardId", "12862b33-7e57-494b-b1bf-f353fbe1d347")
            .body(token.registraTokenComSucesso())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(200);
        }

    @Test
    public void registraTokenSemCamposObrigatorios (){

        given()
            .pathParam("cardId", "12862b33-7e57-494b-b1bf-f353fbe1d347")
            .body(token.registraTokenSemCamposObrigatorios())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("partnerId"))
            .body("erros.erro[0]", Matchers.is("must not be blank"))
            .body("erros.campo[1]", Matchers.is("token"))
            .body("erros.erro[1]", Matchers.is("must not be blank"));
    }
}
