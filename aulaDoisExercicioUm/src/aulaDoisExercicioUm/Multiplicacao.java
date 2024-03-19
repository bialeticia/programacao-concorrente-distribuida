package aulaDoisExercicioUm;

public class Multiplicacao extends Thread {
	double x, y;
	public Multiplicacao(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		System.out.println("Multiplicacao: " + (x * y));
	}
}