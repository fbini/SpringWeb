package br.com.alura.screenmatch.AtividadesLambda.atividade01;

import br.com.alura.screenmatch.service.ConverteDados;

public class MainLambdaMulti {
    public static void main(String[] args) {
        // 01
//      IMultiplicacao multiplicacao = (a , b) -> a * b;
//      System.out.println(multiplicacao.multiplicacao(5,5));

        //02
//        IPrimo primo = a -> {
//            if (a <= 1) return false;
//            for (int i = 2; i <= Math.sqrt(a); i++) {
//                if (a % i == 0) return false;
//            }
//            return true;
//        };
//        System.out.println(primo.primo(5) + " É primo");
//        System.out.println(primo.primo(12) + " NÃO é primo");

        //03
//        IConverte toUpperCase = String::toUpperCase;
//        System.out.println(toUpperCase.converte("Ingrid"));

        //04
        //
        IPalindromo palindromo = p -> p.equals(new StringBuilder(p).reverse().toString());

        System.out.println(palindromo.verificarPalindromo("ovo"));
        System.out.println(palindromo.verificarPalindromo("java"));




    }
}
