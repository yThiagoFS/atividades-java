import java.util.Scanner;

public class AtividadeTrapezio{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a maior base do trapézio");
        int maiorBase = in.nextInt();
        in.nextLine();

        System.out.println("Informe a menor base do trapézio");
        int menorBase = in.nextInt();
        in.nextLine();

        System.out.println("Informe a autora do trapézio");
        int alturaTrapezio = in.nextInt();

        int areaTrapezio = ((maiorBase + menorBase) * alturaTrapezio) / 2;
        System.out.println("A área do trapézio é de: " +areaTrapezio+ "m2");
    }
}