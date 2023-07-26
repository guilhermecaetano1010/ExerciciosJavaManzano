package manzano;

public class ExercicioWhileJ {

	public static void main(String[] args) {
        int contador = 50;
        int soma = 0;
        double media = 0;

        while (contador <= 70) {
            if (contador % 2 == 0) {
                System.out.println(contador);
                soma = soma + contador;
            }
            contador = contador + 1;
        }

        media = (double) soma / 11;

        System.out.println("A soma dos pares é igual a: " + soma + "  A média dos pares é igual a: " + media);

	}

}
/*Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores 
pares situados na faixa numérica de 50 a 70.*/
