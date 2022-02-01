package br.com.brasilpag.rest.model;

public class ClienteCartaoCredito {

    private String id;
    private String primeiroNome;
    private String ultimoNome;
    private DocumentoCliente documento;

    public ClienteCartaoCredito(String id, String primeiroNome, String ultimoNome, DocumentoCliente documento) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.documento = documento;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPrimeiroNome() { return primeiroNome; }
    public void setPrimeiroNome(String primeiroNome) { this.primeiroNome = primeiroNome; }

    public String getUltimoNome() { return ultimoNome; }
    public void setUltimoNome(String ultimoNome) { this.ultimoNome = ultimoNome; }

    public DocumentoCliente getDocumento() { return documento; }
    public void setDocumento(DocumentoCliente documento) { this.documento = documento; }
}
