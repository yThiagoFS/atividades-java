import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Digite mais um número");
        int n2 = in.nextInt();
        in.nextLine();

        System.out.println("Digite outro número");
        int n3 = in.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("O primeiro número informado é o maior. " + n1);
        } 
        if(n2 > n1 && n2 > n3){
            System.out.println("O segundo número informado é o maior. " + n2);
        } else if(n3>n1 && n3>n2) {
            System.out.println("O terceiro número informado é o maior. " + n3);
        }
    }
}