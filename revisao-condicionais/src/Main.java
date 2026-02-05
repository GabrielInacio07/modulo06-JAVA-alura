import java.util.ArrayList;
import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);

        System.out.println("Verificando se valores podem formar um TRIÂNGULO");

        System.out.println("\nDigite o lado A:");
        int ladoA = Integer.parseInt(input.nextLine());

        System.out.println("\nDigite o lado B:");
        int ladoB = Integer.parseInt(input.nextLine());

        System.out.println("\nDigite o lado C:");
        int ladoC = Integer.parseInt(input.nextLine());

        String isTriangulo = (ladoA + ladoB) > ladoC ?
                "Os valores podem formar um TRIÂNGULO" : "Valores NÃO podem formar um TRIÂNGULO";

        System.out.println(isTriangulo);

        input.close();
    }
}