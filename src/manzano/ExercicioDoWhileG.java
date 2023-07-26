package manzano;

public class ExercicioDoWhileG {

	public static void main(String[] args) {
        int contador1 = 1;
        int contador2, numero, fatorial;

        do {
            numero = 2 * contador1 - 1;
            fatorial = 1;

            for (contador2 = 1; contador2 <= numero; contador2++) {
                fatorial *= contador2;
            }

            System.out.println("O fatorial do número " + numero + " é igual a " + fatorial);

            contador1++;
        } while (contador1 <= 5); // Quando contador for 5 o número será 10-1=9 então acaba.
	}

}
/*Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares 
situados na faixa numérica de 1 a 10.*/