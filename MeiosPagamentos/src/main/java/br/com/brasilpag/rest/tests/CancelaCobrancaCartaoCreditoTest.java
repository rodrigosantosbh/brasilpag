package br.com.brasilpag.rest.tests;

import br.com.brasilpag.rest.core.ApiPath;
import br.com.brasilpag.rest.builders.CancelaCobrancaCartaoCreditoBuilder;
import br.com.brasilpag.rest.builders.ParametrosCancelaCobrancaCartaoCreditoBuilder;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CancelaCobrancaCartaoCreditoTest extends ApiPath {

    private final String ENDPOINT = Endpoint.CANCELA_COBRANCA_CARTAO_CREDITO;
    private final String ENDPOINT2 = Endpoint.CANCELA_COBRANCA_CARTAO_CREDITO_DOIS;

    private final CancelaCobrancaCartaoCreditoBuilder cancelar = new CancelaCobrancaCartaoCreditoBuilder();
    private final ParametrosCancelaCobrancaCartaoCreditoBuilder parametros = new ParametrosCancelaCobrancaCartaoCreditoBuilder();

    @Test
    public void CancelaCobrancaCartaoCreditoComSucesso (){

        given()
            .pathParam("idPortoPag", parametros.parametrosCancelaCobranca().getIdPortoPag())
            .body(cancelar.cancelaCobrancaSucesso())
        .when()
            .delete(ENDPOINT)
        .then()
            .statusCode(200)
            .body("id", Matchers.is("idOrder"))
            .body("estado", Matchers.is("FINALIZADA"))
            .body("cobrancas.id[0]", Matchers.is("idCharge"))
            .body("cobrancas.estado[0]", Matchers.is("PAGA"))
            .body("cobrancas.meioPagamento[0]", Matchers.is("CARTAO_CREDITO"))
            //.body("cobrancas.valor[0]", Matchers.is(1.0))
            .body("cobrancas.transacoes[0].id[0]", Matchers.is("idTransaction"))
            .body("cobrancas.transacoes[0].adquirente[0]", Matchers.is("CIELO"))
            .body("cobrancas.transacoes[0].tid[0]", Matchers.is("TID"))
            .body("cobrancas.transacoes[0].nsu[0]", Matchers.is("NSU"))
            .body("cobrancas.transacoes[0].cartao[0].primeirosSeisDigitos", Matchers.is(123456))
            .body("cobrancas.transacoes[0].cartao[0].ultimosQuatroDigitos", Matchers.is(1234))
            .body("cobrancas.transacoes[0].cartao[0].bandeira", Matchers.is("MASTERCARD"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoComErro (){

        given()
             .pathParam("idPortoPag", parametros.parametrosCancelaCobranca().getIdPortoPag())
             .body(cancelar.cancelaCobrancaErro())
        .when()
            .delete(ENDPOINT)
        .then()
            .statusCode(422)
            .body("codigo", Matchers.is("24"))
            .body("mensagem", Matchers.is("Request Malvado!!"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoSemMotivo (){

        given()
            .pathParam("idPortoPag", parametros.parametrosCancelaCobranca().getIdPortoPag())
            .body(cancelar.cancelaCobrancaSemMotivo())
        .when()
            .delete(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("motivo"))
            .body("erros.erro[0]", Matchers.is("não deve estar em branco"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoSemMotivoValor (){

        given()
            .pathParam("idPortoPag", parametros.parametrosCancelaCobranca().getIdPortoPag())
            .body(cancelar.cancelaCobrancaSemMotivoValor())
        .when()
            .delete(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("valor"))
            .body("erros.erro[0]", Matchers.is("deve ser maior que 0"))
            .body("erros.campo[1]", Matchers.is("motivo"))
            .body("erros.erro[1]", Matchers.is("não deve estar em branco"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoComValorMenorQueUm (){

        given()
            .pathParam("idPortoPag", parametros.parametrosCancelaCobranca().getIdPortoPag())
            .body(cancelar.cancelaCobrancaComValorMenorQueUm())
        .when()
            .delete(ENDPOINT)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("valor"))
            .body("erros.erro[0]", Matchers.is("deve ser maior que 0"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoSemIdPortoPag (){

        given()
            .pathParam("idPortoPag", "")
            .body(cancelar.cancelaCobrancaSucesso())
        .when()
            .delete(ENDPOINT)
        .then()
            .statusCode(404)
            .body("status", Matchers.is(404))
            .body("error", Matchers.is("Not Found"))
            .body("path", Matchers.is("/porto-pag/cobranca/"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoComSucesso2 (){

        given()
            .pathParam("idProduto", parametros.parametrosCancelaCobranca().getIdProduto())
            .pathParam("idExterno", parametros.parametrosCancelaCobranca().getIdExterno())
            .body(cancelar.cancelaCobrancaSucesso())
        .when()
            .delete(ENDPOINT2)
        .then()
            .statusCode(200)
            .body("id", Matchers.is("idOrder"))
            .body("estado", Matchers.is("FINALIZADA"))
            .body("cobrancas.id[0]", Matchers.is("idCharge"))
            .body("cobrancas.estado[0]", Matchers.is("PAGA"))
            .body("cobrancas.meioPagamento[0]", Matchers.is("CARTAO_CREDITO"))
            //.body("cobrancas.valor[0]", Matchers.is(1.0))
            .body("cobrancas.transacoes[0].id[0]", Matchers.is("idTransaction"))
            .body("cobrancas.transacoes[0].adquirente[0]", Matchers.is("CIELO"))
            .body("cobrancas.transacoes[0].tid[0]", Matchers.is("TID"))
            .body("cobrancas.transacoes[0].nsu[0]", Matchers.is("NSU"))
            .body("cobrancas.transacoes.cartao[0].primeirosSeisDigitos[0]", Matchers.is(123456))
            .body("cobrancas.transacoes.cartao[0].ultimosQuatroDigitos[0]", Matchers.is(1234))
            .body("cobrancas.transacoes.cartao[0].bandeira[0]", Matchers.is("MASTERCARD"))
            .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("cancelaCobrancaCartaoCredito.json"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoComErro2 (){

        given()
            .pathParam("idProduto", parametros.parametrosCancelaCobranca().getIdProduto())
            .pathParam("idExterno", parametros.parametrosCancelaCobranca().getIdExterno())
            .body(cancelar.cancelaCobrancaErro())
        .when()
            .delete(ENDPOINT2)
        .then()
            .statusCode(422)
            .body("codigo", Matchers.is("24"))
            .body("mensagem", Matchers.is("Request Malvado!!"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoSemMotivo2 (){

        given()
            .pathParam("idProduto", parametros.parametrosCancelaCobranca().getIdProduto())
            .pathParam("idExterno", parametros.parametrosCancelaCobranca().getIdExterno())
            .body(cancelar.cancelaCobrancaSemMotivo())
        .when()
            .delete(ENDPOINT2)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("motivo"))
            .body("erros.erro[0]", Matchers.is("não deve estar em branco"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoSemMotivoValor2 (){

        given()
            .pathParam("idProduto", parametros.parametrosCancelaCobranca().getIdProduto())
            .pathParam("idExterno", parametros.parametrosCancelaCobranca().getIdExterno())
            .body(cancelar.cancelaCobrancaSemMotivoValor())
        .when()
            .delete(ENDPOINT2)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("valor"))
            .body("erros.erro[0]", Matchers.is("deve ser maior que 0"))
            .body("erros.campo[1]", Matchers.is("motivo"))
            .body("erros.erro[1]", Matchers.is("não deve estar em branco"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoComValorMenorQueUm2 (){

        given()
            .pathParam("idProduto", parametros.parametrosCancelaCobranca().getIdProduto())
            .pathParam("idExterno", parametros.parametrosCancelaCobranca().getIdExterno())
            .body(cancelar.cancelaCobrancaComValorMenorQueUm())
        .when()
            .delete(ENDPOINT2)
        .then()
            .statusCode(400)
            .body("mensagem", Matchers.is("Revise sua requisição"))
            .body("erros.campo[0]", Matchers.is("valor"))
            .body("erros.erro[0]", Matchers.is("deve ser maior que 0"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoSemIdPortoPag2 (){

        given()
             .pathParam("idProduto", "")
             .pathParam("idExterno", parametros.parametrosCancelaCobranca().getIdExterno())
            .body(cancelar.cancelaCobrancaSucesso())
        .when()
            .delete(ENDPOINT2)
        .then()
            .body("status", Matchers.is(404))
            .body("error", Matchers.is("Not Found"))
            .body("path", Matchers.is("/porto-pag/cobranca/produto//String"));
    }

    @Test
    public void CancelaCobrancaCartaoCreditoSemIdExterno2 (){

        given()
            .pathParam("idProduto", parametros.parametrosCancelaCobranca().getIdProduto())
            .pathParam("idExterno", "")
            .body(cancelar.cancelaCobrancaSucesso())
        .when()
            .delete(ENDPOINT2)
        .then()
            .body("status", Matchers.is(404))
            .body("error", Matchers.is("Not Found"))
            .body("path", Matchers.is("/porto-pag/cobranca/produto/String/"));
    }
}
