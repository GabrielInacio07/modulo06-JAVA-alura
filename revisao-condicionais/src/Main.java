import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para validar: ");
        int number = Integer.parseInt(input.nextLine());

        if(number % 2 == 0){
            System.out.println("Número digitado é [PAR]");
        }else{
            System.out.println("Número digitado é [IMPAR]");
        }
    }
}