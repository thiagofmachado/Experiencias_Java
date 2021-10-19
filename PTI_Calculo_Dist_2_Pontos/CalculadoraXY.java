package PTI_Calculo_Dist_2_Pontos;

public class CalculadoraXY {

    public static void main(String[] args) {

        Ponto p1 = new Ponto(1,1);
        Ponto p2 = new Ponto(1,1);

        if(p1.semelhanca(p2)){
            System.out.println("Pontos Iguais");
        }else{
            System.out.println("Pontos Diferentes");
        }

        double p3 = p1.distancia(p2);

        System.out.println("A diferença entre os dois ponto é: " + p3);

    }
}
