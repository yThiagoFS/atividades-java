import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a base do retângulo:");
        int baseRetangulo = in.nextInt();
        in.nextLine();

        System.out.println("Informe a altura do retângulo:");
        int alturaRetangulo = in.nextInt();
        in.close();

        int areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.println("O seu retângulo tem a área total de: "+ areaRetangulo);
    }
}