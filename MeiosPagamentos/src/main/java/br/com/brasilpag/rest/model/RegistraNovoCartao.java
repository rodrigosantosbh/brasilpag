package br.com.brasilpag.rest.model;

public class RegistraNovoCartao {

    private ClienteCartaoCredito cliente;
    private String nomeCartao;
    private String numero;
    private boolean preferencial;
    private VencimentoCartaoCredito vencimento;

    public RegistraNovoCartao(ClienteCartaoCredito cliente, String nomeCartao, String numero, boolean preferencial, VencimentoCartaoCredito vencimento) {
        this.cliente = cliente;
        this.nomeCartao = nomeCartao;
        this.numero = numero;
        this.preferencial = preferencial;
        this.vencimento = vencimento;
    }

    public RegistraNovoCartao(){
    }

    public ClienteCartaoCredito getCliente() { return cliente; }
    public void setCliente(ClienteCartaoCredito cliente) { this.cliente = cliente; }

    public String getNomeCartao() { return nomeCartao; }
    public void setNomeCartao(String nomeCartao) { this.nomeCartao = nomeCartao; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public boolean isPreferencial() { return preferencial; }
    public void setPreferencial(boolean preferencial) { this.preferencial = preferencial; }

    public VencimentoCartaoCredito getVencimento() { return vencimento; }
    public void setVencimento(VencimentoCartaoCredito vencimento) { this.vencimento = vencimento; }
}
