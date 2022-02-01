package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.CartaoCredito;

public class CartaoCreditoBuilder {

    private CartaoCredito cartaoCredito;

    public CartaoCredito gerarCartaoCredito(){

        cartaoCredito = new CartaoCredito(5, "CAPTURA", "eyJhbGciOiJSUzUxMiJ9.eyJyZXNwb25zZSI6eyJjdXN0b21lcklkIjoiZWVkOWU5NWEtODY0NC00NmU0LThhY2UtZTZmYzhiYTIxYmUxIiwiY2FyZElkIjoiMzdlMWQ2NjAtNDM5MC00YzE5LWJiYmQtNTUxMTRjODA0YzBkIiwibGFzdEZvdXJEaWdpdHMiOiIxMTExIiwicGFydG5lcnNJbmZvcm1hdGlvbnMiOlt7InBhcnRuZXJOYW1lIjoiTUFYSVBBR08iLCJjdXN0b21lcklkIjoiMzE1NjA0MyIsImNhcmRJZCI6ImdxODBnclFma0tjPSJ9XX0sImlzcyI6InBvcnRvLXBhZ2ciLCJpYXQiOjE2MjkzOTUzNTh9.hD_koifDpDIa5GB-l9I2WJJvPYwIjquRu3nSDDLRrFcVfyDCLFmQw4kTCiWese4IH0o-VbDsSsHpI174TeQDl5_vqY4YevBlDO3sAJvkSZpQZFVV9sD9Q-jlliVpSkxFI4DMrYlNR5doyR134Q3ilNhO5pkOKTlwvq6N1jXOlXc");

        return cartaoCredito;
    }
}
