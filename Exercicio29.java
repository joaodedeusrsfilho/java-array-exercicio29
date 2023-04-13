package aula19_Arrays;

public class Exercicio29 {

	public static void main(String[] args) {
		/*
		 * Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo
		 * este a junção dos dois outros vetores. Os primeiros 10 elementos de C deverão
		 * receber os elementos de A e os últimos elementos C deverão receber os
		 * elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou
		 * seja 20 elementos
		 */
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];

		for (int x = 0; x < vetorA.length; x++) {
			vetorA[x] = (int) Math.round(Math.random() * 10);
			vetorB[x] = vetorA[x];
		}
		for (int x = 0; x < vetorB.length; x++) {
			vetorC[x] = vetorA[x];
			vetorC[vetorB.length + x] = vetorB[x];
		}
//		imprimir os valores
		System.out.print("Vetor A = ");
		for (int x = 0; x < vetorA.length; x++) {
			System.out.print(vetorA[x] + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int x = 0; x < vetorB.length; x++) {
			System.out.print(vetorB[x] + " ");
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for (int x = 0; x < vetorC.length; x++) {
			System.out.print(vetorC[x] + " ");
		}
	}
}
