package br.com.brasilpag.rest.suite;

import br.com.brasilpag.rest.tests.*;
import br.com.brasilpag.rest.core.BaseTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(org.junit.runners.Suite.class)

@SuiteClasses({

        ConsultaParcelasContratoTest.class,
        SolicitacaoPagamentoTest.class,
        AtualizaMetodoPagamentoTest.class,
        CancelaCobrancaCartaoCreditoTest.class,
        BuscaCartaoCreditoTest.class,
        BuscaDadosAutorizacaoDoCartaoTest.class,
        BuscaListaCartaoCreditoTest.class,
        RegistraNovoTokenTest.class,
        AtualizaTokenTest.class
})

    public class Suite extends BaseTest {
}
