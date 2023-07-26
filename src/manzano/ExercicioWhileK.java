package manzano;

import java.util.Scanner;

public class ExercicioWhileK {

	public static void main(String[] args) {
        double soma = 0;
        double area = 0;
        String parar = "sim";

        Scanner sc = new Scanner(System.in);

        while (parar.equalsIgnoreCase("sim")) {
            System.out.print("Digite o nome do cômodo que deseja saber a área: ");
            String nome = sc.nextLine();

            System.out.print("Digite a largura do cômodo: ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do cômodo: ");
            double comprimento = sc.nextDouble();
            sc.nextLine(); 

            area = largura * comprimento;
            soma += area;

            System.out.println("A área do(a) " + nome + " é: " + area + " m²");

            System.out.print("Deseja continuar calculando novos cômodos? ");
            parar = sc.nextLine();
        }

        System.out.println("O valor total acumulado da área residencial é: " + soma + " m²");	
    sc.close();
	}

}
/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, 
banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do 
nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar 
calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor 
total acumulado da área residencial.*/
