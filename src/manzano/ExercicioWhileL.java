package manzano;

import java.util.Scanner;

public class ExercicioWhileL {

	public static void main(String[] args) {
        double numero = 0;
        double numeroMenor = 0;
        double numeroMaior = 0;

        Scanner sc = new Scanner(System.in);

        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = sc.nextDouble();

            if (numero < 0) {
                numeroMenor = numero;
            } else if (numero > numeroMaior) {
                numeroMaior = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + numeroMaior);
        System.out.println("O menor número digitado foi: " + numeroMenor);	
        sc.close();
	}

}
/*Elaborar um programa que efetue a leitura de valores positivos inteiros
até que um valor negativo seja informado. Ao final devem ser
apresentados o maior e o menor valores informados pelo usuário.*/
