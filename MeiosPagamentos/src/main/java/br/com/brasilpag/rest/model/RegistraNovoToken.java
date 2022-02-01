package br.com.brasilpag.rest.model;

public class RegistraNovoToken {

    private String partnerId;
    private String token;

    public RegistraNovoToken(String partnerId, String token) {
        this.partnerId = partnerId;
        this.token = token;
    }

    public String getPartnerId() { return partnerId; }
    public void setPartnerId(String partnerId) { this.partnerId = partnerId; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
}
