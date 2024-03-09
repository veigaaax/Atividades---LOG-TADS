import java.util.Scanner;
public class Esportivo {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ingresso, menores, socios,pagantes;
        int valorTotaldoEvento,valornaoArrecadado,publicoTotal;
        double desconto, iSoc,resultadoSoc;

        desconto = 0.3f;

        iSoc = 0;
        ingresso = 0;
        
        System.out.println("Seja Bem-Vindo!");

        System.out.println("Digite o valor dos ingressos");
        ingresso = in.nextInt();

        System.out.println("Digite o numero de pessoas que sao Socias"); // 30% de desconto
        socios = in.nextInt();

        System.out.println("Digite o numero de pessoas que sao Menores de 10 anos"); //não pagam
        menores = in.nextInt();

        System.out.println("Digite o numero de pessoas que sao pagantes sem desconto ");//valor normal do ingresso
        pagantes = in.nextInt();
        
        resultadoSoc = desconto * iSoc;
        valorTotaldoEvento = socios * resultadoSoc;
        publicoTotal = (menores + socios + pagantes);
        
        

        System.out.println("O numero de pessoas no evento sao " + publicoTotal );



      // Valor de cada ingresso
//- Número de pessoas (público do evento) que são sócias do clube
//- Número de pessoas (público do evento) não pagantes (menores de 10anos)
// Número de pessoas (público do evento) pagantes (sem desconto algum)


    }
}
