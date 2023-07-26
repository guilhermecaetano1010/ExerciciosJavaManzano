package manzano;

public class ExercicioWhileH {

	public static void main(String[] args) {
        int Celsius = 10;

        while (Celsius <= 100) {
            float conversao = ((9 * Celsius) + 160) / 5;
            float Fah = conversao;
            System.out.println("Temperatura em Celsius: " + Celsius + "   Temperatura em Fahrenheit: " + Fah);
            Celsius = Celsius + 10;
        }
    }

	}


/*Elaborar um programa que apresente os valores de conversão de graus
Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10
graus Celsius e finalizando em 100 graus Celsius. O
programa deve apresentar os valores das duas temperaturas.
A fórmula de conversão é  F = (9C +160)/5  , sendo F a
temperatura em Fahrenheit e C a temperatura em Celsius.*/
