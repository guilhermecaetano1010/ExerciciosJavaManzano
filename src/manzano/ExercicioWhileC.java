package manzano;

public class ExercicioWhileC {

	public static void main(String[] args) {
        int contador = 1;
        int soma = 0;

        while (contador <= 500) {
            if (contador % 2 == 0) {
                soma = soma + contador;
            }
            contador++;
        }

        System.out.println("A soma dos valores pares de 1 a 500 é: " + soma);
	}

}
/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 
1 até 500.*/