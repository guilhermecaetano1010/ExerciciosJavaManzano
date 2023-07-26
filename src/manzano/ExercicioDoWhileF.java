package manzano;

import java.util.Scanner;

public class ExercicioDoWhileF {

	public static void main(String[] args) {
        int soma = 0;
        int total = 0;
        double media = 0.0;
        int numero;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma = soma + numero;
                total++;
            }
        } while (numero >= 0);

        if (total > 0) {
            media = (double) soma / total;
            System.out.println("O somatório é igual a: " + soma);
            System.out.println("O total de valores lidos é: " + total);
            System.out.println("A média aritmética é igual a: " + media);
        } else {
            System.out.println("Nenhum valor válido foi lido.");
        }
        scanner.close();
	}

}
/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o 
total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras 
dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve 
parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar 
como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da 
média. */