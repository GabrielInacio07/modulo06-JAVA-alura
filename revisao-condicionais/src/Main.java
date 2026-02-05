import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);

        System.out.println("Sistema de segurança");

        System.out.println("\nDigite seu código de acesso: ");
        int codigoDeAcesso = Integer.parseInt(input.nextLine());

        System.out.println("\nDigite seu nível de permissão [1,2,3]: ");
        int permissaoDeAcesso = Integer.parseInt(input.nextLine());

        if (codigoDeAcesso == 2026 && permissaoDeAcesso == 3) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado.");
            if (codigoDeAcesso != 2026) {
                System.out.println("Código de acesso inválido!");
            }
            if (permissaoDeAcesso < 3) {
                System.out.println("Nível de permissão não permitido!");
            }
        }
        input.close();
    }
}