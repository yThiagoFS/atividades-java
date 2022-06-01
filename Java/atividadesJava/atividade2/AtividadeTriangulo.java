import java.util.Scanner;

public class AtividadeTriangulo{
    public static void main(String[] args){
        // base * altura / 2

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a base do triângulo");
        int base = in.nextInt();
        in.nextLine();

        System.out.println("Informe a altura do triângulo");
        int altura = in.nextInt();

        int areaTriangulo = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " +areaTriangulo+ "m2");
    }
}