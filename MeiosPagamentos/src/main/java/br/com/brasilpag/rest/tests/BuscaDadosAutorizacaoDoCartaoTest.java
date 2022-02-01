package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.core.ApiPath;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BuscaDadosAutorizacaoDoCartaoTest extends ApiPath {

    private final String ENDPOINT = Endpoint.BUSCA_DADOS_AUTORIZACAO_CARTAO;

    @Test
    public void BuscaDadosAutorizacaoComSucesso (){

        given()
            .pathParam("cardId", "8c432a66-4e40-40c4-839f-e8eeda16fd98")
            .queryParam("partnerId", "partnerIdTeste")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(200)
            .body("dado", Matchers.is("NuioU+XcMvQuKSXmwhRB2/lOmIRK5mDOGRNcgfNocs8HUaFjl7VdkYJOIh+cwovKWglvlL7rYiWSchlERQzUwbRxm5fDp9otwuZElDrogsebVOLVs4y/FbWai8r5q2uKK8ZhlK2NudDenk8vKlgPrS3xBEQcPzeTOZZcSE1qM8mgrdB1+QXoaEP9Ujtze2i959LwedeBnfYCSWWQ/LS2Ti4lyBfGaBUhPqcse8u0dMwu9qhU27Wj2sZrrqbPurvNkfCHA5JP1Yv0KmrzdEnX3IQQbvcItSeoI10JKotBEi9jqMYy3AMM4UM+wRIUypx8FpRWqGcvUON50Mmlhem/DA=="))
            .body("token", Matchers.is("tokenTeste"))
            .body("idCliente", Matchers.is("cc8d3340-8ddf-44eb-acb0-b4b340b961d4"));
    }

    @Test
    public void BuscaDadosAutorizacaoSemCardId (){

        given()
            .pathParam("cardId", "")
            .queryParam("partnerId", "partnerIdTeste")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(404);
    }

    @Test
    public void BuscaDadosAutorizacaoSemPartinerId (){

        given()
            .pathParam("cardId", "8c432a66-4e40-40c4-839f-e8eeda16fd98")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("partnerId"))
            .body("erros.erro[0]", Matchers.is("O campo partnerId deve ser informado."));
    }
}
