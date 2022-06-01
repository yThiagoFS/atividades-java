import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número");
        int n1 = in.nextInt();
        in.nextLine();

        System.out.println("Informe mais um número");
        int n2 = in.nextInt();
        in.nextLine();

        System.out.println("Informe outro número");
        int n3 = in.nextInt();

        if(n1 > n3 && n2 > n3){
            System.out.println("A soma dos 2 maiores números é de: " + (n1 + n2));
        } else if(n2 > n1 && n3 > n1){
            System.out.println("A soma dos 2 maiores números é de: " + (n2 + n3));
        } else {
            System.out.println("A soma dos 2 maiores números é de: " + (n1 + n3));
        }
    }
}