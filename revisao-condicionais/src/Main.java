import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);
        boolean desconto = true; //true aplica desconto, false sem desconto ,alterar manual

        System.out.println("Dia de DESCONTO no mercadão");

        System.out.println("\nDigite o valor da mercadoria comprada: ");
        double valor = Double.parseDouble(input.nextLine());

        System.out.println("Preço da mercadoria: " + valor);
        if(desconto){
            valor -= valor * 0.1;
            System.out.println("Hojé é dia 10% de desconto sua compra terá o valor final de: " + valor);
        }else{
            System.out.println("Hojé não é dia de desconto, valor final: " + valor);
        }

        input.close();
    }
}