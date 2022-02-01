package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.builders.BuscaListaCartaoCreditoBuilder;
import br.com.brasilpag.rest.core.ApiPath;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BuscaListaCartaoCreditoTest extends ApiPath {

    private final String ENDPOINT = Endpoint.BUSCA_LISTA_CARTAO_CREDITO;
    private final BuscaListaCartaoCreditoBuilder busca = new BuscaListaCartaoCreditoBuilder();

    @Test
    public void BuscaListaDeCartaoComSucesso (){

        given()
            .body(busca.buscaListaCartaoComSucesso())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(200)
            .body("idCartao", Matchers.is("8c432a66-4e40-40c4-839f-e8eeda16fd98"))
            .body("idCliente", Matchers.is("cc8d3340-8ddf-44eb-acb0-b4b340b961d4"))
            .body("ultimosDigitos", Matchers.is("7788"))
            .body("primeirosDigitos", Matchers.is("112233"))
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("buscaListaCartaoCredito.json"));;
    }

    @Test
    public void BuscaListaDeCartaoSemCPF (){

        given()
            .body(busca.buscaListaCartaoSemCpf())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(404)
            .body("mensagem", Matchers.is("Customer not found"));
    }

    @Test
    public void BuscaListaDeCartaoSemParametros (){

        given()
            .body("")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise o corpo da sua requisição"));
    }
}
