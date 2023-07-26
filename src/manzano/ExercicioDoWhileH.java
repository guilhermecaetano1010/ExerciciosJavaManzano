package manzano;

import java.util.Scanner;

public class ExercicioDoWhileH {

	public static void main(String[] args) {
        String nomeComodo;
        double largura, comprimento, areaComodo;
        String continuar;
        double areaTotal = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite o nome do cômodo: ");
            nomeComodo = scanner.nextLine();

            System.out.print("Digite a largura do cômodo: ");
            largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo: ");
            comprimento = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer após a leitura dos números.

            areaComodo = largura * comprimento;
            areaTotal = areaTotal + areaComodo;

            System.out.println("A área do cômodo " + nomeComodo + " é: " + areaComodo + " metros quadrados.");

            System.out.print("Deseja continuar calculando novos cômodos? (SIM/NAO): ");
            continuar = scanner.nextLine().toUpperCase();

        } while (!continuar.equals("NAO"));

        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");
        scanner.close();
	}

}
/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, 
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do 
nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área 
do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar 
calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor 
total acumulado da área residencial.*/