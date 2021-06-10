package padroesdecriacao.singleton;

public class CotacaoMoedas {

    private CotacaoMoedas(){};
    private static CotacaoMoedas instance = new CotacaoMoedas();
    public static CotacaoMoedas getInstance() { return instance;}

    private Double cotacaoDolar;
    private Double cotacaoEuro;

    public Double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(Double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public Double getCotacaoEuro() {
        return cotacaoEuro;
    }

    public void setCotacaoEuro(Double cotacaoEuro) {
        this.cotacaoEuro = cotacaoEuro;
    }
}
