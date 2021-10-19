package CorreçãoFração;

public class testaFracao {

    // aplica��o cliente (principal)
    public static void main(String[] args) {
        // f1 eh uma variavel de referencia para um objeto da classe Fracao
        Fracao f1, f2, f3;
        // cria um objeto fracao - dois construtores - sobrecarregados
        f1 = new Fracao(1,2);
        f2 = new Fracao(3,4);


        if (f1.equals(f2))
            System.out.println("iguais!");
        else
            System.out.println("diferentes");


        System.out.println("fracao 1:" + f1);
        System.out.println("fracao 2:" + f2);
        f3 = f1.soma(2);

        System.out.println("fracao soma:" + f3);


    }


}
