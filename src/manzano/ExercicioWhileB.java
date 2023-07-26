package manzano;

public class ExercicioWhileB {
    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;

        while (contador <= 100) {
            soma = soma + contador;
            contador++;
            System.out.println("Valor da soma: " + soma + "  mais  " + contador + ".");
        }
    }
}
/*Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).*/