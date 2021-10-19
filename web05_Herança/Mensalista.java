package web05_Herança;

public class Mensalista extends Colaborador {

    private double salarioMensal;

    public Mensalista(String nome, String departamento, double salarioMensal) {
        super(nome, departamento);
        this.salarioMensal = salarioMensal;
    }

    public double salario() {
        return this.salarioMensal;
    }

    @Override
    public String toString() {
        return String.format("%s\nSalário Mensal: R$ %.2f", super.toString(), this.salario());
    }
}
