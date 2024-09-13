import java.util.Scanner;

public class exemploVetores {
    public static void main(String[] args) {

        int votopessoa1 = 10;
        int votopessoa2 = 23;
        int votopessoa3 = 10;
        int votopessoa4 = 10;
        int votopessoa5 = 99;
        int votopessoa6 = 10;
        int votopessoa7 = 99;
        int votopessoa8 = 10;
        int votopessoa9 = 23;
        int votopessoa10 = 99;

        //primeira forma de criar e inicializar vetor
        //Criamos o vetor vazio

        int[]votos = new int[10];

        //nomeVetor[posição] = valor
        //Vetor vai da posição 0 até 9
        votos[0] = 90;
        votos[1] = 10;
        votos[9] = 10;
        votos[0] = 23;


        String[]nomes = new String[5];

        Scanner entrada = new Scanner(System.in);
        nomes[0] = entrada.next();
    }
}