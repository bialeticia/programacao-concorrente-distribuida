// Calcule a soma dos números primos dentro de um intervalo determinado;

package aulaDoisExercicioTres;

public class Exerciciotres {
	
	public static void main(String[] args) {

		Somaprimos thread = new Somaprimos(1, 20);
		
		thread.start();
	}
}