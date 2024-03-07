import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int validos, nulos, brancos, total;

        validos = 0;
        nulos = 0;
        brancos = 0;
        
        System.out.println("Informe o numero de votos validos");
        validos = in.nextInt();

        System.out.println("Informe o numero de votos nulos");
        nulos = in.nextInt();

        System.out.println("Informe o numero de brancos ");
        brancos = in.nextInt();

        total = validos + nulos + brancos;
        System.out.println("O total de votos sao de: " + total );



    }
}
