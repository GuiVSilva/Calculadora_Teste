import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraJUNITTest {
    @Test
    public void somaDoisNumeros(){
        CalculadoraJUNIT calc = new CalculadoraJUNIT();

        //Cenario de teste 1: Soma de dois valores positivos
        int soma = calc.soma(10,20);
        System.out.println(soma);

        //Cenario de teste 2: Soma de dois valores sendo um negativo
        soma = calc.soma(-10,20);
        System.out.println(soma);

        //Cenario de teste 2: Soma de dois valores sendo um zero
        soma = calc.soma(10, 0);
        System.out.println(soma);

        //Cenario de teste 3: Soma de dois valores sendo que ambos sao zero
        soma = calc.soma(0, 0);
        System.out.println(soma);

        //Cenario de teste 4: Soma de dois valores sendo um negativo
        soma = calc.soma(-2, 4);
        System.out.println(soma);

        //Cenario de teste 5: Soma de dois valores sendo que ambos sao zero
        soma = calc.soma(-2,-2);
        System.out.println(soma);

        //Cenario de teste 6: Soma de um numero maximo
        soma = calc.soma(Integer.MAX_VALUE, 1);
        System.out.println(soma);

        //Cenario de teste 7: Soma de um numero maximo sendo um negativo
        soma = calc.soma(Integer.MAX_VALUE, -6);
        System.out.println(soma);
    }

    @Test
    public void subtraiDoisNumeros(){
        CalculadoraJUNIT calc = new CalculadoraJUNIT();

        //Cenario de teste 1: Subtracao de dois valores positivos
        int sub = calc.subtracao(10, 5);
        System.out.println(sub);

        //Cenario de teste 2: Subtracao de dois valores sendo ambos negativo
        sub = calc.subtracao(-8,-3);
        System.out.println(sub);

        //Cenario de teste 3: Subtracao de dois valores sendo um negativo
        sub = calc.subtracao(12, -2);
        System.out.println(sub);

        //Cenario de teste 4: Subtracao de dois valores sendo um zero
        sub = calc.subtracao(10, 0);
        System.out.println(sub);

        //Cenario de teste 5: Subtracao de dois valores sendo ambos zero
        sub = calc.subtracao(0, 0);
        System.out.println(sub);

        //Cenario de teste 6: Subtracao de dois valores sendo ambos negativos
        sub = calc.subtracao(-4, -4);
        System.out.println(sub);

        //Cenario de teste 7: Subtracao de um numero maximo
        sub = calc.subtracao(Integer.MAX_VALUE, 3);
        System.out.println(sub);

        //Cenario de teste 8: Subtracao de um numero maximo sendo um negativo
        sub = calc.subtracao(Integer.MAX_VALUE, -10);
        System.out.println(sub);

    }

    @Test
    public void DividirDoisNumeros(){
        CalculadoraJUNIT calc = new CalculadoraJUNIT();

        //Cenario de teste 1: Divisao de dois valores positivos
        int div = calc.divisao(10,5);
        System.out.println(div);

        //Cenario de teste 2: Divisao de dois valores sendo um negativo
        div = calc.divisao(10, -2);
        System.out.println(div);

        //Cenario de teste 3: Divisao de dois valores sendo ambos negativos
        div = calc.divisao(-20, -10);
        System.out.println(div);

        //Cenario de teste 4: Divisao de dois valores sendo um zero
        div = calc.divisao(3, 0);
        System.out.println(div);

        //Cenario de teste 5: Divisao de dois valores sendo ambos zero
        div = calc.divisao(0,0);
        System.out.println(div);

        //Cenario de teste 6: Divisao de um numero maximo
        div = calc.divisao(Integer.MAX_VALUE, 20);
        System.out.println(div);

        //Cenario de teste 7: Divisao de um numero maximo sendo um negativo
        div = calc.divisao(Integer.MAX_VALUE, -10);
        System.out.println(div);

        //Cenario de teste 8: Divisao de um numero maximo sendo um 0
        div = calc.divisao(Integer.MAX_VALUE, 0);
        System.out.println(div);
    }

    @Test
    public void multiplicarDoisNumeros(){
        CalculadoraJUNIT calc = new CalculadoraJUNIT();

        //Cenario de teste 1: Multiplicacao de dois valores
        int multi = calc.multiplicacao(200, 3);
        System.out.println(multi);

        //Cenario de teste 2: Multiplicacao de dois valores sendo um negativo
        multi = calc.multiplicacao(10,-2);
        System.out.println(multi);

        //Cenario de teste 3: Multiplicacao de dois valores sendo ambos negativo
        multi = calc.multiplicacao(-12,-2);
        System.out.println(multi);

        //Cenario de teste 4: Multiplicacao de dois valores sendo um zero
        multi = calc.multiplicacao(40,0);
        System.out.println(multi);

        //Cenario de teste 5: Multiplicacao de dois valores sendo ambos zero
        multi = calc.multiplicacao(0,0);
        System.out.println(multi);

        //Cenario de teste 6: Multiplicacao de um numero maximo
        multi = calc.multiplicacao(Integer.MAX_VALUE, 5);
        System.out.println(multi);

        //Cenario de teste 6: Multiplicacao de um numero maximo sendo um negativo
        multi = calc.multiplicacao(Integer.MAX_VALUE, -5);
        System.out.println(multi);

    }
}