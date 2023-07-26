package manzano;

public class ExercicioDoWhileA {

	public static void main(String[] args) {
        int numero, resultado = 0;
        numero = 15;

        do {
            resultado = numero * numero;
            System.out.println("O quadrado do número: " + numero + " é igual a: " + resultado);
            numero = numero + 1;
        } while (numero <= 200);

	}

}
/*Apresentar os quadrados dos números inteiros de 15 a 200.*/
