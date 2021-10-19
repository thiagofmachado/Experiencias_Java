package web05_Herança;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FolhaDePagamento {

    private List<Colaborador> colaboradres;
    private LocalDate hoje;

    public FolhaDePagamento(List<Colaborador> colaboradres) {
        this.colaboradres = colaboradres;
        this.hoje = LocalDate.now();
    }

    public void geraRelatorio(){
        System.out.println("|" + "-".repeat(58) + "|");
        printTitulo();
        System.out.println("|" + "-".repeat(58) + "|");
        printColaboradores();
        System.out.println("|" + "-".repeat(58) + "|");
        printTotalFolha();
        System.out.println("|" + "-".repeat(58) + "|");

    }

    private void printTitulo(){
        String titulo = String.format("Folha de pagamento - Mês: %s Ano: %d",
                hoje.getMonth().getDisplayName(TextStyle.FULL,new Locale("pt")),
                hoje.getYear());
        System.out.printf("| %-57s|\n", titulo);
    }

    private void printColaboradores(){
        System.out.printf("| %-39s| %-15s |\n", "Nome", "Salário");
        System.out.println("|" + "-".repeat(58) + "|");
        colaboradres.forEach(colaborador -> System.out.printf("| %-39s| %-15s | \n", colaborador.getNome(),
                String.format("R$ %.2f",colaborador.salario())));
    }

    private void printTotalFolha(){
        double total = colaboradres
                .stream()
                .mapToDouble(Colaborador::salario)
                .sum();
        System.out.printf("| %-39s| %-15s |\n", "Total de Pagamento", String.format("R$ %.2f", total));
    }

    private String repeteCaracter(char c, int tamanho){
        char[] caracteres = new char[tamanho];
        Arrays.fill(caracteres,c);
        return new String(caracteres);
    }


}
