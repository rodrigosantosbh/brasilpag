package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.core.ApiPath;
import br.com.brasilpag.rest.builders.RegistraNovoCartaoBuilder;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RegistraNovoCartaoCreditoTest extends ApiPath {

    private final String ENDPOINT = Endpoint.REGISTRA_CARTAO;
    private final RegistraNovoCartaoBuilder registra = new RegistraNovoCartaoBuilder();

    @Test
    public void RegistraNovoCartaoCreditoComSucesso (){

        given()
            .body(registra.registraNovoCartaoCreditoComSucesso())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(200);
    }
}
