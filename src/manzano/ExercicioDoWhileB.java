package manzano;

public class ExercicioDoWhileB {

	public static void main(String[] args) {
        int contador = 1;
        int soma = 0;

        do {
            if (contador % 2 == 0) {
                soma = soma + contador;
                System.out.println("A soma entre " + contador + " e seus antecessores é: " + soma);
            }
            contador++;
        } while (contador <= 500);
	}

}
/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 
1 até 500.*/
