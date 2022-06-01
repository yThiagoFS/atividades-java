import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe outro número");
        int n2 = in.nextInt();

        while(n2 <= 0) {
            System.out.println("Número não permitido. Digite outro valor.");
            n2 = in.nextInt();
        }
        System.out.println("A divisão do primeiro número com o segundo é: " + n1 / n2);
    }
}