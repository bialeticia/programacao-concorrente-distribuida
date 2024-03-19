package aulaDoisExercicioUm;

public class Divisao extends Thread {
	double x, y;
	public Divisao(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		if (y==0) {
			System.out.println("Erro");
		} 
		else {
			System.out.println("Divisao: " + (x / y));	
		}
	}
}