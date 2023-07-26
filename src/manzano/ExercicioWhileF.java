package manzano;

import java.util.Scanner;

public class ExercicioWhileF {

	public static void main(String[] args) {
        int expoentes = 0;
        int numero = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da base da potência: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente da potência: ");
        int expoente1 = sc.nextInt();

        if (expoente1 == 0) {
            numero = 1;
        } else {
            numero = base;
            expoente1 = expoente1 - 1;

            while (expoentes < expoente1) {
                numero = numero * base;
                expoentes++;
            }
        }

        System.out.println("O valor da potência é: " + numero);
    sc.close();
	}

}
/*Elaborar um programa que apresente como resultado o valor de uma
potência de uma base qualquer elevada a um expoente qualquer, ou seja,
de BE, em que B é o valor da base e E o valor do expoente. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do
visualG.*/