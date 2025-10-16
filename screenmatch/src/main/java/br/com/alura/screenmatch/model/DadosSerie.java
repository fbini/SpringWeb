package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//alias - é como um apelido, serve para procurar pelo nome "Title" que está na api, mas o nome
// vai pelo o que está na váriavel que definimos

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao){
                         //property - serve para procurar e escrever o nome ex- imdbVotes e procura imdVotes
                         // @JsonProperty("imdbVotes") String votos) {

}


