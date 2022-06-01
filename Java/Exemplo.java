import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Sistema, procure uma saida para escrever "Hello world"


        String nome = "Thiago";
        System.out.println(nome); // println quebra a linha
        int idade = 19;

        System.out.println("Ola, " + nome + ". Eu sei que você tem " + idade + "anos");


        double dinheiro = 20.1;

        int umMaisUm = 1+1;
        int tresVezesDois = 3 * 2;
        int quatroDivididoPorDois = 4 / 2;

        System.out.println(umMaisUm);
        System.out.println(tresVezesDois);
        System.out.println(quatroDivididoPorDois);

        System.out.println("Informe a idade do seu cachorro em anos humanos:");
        Scanner in = new Scanner(System.in);
        // Em Js = var nome = prompt("Informe a idade do seu cachorro em anos humanos:")

        int idadeCachorro = in.nextInt();

        idadeCachorro = idadeCachorro * 7;

        System.out.println("O seu cachorro tem " + idadeCachorro + " anos em anos dogisticos");
    }
}