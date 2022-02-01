package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.core.ApiPath;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BuscaCartaoCreditoTest extends ApiPath {

    private final String ENDPOINT = Endpoint.BUSCA_CARTAO_POR_ID;

    @Test
    public void BuscaCartaoCreditoComSucesso (){

        given()
            .pathParam("cardId", "94d6b404-e704-4242-a16d-eb7542fe1b9e")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(200)
            .body("idCartao", Matchers.is("94d6b404-e704-4242-a16d-eb7542fe1b9e"))
            .body("idCliente", Matchers.is("2f2bee0b-0eb2-4ce4-b753-838f65c31a68"))
            .body("ultimosDigitos", Matchers.is("7788"))
            .body("primeirosDigitos", Matchers.is("112233"));
    }

    @Test
    public void BuscaCartaoCreditoSemCardId (){

        given()
            .pathParam("cardId", "")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(400);
    }
}
