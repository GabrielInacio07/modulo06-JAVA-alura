import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);

        System.out.println("Comparador de Maior | Menor");

        System.out.println("Digite o primeiro número: ");
        double number = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo número: ");
        double number2 = Double.parseDouble(input.nextLine());

        if(number > number2){
            System.out.println("O numéro " + number + " é MAIOR que " + number2);
        }else if(number < number2){
            System.out.println("O numéro " + number2 + " é MAIOR que " + number);
        }else{
            System.out.println("Ambos números são iguais");
        }

        input.close();
    }
}