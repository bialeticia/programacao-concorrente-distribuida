package aulaDoisExercicioUm;

public class Soma extends Thread {
	double x, y;
	public Soma(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		System.out.println("Soma: " + (x + y));
	}
}