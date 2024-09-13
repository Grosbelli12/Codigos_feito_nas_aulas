    public class operadores {
    public static void main(String[] args) {
        System.out.println("Gustavo");
    //tipoDaVariavel nomeDaVariavel = ValorDaVariavel
    //String é um TEXTO
    String nome = "Gustavo";

    char sexo = '5';

    // [] -> Diz que é um array
    // {} -. Indicar um objeto
    char[] textoChar = {'5'};

    //Guardar Valores Reais
    double altura = 1.72;
    Double peso = 69.0;
    float alturapessoa2 = 1.80f;
    Float alturapessoa3 = 1.83f;
    int numeroCasa = 20;
    Integer numeroAlunos = 75;
    Long numeroGolsDoAmado = 8L;

    // Operadores aritméticos
    // + para soma
    // - para subtracao
    // * para multiplicação
    // / para divisão

    Integer soma = 5 + 5;
    Integer subtracao = 3 - 5;
    Integer multiplicar = 5 * 5;
    Integer dividir = 5 / 5;

    Integer resultadoSoma = soma + subtracao;
    Integer resultadoSubtrair = soma - subtracao;
    Integer resultadoMultiplicar = soma * subtracao;
    Integer resultadoDivisao = soma / subtracao;

        System.out.println("Valor da divisão é : " + resultadoDivisao);
        System.out.println("Valor da subtracao é : " + resultadoSubtrair);
        System.out.println("Valor da soma é : " + resultadoSoma);
        System.out.println("Valor da multiplicação é : " + resultadoMultiplicar);
        

    }
}