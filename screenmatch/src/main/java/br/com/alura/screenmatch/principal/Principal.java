package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    //variaveis constantes = uma const - não muda nunca
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=9025175";

    //"https://www.omdbapi.com/?t=gilmore+girls&apikey=9025175"

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = teclado.nextLine();
        var json = consumo.obterDados(
                // replace (" ", "+") ele troca o " " para +
                ENDERECO + nomeSerie.replace(" ","+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i <= dados.totalTemporadas(); i++){
			json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ","+") + "&season=" + i + API_KEY);
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);
        //Equivale a temporadas.forEach(t -> System.out.println(t))

        // expressoes em lambda e a API de Streams/Collections java 8+
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
        //Episodio((parametro) -> expressao)




    }
}
