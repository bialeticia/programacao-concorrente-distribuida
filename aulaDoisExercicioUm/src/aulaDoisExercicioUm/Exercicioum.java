// Calcule as 4 operações aritméticas básicas com 2 números;

package aulaDoisExercicioUm;

public class Exercicioum {
	public static void main(String[] args) {
		Soma thread = new Soma(2, 3);
		Subtracao thread1 = new Subtracao(2, 3);
		Multiplicacao thread2 = new Multiplicacao(2, 3);
		Divisao thread3 = new Divisao(2, 3);
		
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}