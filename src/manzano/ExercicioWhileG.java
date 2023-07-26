package manzano;

public class ExercicioWhileG {

	public static void main(String[] args) {
        int soma = 0;
        int numero1 = 1;
        int numero2 = 1;
        int contador = 0;

        while (contador < 15) {
            System.out.println(numero1);
            soma = numero1 + numero2;
            numero1 = numero2;
            numero2 = soma;
            contador++;
        }	 

	}

}
/*Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de 
Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza 
pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo 
valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo 
é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc. */