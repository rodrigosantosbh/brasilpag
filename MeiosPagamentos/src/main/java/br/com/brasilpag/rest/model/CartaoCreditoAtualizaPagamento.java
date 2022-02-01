package br.com.brasilpag.rest.model;

public class CartaoCreditoAtualizaPagamento {

    private int quantidadeParcelas;
    private String tipoTransacao;
    private String token;

    public CartaoCreditoAtualizaPagamento(int quantidadeParcelas, String tipoTransacao, String token) {
        this.quantidadeParcelas = quantidadeParcelas;
        this.tipoTransacao = tipoTransacao;
        this.token = token;
    }

    public CartaoCreditoAtualizaPagamento(){
    }

    public int getQuantidadeParcelas() { return quantidadeParcelas; }
    public void setQuantidadeParcelas(int quantidadeParcelas) { this.quantidadeParcelas = quantidadeParcelas; }

    public String getTipoTransacao() { return tipoTransacao; }
    public void setTipoTransacao(String tipoTransacao) { this.tipoTransacao = tipoTransacao; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
}
