import java.util.Scanner;

public class AtividadeQuadrado{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor correspondente ao lado do quadrado");

        double ladoQuadrado = in.nextDouble();
        

        double areaQuadrado = Math.pow(ladoQuadrado,2); 

        System.out.println("Este quadrado tem: " + areaQuadrado+ "m2");
    }
}