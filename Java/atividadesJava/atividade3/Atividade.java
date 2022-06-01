import java.util.Scanner;

public class Atividade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um valor");

        double numero = in.nextDouble();

        if(numero < 0 ){
            System.out.println("O número informado é negativo" + (numero));
        } else {
            System.out.println("O número informado é positivo" + (numero));
        }
    }
}