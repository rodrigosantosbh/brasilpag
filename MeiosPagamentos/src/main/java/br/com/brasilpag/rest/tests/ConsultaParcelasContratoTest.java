package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.core.ApiPath;
import br.com.brasilpag.rest.builders.ConsultaParcelasContratoBuilder;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ConsultaParcelasContratoTest extends ApiPath {

    private final String ENDPOINT = Endpoint.BUSCA_PARCELA_CONTRATO;
    private final ConsultaParcelasContratoBuilder consulta = new ConsultaParcelasContratoBuilder();

    @Test
    public void BuscaParcelasDoContratoComSucesso (){

        Response response = given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
        .when()
            .get(ENDPOINT)
        .then()
            .extract().response();

        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("1", response.jsonPath().getString("parcela[0]"));
        Assertions.assertEquals("1970-01-01T00:00:03", response.jsonPath().getString("vencimento[0]"));
        Assertions.assertNull(null, response.jsonPath().getString("valorTotal[0]"));
        Assertions.assertEquals("STATE", response.jsonPath().getString("estado[0]"));
        Assertions.assertEquals("200.0", response.jsonPath().getString("formasPagamento[0].valor[0]"));
        Assertions.assertEquals("001", response.jsonPath().getString("formasPagamento[0].codigo[0]"));
        Assertions.assertEquals("[OPERATION_1, OPERATION_2]", response.jsonPath().getString("operacoesPermitidas[0]"));
    }

    @Test
    public void BuscaParcelasDoContratoSemCamposObrigatorios () {

        given()
            .pathParam("codProduto", "")
            .pathParam("idContrato", "")
            .queryParams("numeroDocumentoCliente", "", "tipoDocumentoCliente", "", "origem", "")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(404)
            .body("error", is("Not Found"));
    }

    @Test
    public void BuscaParcelasDoContratoSemTipoDocumentoCliente (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", "", "origem", consulta.consultaParcelaPayload().getOrigem())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", is("Revise sua requisição"))
            .body("erros[0]", is("must not be blank"));
    }

    @Test
    public void BuscaParcelasDoContratoSemNumeroDocumentoCliente (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", "", "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", is("Revise sua requisição"))
            .body("erros[0]", is("must not be blank"));
    }

    @Test
    public void BuscaParcelasDoContratoSemOrigeem (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", "")
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", is("Revise sua requisição"))
            .body("erros[0]", is("must not be blank"));
    }

    @Test
    public void BuscaParcelasDoContratoSemCodProduto (){

        given()
            .pathParam("codProduto", "")
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
             .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(404)
            .body("error", is("Not Found"));
    }

    @Test
    public void BuscaParcelasDoContratoSemIdContrato (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", "")
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(404)
            .body("error", is("Not Found"));
    }

    @Test
    public void BuscaParcelasDoContratoComCodProdutoInexistente (){

        given()
            .pathParam("codProduto", "Inexistente")
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(422)
            .body("codigo", is(0))
            .body("mensagem", is("Problems while processing the event"));
    }

    @Test
    public void BuscaParcelasDoContratoComIdProdutoInexistente (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", "Inexistente")
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
        .when()
            .get(ENDPOINT)
        .then()
            .statusCode(422)
            .body("codigo", is(0))
            .body("mensagem", is("Problems while processing the event"));
    }
}

