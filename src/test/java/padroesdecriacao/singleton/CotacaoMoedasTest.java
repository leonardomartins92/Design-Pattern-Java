package padroesdecriacao.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Singleton")
class CotacaoMoedasTest {

    @Test
    @DisplayName("Retorna cotacao do dolar com sucesso")
    public void deveRetornarACotacaoDoDolar(){

        CotacaoMoedas.getInstance().setCotacaoDolar(6.21);
        assertEquals(6.21, CotacaoMoedas.getInstance().getCotacaoDolar());

    }

    @Test
    @DisplayName("Retorna cotacao do euro com sucesso")
    public void deveRetornarACotacaoDoEuro(){

        CotacaoMoedas.getInstance().setCotacaoEuro(7.45);
        assertEquals(7.45, CotacaoMoedas.getInstance().getCotacaoEuro());

    }

}
