package manzano;

import java.util.Scanner;

public class ExercicioWhileI {

	public static void main(String[] args) {
        int contador = 1;
        double soma = 0;
        double media = 0;
        double numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0, numero5 = 0, numero6 = 0, numero7 = 0, numero8 = 0, numero9 = 0, numero10 = 0;

        Scanner sc = new Scanner(System.in);

        while (contador <= 10) {
            switch (contador) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    numero1 = sc.nextDouble();
                    break;
                case 2:
                    System.out.print("Digite o segundo número: ");
                    numero2 = sc.nextDouble();
                    break;
                case 3:
                    System.out.print("Digite o terceiro número: ");
                    numero3 = sc.nextDouble();
                    break;
                case 4:
                    System.out.print("Digite o quarto número: ");
                    numero4 = sc.nextDouble();
                    break;
                case 5:
                    System.out.print("Digite o quinto número: ");
                    numero5 = sc.nextDouble();
                    break;
                case 6:
                    System.out.print("Digite o sexto número: ");
                    numero6 = sc.nextDouble();
                    break;
                case 7:
                    System.out.print("Digite o sétimo número: ");
                    numero7 = sc.nextDouble();
                    break;
                case 8:
                    System.out.print("Digite o oitavo número: ");
                    numero8 = sc.nextDouble();
                    break;
                case 9:
                    System.out.print("Digite o nono número: ");
                    numero9 = sc.nextDouble();
                    break;
                case 10:
                    System.out.print("Digite o décimo número: ");
                    numero10 = sc.nextDouble();
                    break;
                default:
                    System.out.println("Erro!!");
                    break;
            }
            contador++;
            
        }

        soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;
        media = soma / 10;

        System.out.println("O resultado da somatória é: " + soma);
        System.out.println("O resultado da média aritmética é: " + media);	
        sc.close();
	}
}
/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do 
somatório e a média aritmética dos valores lidos.*/