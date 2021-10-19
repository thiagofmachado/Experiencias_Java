package CorreçãoFração;

public class Fracao {
    private int numerador;
    private int denominador;

    /**
     * construtor da fracao com parametro
     *
     * @param numerador
     * @param denominador
     */
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * construtor da fracao sem parametro
     *
     * @param numerador
     * @param denominador
     */
    public Fracao() {
    }

    //                  f1    f2
    //Soma de fraço: (a/b)+(c/d)=( (a.d+c.b) / b.d ),
    public Fracao soma(Fracao f) {
        // f1 acessado com this
        // f2 acessado com f
        Fracao retorno = new Fracao();

        retorno.numerador = (this.numerador * f.denominador + f.numerador * this.denominador);
        retorno.denominador = (this.denominador * f.denominador);
        return retorno;

    }

    // Soma de fração com inteiro: (a/b)+c=( (a+c.b) / b )
    public Fracao soma(int inteiro) {
        Fracao retorno = new Fracao();
        retorno.numerador = (this.numerador + inteiro * this.denominador);
        retorno.denominador = (this.denominador);
        return retorno;
    }

    //Igualdade: (a/b)== (c/d) se a*d == b*c
    public boolean ehIgual(Fracao f) {
        //             a     *     d        ==        b        *    c
        return this.numerador * f.denominador == this.denominador * f.numerador;
    }

    //polimorfismo dinâmico - cenas do próximo capitulo
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

}
