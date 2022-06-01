import java.util.Scanner;


public class Atividade{
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = in.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = in.nextInt();

        System.out.println("Ola" + nome + " você tem " + idade + " anos");

       
    }
}