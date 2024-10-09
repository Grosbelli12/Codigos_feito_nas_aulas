public class Aprendendo_Funcoes {
    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("Valor soma: " + somaViaFuncao);

        int subtrairFuncao = subtrairValores(-50, 20);
        System.out.println("Valor subtração: " + subtrairFuncao);

        int multiplicarFuncao = multiplicarValores(10, 8);
        System.out.println("Valor multiplicação: " + multiplicarFuncao);

        int divisãoFuncao = dividirValores(4, 2);
        System.out.println("Valor divisão: " + divisãoFuncao);
    }

    public static int somarValores(int numA, int numB) {
        if (numA < 0) {
            return numA * -1;
        }
        return numA + numB;
    }

    public static int subtrairValores(int numA, int numB) {

        if (numA < 0) {
            numA = numA * -1;


        }
        return numA - numB;
    }

    public static int multiplicarValores(int numA, int numB) {
        if (numA == 0 || numB == 0) {
            return 0;
        }
        return numA * numB;
    }

    public static int dividirValores(int numA, int numB) {
        if (numA < 0 || numB < 0) {
            return 0;
        }
        return numA / numB;
    }
}