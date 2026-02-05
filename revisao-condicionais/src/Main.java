import java.util.ArrayList;
import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);

        System.out.println("Verificando número em Intervalo de valor");

        System.out.println("\nDigite o valor para Empréstimo");
        double valor = Double.parseDouble(input.nextLine());

        if(valor >= 1000 && valor <= 5000){
            System.out.println("Valor Permitido!!");
            System.out.println("Empréstimo de " + valor + " efetuado com sucesso");
        }else{
            System.out.println("Valor Negado!!");
            System.out.println("O empréstimo precisa ser no MÍNIMO de 1000R$ e no MAXÍMO de R$10000");
        }

        input.close();
    }
}