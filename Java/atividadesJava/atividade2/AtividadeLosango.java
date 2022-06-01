import java.util.Scanner;

public class AtividadeLosango{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a maior diagonal do losango");
        int maiorDiag = in.nextInt();
        in.nextLine();

        System.out.println("Informe a menor diagonal do losango");
        int menorDiag = in.nextInt();

        int areaLosango = (maiorDiag * menorDiag) / 2;
        
        System.out.println("A área do losando é de: " + areaLosango + "m2");
    }
}