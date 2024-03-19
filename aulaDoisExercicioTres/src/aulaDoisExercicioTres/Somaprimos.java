package aulaDoisExercicioTres;

public class Somaprimos extends Thread {
	int inicio, fim;
	int soma=0;
	public Somaprimos(int inicio, int fim) {
		this.inicio=inicio;
		this.fim=fim;
	}
	public void run() {
		for(int x=inicio; x<=fim; x++) {
			if (x!=1)	
				soma+=isprimo(x);
		}
		System.out.println("Soma dos numeros primos: " + (soma));
	}
	private int isprimo(int numero) {
			for(int i=2; i<numero; i++) {
				if (numero%i==0) {
				return 0;
				}
			}
			return numero;
	}
}