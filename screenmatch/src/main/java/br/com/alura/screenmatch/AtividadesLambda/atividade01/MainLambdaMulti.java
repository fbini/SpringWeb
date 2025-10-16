package br.com.alura.screenmatch.AtividadesLambda.atividade01;

public class MainLambdaMulti {
    public static void main(String[] args) {
        IMultiplicacao multiplicacao = (a , b) -> a * b;
        System.out.println(multiplicacao.multiplicacao(5,5));

    }
}
