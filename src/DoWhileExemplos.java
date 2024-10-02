import java.util.Scanner;

public class DoWhileExemplos {
    public static void main(String[] args) {
        Scanner tantofaz = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("""
             ** Escolha **
            1 - Inserir
            2 - Excluir
            3 - Alterar 
            0 - Sair """);
            tantofaz.nextLine();
        }while (opcao != 0);

    }
}
