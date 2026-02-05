import java.util.ArrayList;
import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);
        ArrayList<String> diasDaSemana = new ArrayList<>();

        diasDaSemana.add("SEGUNDA");
        diasDaSemana.add("TERÇA");
        diasDaSemana.add("QUARTA");
        diasDaSemana.add("QUINTA");
        diasDaSemana.add("SEXTA");

        System.out.println("Verificar o dia útil");

        System.out.println("\nDigite um dia da semana: ");
        String diaInformado = input.nextLine();

        if(diasDaSemana.contains(diaInformado.toUpperCase())){
            System.out.println("O dia " + diaInformado + " é um dia útil");
        }else{
            System.out.println("O dia " + diaInformado + " NÃO é um dia útil");
        }

        input.close();
    }
}