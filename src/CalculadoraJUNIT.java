/**
 * Autor: Guilherme
 * Data de Criação: 09/09/2023
 * Versão: 2.0
 *
 * A classe CalculadoraJUNIT contém métodos para realizar operações matemáticas simples,
 * como soma, subtração, multiplicação e divisão, utilizada para testes com JUnit.
 */
public class CalculadoraJUNIT {

    /**
     * Este método realiza a soma de dois números inteiros.
     *
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return O resultado da soma de a e b.
     */
    public int soma(int a, int b) {
        return a + b;
    }

    /**
     * Este método realiza a subtração de dois números inteiros.
     *
     * @param a O número do qual será subtraído o segundo número.
     * @param b O número a ser subtraído de a.
     * @return O resultado da subtração de b de a.
     */
    public int subtracao(int a, int b) {
        return a - b;
    }

    /**
     * Este método realiza a divisão de dois números inteiros.
     *
     * @param a O numerador, o número que será dividido.
     * @param b O denominador, o número pelo qual o numerador será dividido.
     * @return O resultado da divisão de a por b.
     * @throws ArithmeticException Se b for igual a zero, uma exceção será lançada.
     */
    public int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Este método realiza a multiplicação de dois números inteiros.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O resultado da multiplicação de a por b.
     */
    public int multiplicacao(int a, int b) {
        return a * b;
    }
}
