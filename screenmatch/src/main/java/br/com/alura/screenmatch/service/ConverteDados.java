package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    //ObjectsMapper é um objeto da biblioteca do Jackson
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            /* Pega o texto Json e usa o mapper para transforma-lo
            mapper.readValue faz a analise o JSON e preenche os campos do objeto java
            com os valores correspondentes (conversão de dados) */
            return mapper.readValue(json, classe);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
