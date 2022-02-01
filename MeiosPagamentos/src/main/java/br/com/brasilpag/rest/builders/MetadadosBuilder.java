package br.com.brasilpag.rest.builders;

import br.com.brasilpag.rest.model.Metadados;

public class MetadadosBuilder {

    private Metadados metadados;

    public Metadados geraMetadados(){

        metadados = new Metadados("Metados 01");

        return metadados;
    }
}
