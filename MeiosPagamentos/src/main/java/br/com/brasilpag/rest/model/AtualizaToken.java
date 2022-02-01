package br.com.brasilpag.rest.model;

public class AtualizaToken {

    private String expiredTokenId;
    private String partnerId;
    private String token;

    public AtualizaToken(String expiredTokenId, String partnerId, String token) {
        this.expiredTokenId = expiredTokenId;
        this.partnerId = partnerId;
        this.token = token;
    }

    public String getExpiredTokenId() { return expiredTokenId; }
    public void setExpiredTokenId(String expiredTokenId) { this.expiredTokenId = expiredTokenId; }

    public String getPartnerId() { return partnerId; }
    public void setPartnerId(String partnerId) { this.partnerId = partnerId; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
}
