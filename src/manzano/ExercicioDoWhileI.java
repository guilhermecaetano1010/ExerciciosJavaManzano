package manzano;
import java.util.Scanner;

public class ExercicioDoWhileI {

	public static void main(String[] args) {
		
	        int valor, maior = 0, menor = 0;

	        Scanner scanner = new Scanner(System.in);

	        do {
	            System.out.print("Digite um valor, se for negativo o programa para: ");
	            valor = scanner.nextInt();

	            if (valor >= 0 && valor > maior) {
	                maior = valor;
	            } else if (valor < 0) {
	                menor = valor;
	            }

	        } while (valor >= 0);

	        System.out.println("O maior valor informado foi: " + maior);
	        System.out.println("O menor valor informado foi: " + menor);
	        scanner.close();
	}

}
/*Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo 
seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo 
usuário.*/