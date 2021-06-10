package padroesdecriacao.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Builder")
class InvestidorBuilderTest {

    @Test
    @DisplayName("Lança exceção para Investidor sem CPF")
    public void lancaExcessaoParaInvestidorSemCPF(){

        InvestidorBuilder investidorBuilder = new InvestidorBuilder();

        assertThrows(IllegalArgumentException.class, ()-> {
            investidorBuilder.setNome("Maria")
                    .setCidade("Juiz de Fora")
                    .setValorInvestido(200.9)
                    .build();
        });
    }

    @Test
    @DisplayName("Lança exceção para Investidor sem Nome")
    public void lancaExcessaoParaInvestidorSemCPFNome(){
        InvestidorBuilder investidorBuilder = new InvestidorBuilder();

        assertThrows(IllegalArgumentException.class, ()-> {
            investidorBuilder.setCpf("123")
                    .setCidade("Juiz de Fora")
                    .setValorInvestido(200.9)
                    .build();
        });
    }

    @Test
    @DisplayName("Cria Investidor com Sucesso")
    public void criaInvestidorComSucesso(){
        InvestidorBuilder investidorBuilder = new InvestidorBuilder();
        Investidor investidor = investidorBuilder.setNome("João")
                .setCpf("123")
                .build();

        assertNotNull(investidor);
        assertEquals("123", investidor.getCpf());
    }

}
