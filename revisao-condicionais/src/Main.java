import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);
        String password = "123456";

        System.out.println("Validador de senha");

        System.out.println("Digite sua senha: ");
        String senhaDigitada = input.nextLine();

        if(!senhaDigitada.equals(password)){
            System.out.println("Senha inválida");
        }else {
            System.out.println("Acesso permitido!");
        }

        input.close();
    }
}