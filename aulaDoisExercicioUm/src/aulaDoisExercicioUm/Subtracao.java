package aulaDoisExercicioUm;

public class Subtracao extends Thread {
	double x, y;
	public Subtracao(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		System.out.println("Subtracao: " + (x - y));
	}
}