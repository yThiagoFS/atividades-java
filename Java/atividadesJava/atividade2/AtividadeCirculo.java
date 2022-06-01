import java.util.Scanner;

public class AtividadeCirculo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o raio do triângulo");
        double raio = in.nextDouble();
        in.nextLine();

        System.out.println("Informe o valor de PI");
        double pi = in.nextDouble();
        
        double areaCirculo = raio * pi;

        System.out.println("A área do circulo é de: " +areaCirculo+ "m2" );
    }
}