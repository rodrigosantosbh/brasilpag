package br.com.brasilpag.rest.model;

public class CobrancaAtualizaPagamento {

    private CartaoCreditoAtualizaPagamento cartaoCredito;
    private String meioPagamento;
    private Double valor;

    public CobrancaAtualizaPagamento(CartaoCreditoAtualizaPagamento cartaoCredito, String meioPagamento, Double valor) {
        this.cartaoCredito = cartaoCredito;
        this.meioPagamento = meioPagamento;
        this.valor = valor;
    }

    public CartaoCreditoAtualizaPagamento getCartaoCredito() { return cartaoCredito; }
    public void setCartaoCredito(CartaoCreditoAtualizaPagamento cartaoCredito) { this.cartaoCredito = cartaoCredito; }

    public String getMeioPagamento() { return meioPagamento; }
    public void setMeioPagamento(String meioPagamento) { this.meioPagamento = meioPagamento; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
}
