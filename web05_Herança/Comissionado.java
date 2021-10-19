package web05_Herança;

public class Comissionado extends Colaborador {

    private double totalVendas;
    private int comissao;

    public Comissionado(String nome, String departamento, int comissao) {
        super(nome, departamento);
        this.comissao = comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public int getComissao() {
        return comissao;
    }

    public double salario() {
        return this.totalVendas * (this.comissao / 100.);
    }

    @Override
    public String toString() {
        return String.format("%s\nTotal de Vendas: R$ %.2f\n" + "Comissão: %d%%\nSalário Mensal: R$ %.2f", super.toString(),
                this.getTotalVendas(), this.getComissao(), this.salario());
    }
}
