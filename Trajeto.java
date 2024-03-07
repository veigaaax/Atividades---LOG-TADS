import java.util.Scanner;

public class Trajeto{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float velocidade, distancia, tempo;

        velocidade = 0;
        distancia = 0;

        System.out.println("Informe a distancia e em seguida a velocidade");
        distancia = in.nextFloat();
        velocidade = in.nextFloat();
        
        tempo = velocidade / distancia;

        System.out.println("O tempo de viagem previsto e de:" + tempo);


        



    
    }
}