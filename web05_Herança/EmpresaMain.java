package web05_Herança;

import java.util.List;

public class EmpresaMain {

    public static void main(String[] args) {

        //System.out.println("---------- Colaborador ----------");
        //Colaborador colaborador = new Colaborador("Cristian", "Infraestrutura");
        //System.out.println(colaborador);

        System.out.println("\n---------- Horista ----------");
        Horista horista = new Horista("Avery", "Desenvolvimento", 75.5);
        horista.setHorasTrabalhadas(220);
        System.out.println(horista);

        System.out.println("\n---------- Mensalista ----------");
        Mensalista mensalista = new Mensalista("Thiago", "Compras", 8500.);
        System.out.println(mensalista);

        System.out.println("\n---------- Comissionado ----------");
        Comissionado comissionado = new Comissionado("Jane", "Casa", 25);
        comissionado.setTotalVendas(35000);
        System.out.println(comissionado);

        System.out.println("\n---------- Base Comissionado ----------");
        BaseComissionado baseComissionado = new BaseComissionado("Julio", "Criação", 5, 3000);
        baseComissionado.setTotalVendas(350000);
        System.out.println(baseComissionado);

        List<Colaborador> colaboradores = List.of(horista,mensalista,comissionado,baseComissionado);

        FolhaDePagamento folha = new FolhaDePagamento(colaboradores);
        folha.geraRelatorio();



    }

}
