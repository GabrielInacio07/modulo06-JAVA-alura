import java.util.ArrayList;
import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);

        System.out.println("Compatibilidade para DOAR sangue");

        System.out.println("\nDigite sua idade: ");
        int idade = Integer.parseInt(input.nextLine());

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.println("\nIdade: " + idade);
        System.out.println("Peso: " + peso);
        if(idade > 17 && idade < 66 && peso > 50){
            System.out.println("Doador compatível");
        }else{
            System.out.println("Doador NÃO é compatível");
            System.out.println("MOTIVO: Idade ou Peso não está entre a faixa de compatibilidade ");
        }

        input.close();
    }
}