package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.builders.SolicitacaoPagamentoBuilder;
import br.com.brasilpag.rest.core.ApiPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class SolicitacaoPagamentoTest extends ApiPath {

    private static final String ENDPOINT = Endpoint.SOLICITACAO_PAGAMENTO;
    private final SolicitacaoPagamentoBuilder builder = new SolicitacaoPagamentoBuilder();

    @Test
    public void SolicitaPagamentoComSucesso (){

        Response response = given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .extract().response();

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void SolicitaPagamentoComIdDeCobrancaJaRealizada () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("codigo", is("S0001"))
            .body("mensagem", is("Charge Already registered"));
    }

    @Test
    public void SolicitaPagamentoComTokenInvalido () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("error", is("Token JWT inválido"));
    }

    @Test
    public void SolicitaPagamentoSemParcela () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoSemTipoTransacao () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoSemToken () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoSemMeioPagamento () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoSemValor () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoSemIdExterno () {

        given()
            .body(builder.gerarSolicitacaoPagamentoComIdExternoVazio())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoComCodProdutoVazio () {

        given()
            .body(builder.gerarSolicitacaoPagamentoComCodProdutoVazio())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoComTipoTransacaoInvalido () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }

    @Test
    public void SolicitaPagamentoComMeioPagamentoInvalido () {

        given()
            .body(builder.gerarSolicitacaoPagamento())
        .when()
            .post(ENDPOINT)
        .then()
            .statusCode(422)
            .body("", is(""));
    }
}


