package br.com.alura.screenmatch.AtividadesLambda;

import java.util.List;

public class MainEstudosLambda {
    public static void main(String[] args) {

        // parâmetro t representa cada temporada individual,
        // (-> operador lambda)define uma função lambda, e é ela que define o que fazer com cada item
        // temporadas.foreach -- ""cria"" uma List<Temporadas> temporadas = ...

        /*
        "Quando eu receber estes parâmetros -> execute este código"
         (parâmetro) -> {código a ser executado}

         ex: nome -> System.out.println("Olá, " + nome);
            nome -- é o parâmetro
            out.println("Olá, " + nome) -- é o código a ser executado
            o -> separa um do outro

            dizendo de modo simples --
            ""Quando eu receber um nome, imprima "Ola, nome"""

         */


        //Quando a lambda tem só uma linha, não precisa de {}.
        //Se precisar de mais de uma linha (como o if), coloca as chaves e escreve o bloco.

        // Utilizando ForEach lambda

        List<String> nomesMeus = List.of("Ingrid", "Willian", "Leona");

        nomesMeus.forEach(nome -> System.out.println("oi, " + nome));

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        numeros.forEach(numero -> System.out.println(numero * numero));


        List<String> nomes = List.of("Ana", "Bruno", "Carla");
        nomes.forEach(nome -> {
            if (nome.startsWith("B")) {
                System.out.println(nome);
            }
        });

        List<Integer> numerosPar = List.of(10, 15, 20, 25, 30);
        numerosPar.forEach(numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        });

        List<String> palavras = List.of("casa", "cor", "bicicleta", "estante");

        palavras.forEach(palavra -> {
            if (palavra.length() > 4 ) {
                System.out.println(palavra);
            }
        });

        // Map / Filter





    }
}
