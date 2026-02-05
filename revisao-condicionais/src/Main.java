import java.util.Scanner;

class Main{
    static void main(String[] args) {
        System.out.println("Revisão condicionais [Módulo 06]");
        Scanner input = new Scanner(System.in);

        System.out.println("Boletim Escolar");
        System.out.println("Digite a nota do primeiro bimestre: ");
        Double nota = Double.parseDouble(input.nextLine());

        System.out.println("Digite a nota do segundo bimestre: ");
        Double nota2 = Double.parseDouble(input.nextLine());

        System.out.println("Digite a nota do terceiro bimestre: ");
        Double nota3 = Double.parseDouble(input.nextLine());

        double media = (nota + nota2 + nota3) / 3;
        String mediaFormatada = String.format("%.2f",media);

        if(media >= 8.2){
            System.out.println("O estudante teve a média de: " + mediaFormatada + " e foi aprovado");
        }else if(media >= 5.8){
            System.out.println("O estudante teve a média de: " + mediaFormatada + " e está de recuperação");
        }else{
            System.out.println("O estudante teve a média de: " + mediaFormatada + " e foi reprovado");
        }

    }
}