import java.util.Scanner;


public class Atividade{
    public static void main(String[] args ){
        String planeta = "plutão";

        System.out.println("Informe seu nome");
        Scanner in = new Scanner(System.in);
        

        String nome = in.next();
        System.out.println("Olá " + nome );
    }
}