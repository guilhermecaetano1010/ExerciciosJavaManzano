package manzano;

import java.util.Scanner;

public class ExercicioDoWhileJ {

	public static void main(String[] args) {
        int dividendo, divisor, quociente = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        dividendo = scanner.nextInt();

        System.out.print("Digite o divisor: ");
        divisor = scanner.nextInt();

        if (divisor < dividendo) {
            do {
                dividendo = dividendo - divisor;
                quociente = quociente + 1;
            } while (dividendo >= divisor);

            System.out.println("O resultado inteiro da divisão é: " + quociente);
        } else {
            System.out.println("O resultado dessa divisão é uma fração!");
            
            scanner.close();
        }
	}

}
/*Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer. 
Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético 
DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve 
apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.*/