package PTI_Calculo_Dist_2_Pontos;

public class Ponto {

    private int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {}

    public boolean semelhanca(Ponto p) { return (this.x == p.x) == (this.y == p.y);}

    public double distancia(Ponto p) {

        int difx = p.x-this.x;
        int dify = p.y-this.y;

        double result = Math.sqrt(Math.pow(difx,2)+Math.pow(dify,2));
        return result;
    }
}
