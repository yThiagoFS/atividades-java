import java.util.Scanner;

public class AtividadeParalelogramo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a altura do paralelogramo");
        int altura = in.nextInt();
        in.nextLine();

        System.out.println("Informe o tamanho da base do paralelogramo");
        int base = in.nextInt();

        int areaParalelogramo = base * altura;

        System.out.println("A área do paralelogramo é de: "+areaParalelogramo+ "m2" ); 
    }
}