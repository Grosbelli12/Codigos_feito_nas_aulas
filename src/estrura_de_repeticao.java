import java.util.Arrays;
import java.util.Scanner;
public class estrura_de_repeticao {
    public static void main(String[] args) {
        String[] timeA = new String[5];
        String[] timeB = new String[5];
        String nomeTimeA = "";
        String nomeTimeB = "";
        Scanner sc = new Scanner(System.in);

        //Inicialização; condição; incremento
        // ++ -> vai somar +1 i = i + 1
        System.out.println("Informe o nome do primeiro time: ");
        nomeTimeA = sc.next();
        System.out.println("Informe o nome do segundo time: ");
        nomeTimeB = sc.next();
        for (int i = 0; i < 5; i++) {
            System.out.println("informe o nome do player " + (i + 1) + " do time " + nomeTimeA);
            timeA[i] = sc.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("informe o nome do player " + (i + 1) + " do time " + nomeTimeB);
            timeB[i] = sc.next();
        }
        System.out.println("Os jogadores do time " + nomeTimeA + " são: " + Arrays.toString(timeA));
        System.out.println("Os jogadores do time " + nomeTimeB + " são: " + Arrays.toString(timeB));

        // Pedir o nome do time A
        // Pedir os nomes do time A (5 nomes)
        // Pedir o nome do time B
        // Pedir os nomes do time B (5 nomes)
    }
}