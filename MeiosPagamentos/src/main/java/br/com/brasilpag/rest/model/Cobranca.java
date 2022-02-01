package br.com.brasilpag.rest.model;

public class Cobranca {

    private CartaoCredito cartaoCredito;
    private String meioPagamento;
    private Double valor;

    public Cobranca(CartaoCredito cartaoCredito, String meioPagamento, Double valor){
        this.cartaoCredito = cartaoCredito;
        this.meioPagamento = meioPagamento;
        this.valor = valor;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }
    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }
    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
