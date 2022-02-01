package br.com.brasilpag.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {

    String APP_BASE_URL = "http://localhost";
    Integer APP_PORT = 7070;
    String APP_BASE_PATH = "";
    ContentType APP_CONTENT_TYPE = ContentType.JSON;
}
