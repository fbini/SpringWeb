package br.com.alura.screenmatch.service;

// boas práticas, adicionar um I no nome na class interface
public interface IConverteDados {
    //<T> T -- é um generico, vai receber uma String json, e uma classe que não se sabe ainda,
    // uma classe generica
    <T> T obterDados(String json, Class<T> classe);
}
