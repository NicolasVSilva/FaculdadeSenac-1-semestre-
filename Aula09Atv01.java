//Exercicio feito em aula, para aprender sobre vetor
package Aula09;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		// t = tamanho do vetor
		int t , soma, maior, menor;
		int[] vetor;
		
		t = tamanho();

		// criando o vetor
		vetor = new int[t];

		// preenchendo o vetor
		for (int i = 0; i < t; i++) {
			vetor[i] = preVetor(i);
		}

		// definindo a soma dos termos, o maior e o menor
		soma = somar(t, vetor);	
		maior = maiorP(t, vetor);
		menor = menorP(t, vetor);
		
		// exibindo a soma, o maior e o menor
		exibir(vetor, t, soma, maior, menor);
	}

	public static int tamanho() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Defina um tamanho para o vetor: ");
		int a = sc.nextInt();
		return a;
	}

	public static int preVetor(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("vetor[%d]: \n", i);
		int x = sc.nextInt();
		return x;
	}

	public static int somar(int t, int[] v) {
		int soma = 0;
		for(int i=0; i<t; i++) {
			soma += v[i];
		}
		return soma;
	}
	
	public static int maiorP(int t, int[] v) {
		int maior = v[0]; 
		for (int i = 0; i < t; i++) {
			if (v[i] > maior) {
				maior = v[i];
			}
		}
		return maior;
	}
	
	public static int menorP(int t, int[] v) {
		int menor = v[0]; 
		for (int i = 0; i < t; i++) {
			if (v[i] < menor) {
				menor = v[i];
			}
		}
		return menor;
	}
	
	public static void exibir(int[] vetor,int t,int soma,int maior,int menor) {
		for (int i = 0; i < t; i++) {
			if (vetor[i] == menor) {
				System.out.printf("vetor[%d]: %d <-- menor\n", i, vetor[i]);
			} else if (vetor[i] == maior) {
				System.out.printf("vetor[%d]: %d <-- maior\n", i, vetor[i]);
			} else {
				System.out.printf("vetor[%d]: %d\n", i, vetor[i]);
			}
		}
		System.out.println("soma: " + soma);
	}
}

