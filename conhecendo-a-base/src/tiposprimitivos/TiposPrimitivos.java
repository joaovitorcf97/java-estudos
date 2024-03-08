package tiposprimitivos;

/*
 *  Notas de estudos sobre os tipos primitivos do Java.
 *  Tipos primitivos são providos pela linguagem nativamente.
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Characters
        char primeiraLetraDoNome = 'J';
        char primeiraLetraDoNomeASCII = 74;

        // Inteiros ou Integers
        byte nota = 10; // -128 até 127 
        short itensComprados = 2; // -32768 até 32767
        int quantidadeEmEstoque = 20500; // -2_147_483_648 até 2_147_483_647
        long numeroMuitoGrande = 4564576567567657L; // 19 dígitos

        // Tipos Decimais
        float peso = 1.5f; // 6 -7 cadas decimais
        double preco = 24.99; // ˜ 15 cadas decimais

        // Booleanos ou Booleans
        Boolean verdadeiro = true;
        Boolean falso = false;
    }
}
