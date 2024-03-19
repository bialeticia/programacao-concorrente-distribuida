package aulaDoisExercicioDois;

public class Maiorvalor extends Thread {
	int[] lista;
	int maiorValor=0;
	public Maiorvalor(int[] lista) {
		this.lista=lista;
	}
	
	public void run() {
		for(int x=0; x<lista.length; x++) {
			if (lista[x]>maiorValor) {
				maiorValor=lista[x];
			}
		}
		System.out.println("Maior valor: " + (maiorValor));
	}
}