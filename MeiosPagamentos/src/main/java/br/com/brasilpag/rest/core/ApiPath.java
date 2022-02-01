package br.com.brasilpag.rest.core;

public class ApiPath extends BaseTest {

    public static final class Endpoint {

        //GET - Busca parcelas do contrato de produto
        public static final String BUSCA_PARCELA_CONTRATO = "/financeiro/produtos/{codProduto}/contratos/{idContrato}/parcelas";

        //POST - Solicitacao autorizacao Pagamento
        public static final String SOLICITACAO_PAGAMENTO = "/brasil-pag/solicitacao-pagamento";

        //PATCH - Atualiza metodo pagamento
        public static final String ATUALIZA_METODO_PAGAMENTO = "/financeiro/produtos/{codProduto}/contratos/{idContrato}/meios-pagamento";

        //DELETE - Cancela Cobrança Realizada com Cartão Crédito
        public static final String CANCELA_COBRANCA_CARTAO_CREDITO = "/brasil-pag/cobranca/{idPortoPag}";

        //DELETE - Cancela Cobrança Realizada com Cartão Crédito
        public static final String CANCELA_COBRANCA_CARTAO_CREDITO_DOIS = "/brasil-pag/cobranca/produto/{idProduto}/{idExterno}";

        //GET - Busca cartao por ID
        public static final String BUSCA_CARTAO_POR_ID = "/brasil-pag/credit-card/{cardId}";

        //GET - Busca dados de autorização por id do cartão
        public static final String BUSCA_DADOS_AUTORIZACAO_CARTAO = "/brasil-pag/credit-card/{cardId}/auth";

        //GET - Busca lista de cartóes de crédito do cliente
        public static final String BUSCA_LISTA_CARTAO_CREDITO = "/brasil-pag/credit-cards";

        //POST - Registra novo cartao de crédito
        public static final String REGISTRA_CARTAO = "/brasil-pag/credit-card";

        //POST - Registra novo token
        public static final String REGISTRA_NOVO_TOKEN = "/brasil-pag/credit-card/{cardId}/token";

        //POST - Atualiza token
        public static final String ATUALIZA_TOKEN = "/brasil-pag/credit-card/{cardId}/refresh-token";
    }
}
