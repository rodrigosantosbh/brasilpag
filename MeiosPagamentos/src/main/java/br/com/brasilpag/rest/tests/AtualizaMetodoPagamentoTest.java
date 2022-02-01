package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.builders.AtualizaMetodoPagamentoBuilder;
import br.com.brasilpag.rest.builders.ConsultaParcelasContratoBuilder;
import br.com.brasilpag.rest.core.ApiPath;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class AtualizaMetodoPagamentoTest extends ApiPath {

    private final String ENDPOINT = Endpoint.ATUALIZA_METODO_PAGAMENTO;

    private final AtualizaMetodoPagamentoBuilder builder = new AtualizaMetodoPagamentoBuilder();
    private final ConsultaParcelasContratoBuilder consulta = new ConsultaParcelasContratoBuilder();


    @Test
    public void AtualizaPagamentoComSucesso (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
            .body(builder.gerarAtualizacaoPagamentoComSucesso())
        .when()
            .patch(ENDPOINT)
        .then()
            .statusCode(200)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("atualizaMetodoPagamento.json"));
    }

    @Test
    public void AtualizaPagamentoComRejeicao (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
            .body(builder.gerarAtualizacaoPagamentoComRejeicao())
        .when()
            .patch(ENDPOINT)
        .then()
            .statusCode(200)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("atualizaMetodoPagamento.json"));
    }

    @Test
    public void AtualizaPagamentoComIdExternoInexistente (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
            .body(builder.gerarAtualizacaoPagamentoComIdExternoInexistente())
        .when()
            .patch(ENDPOINT)
        .then()
            .statusCode(200)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("atualizaMetodoPagamento.json"));
    }

    @Test
    public void AtualizaPagamentoSemParcelas (){

        given()
            .pathParam("codProduto", consulta.consultaParcelaPayload().getCodProduto())
            .pathParam("idContrato", consulta.consultaParcelaPayload().getIdContrato())
            .queryParams("numeroDocumentoCliente", consulta.consultaParcelaPayload().getNumeroDocumentoCliente(), "tipoDocumentoCliente", consulta.consultaParcelaPayload().getTipoDocumentoCliente(), "origem", consulta.consultaParcelaPayload().getOrigem())
            .body(builder.gerarAtualizacaoPagamentoSemParcelas())
        .when()
            .patch(ENDPOINT)
        .then()
            .statusCode(200)
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("atualizaMetodoPagamento.json"));
    }
}
