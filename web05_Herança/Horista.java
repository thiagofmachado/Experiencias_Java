package web05_Herança;

import java.util.Objects;

public class Horista extends Colaborador{
    private int horasTrabalhadas;
    private double valorPorHora;

    public Horista(String nome, String departamento, double valorPorHora) {
        super(nome, departamento);
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double salario(){
        return this.horasTrabalhadas*this.valorPorHora;
    }

    @Override
    public String toString(){
        return String.format("%s\nHoras Trabalhadas: %d\n" + "Valor por hora: R$ %.2f\nSalário: R$ %.2f", super.toString(),
                this.horasTrabalhadas, this.valorPorHora, this.salario());

    }


}
