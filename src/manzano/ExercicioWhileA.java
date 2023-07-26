package manzano;

import java.util.Scanner;

public class ExercicioWhileA {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que deseja saber a tabuada: ");
        int numero = sc.nextInt();
        int contador = 1;
        int resultado = 0;

        System.out.println("Tabuada do: " + numero + ".");
        while (contador <= 10) {
            resultado = contador * numero;
            System.out.println(contador + " x " + numero + " = " + resultado);
            contador++;
        }
    sc.close();
	}

}
/*Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.*/
