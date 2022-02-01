package br.com.brasilpag.rest.model;

public class CartaoCredito {

    private int parcela;
    private String tipoTransacao;
    private String token;

    public CartaoCredito(int parcela, String tipoTransacao, String token){
        this.parcela = parcela;
        this.tipoTransacao = tipoTransacao;
        this.token = token;
    }

    public CartaoCredito() {

    }

    public int getParcela() {
        return parcela;
    }
    public void setParcela(int parcela) { this.parcela = parcela;}

    public String getTipoTransacao() {
        return tipoTransacao;
    }
    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}
