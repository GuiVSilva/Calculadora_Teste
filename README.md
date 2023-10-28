# Calculadora_Teste
 - Testes unitários em Java

## Tecnologias
    Java, JUnit5

## IDE
    IntelliJ

# Descrição
  - Métodos de Soma, Subtração, Divisão e Multiplicação 
  - Criando cenários de teste para cada método utilizando JUnit5

## Etapas do teste
  - Parte 1: Criar o cenário de teste (inicializa os objetos)
  - Parte 2: Realiza a ação (invoca os métodos)
  - Parte 3: Realiza a validação (compara o retorno)

---

**Codigo:**

```java
/**
 * Autor: Guilherme
 * Data de Criação: 09/09/2023
 * Versão: 2.0
 *
 * Adicionada a classe `Operacoes` com métodos para realizar operações matemáticas e a classe `Teste` com cenários de teste usando JUnit5.
 *
 * ## Classe `Operacoes`
 *
 * ### Métodos
 *
 * #### `soma(int a, int b): int`
 * Realiza a soma de dois números inteiros.
 *
 * #### `subtracao(int a, int b): int`
 * Realiza a subtração de dois números inteiros.
 *
 * #### `divisao(int a, int b): int`
 * Realiza a divisão de dois números inteiros. Lança uma exceção se o denominador for zero.
 *
 * #### `multiplicacao(int a, int b): int`
 * Realiza a multiplicação de dois números inteiros.
 *
 * ## Classe `Teste`
 *
 * ### Cenários de Teste
 *
 * #### `Soma`
 * - Cenário de teste 1: Soma de dois valores positivos.
 * - Cenário de teste 2: Soma de um número negativo e um positivo.
 * - Cenário de teste 3: Soma de um número positivo e zero.
 * - Cenário de teste 4: Soma de dois zeros.
 * - Cenário de teste 5: Soma de um número negativo e um positivo.
 * - Cenário de teste 6: Soma de dois números negativos.
 * - Cenário de teste 7: Soma de um número máximo e um positivo.
 * - Cenário de teste 8: Soma de um número máximo e um número negativo.
 *
 * #### `Subtracao`
 * - Cenário de teste 1: Subtração de dois valores positivos.
 * - Cenário de teste 2: Subtração de dois números negativos.
 * - Cenário de teste 3: Subtração de um número positivo e um número negativo.
 * - Cenário de teste 4: Subtração de um número positivo e zero.
 * - Cenário de teste 5: Subtração de dois zeros.
 * - Cenário de teste 6: Subtração de dois números negativos.
 * - Cenário de teste 7: Subtração de um número máximo e um positivo.
 * - Cenário de teste 8: Subtração de um número máximo e um número negativo.
 *
 * #### `Divisao`
 * - Cenário de teste 1: Divisão de dois valores positivos.
 * - Cenário de teste 2: Divisão de um número positivo por um número negativo.
 * - Cenário de teste 3: Divisão de dois números negativos.
 * - Cenário de teste 4: Tentativa de divisão por zero.
 * - Cenário de teste 5: Divisão de zero por zero.
 * - Cenário de teste 6: Divisão de um número máximo por um número positivo.
 * - Cenário de teste 7: Divisão de um número máximo por um número negativo.
 * - Cenário de teste 8: Tentativa de divisão por zero usando um número máximo.
 *
 * #### `Multiplicacao`
 * - Cenário de teste 1: Multiplicação de dois valores positivos.
 * - Cenário de teste 2: Multiplicação de um número positivo por um número negativo.
 * - Cenário de teste 3: Multiplicação de dois números negativos.
 * - Cenário de teste 4: Multiplicação de um número positivo por zero.
 * - Cenário de teste 5: Multiplicação de zero por zero.
 * - Cenário de teste 6: Multiplicação de um número máximo por um número positivo.
 * - Cenário de teste 7: Multiplicação de um número máximo por um número negativo.
 * ```

---

**Atualizações:**

Adicionada documentação detalhada aos métodos das classes `Operacoes` e `Teste` para melhor compreensão do funcionamento e dos cenários de teste.
