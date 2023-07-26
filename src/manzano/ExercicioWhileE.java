package manzano;

public class ExercicioWhileE {

	public static void main(String[] args) {
        int expoentes = 0;
        int numero = 0;

        if (expoentes == 0) {
            numero = 1;
            System.out.println(numero);
        }
        
        numero = 3;
        System.out.println(numero);

        while (expoentes < 14) {
            numero = numero * 3;
            expoentes++;
            System.out.println(numero);
        }

	}

}
/*Apresentar os resultados das potências de 3, variando do expoente 0
até o expoente 15. Deve ser considerado que qualquer número elevado
a zero é 1, e elevado a 1 é ele próprio. Observe que neste exercício
não pode ser utilizado o operador de exponenciação do visualG(^).*/