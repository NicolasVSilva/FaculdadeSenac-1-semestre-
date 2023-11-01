// Exercicio de prova
/*
 * Nicolas Vieira Silva
 * Guilherme Domiciano de Viveiros
 */

package Prova1;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//declarando variavel
		int n, maior, menor;

		//recebendo dados do usuario
		System.out.println("Digite um valor: ");
		n = sc.nextInt();

		maior = n;
		menor = n;
		
		//processando dados
		if (n >= 0) {
			do {
				System.out.println("Digite um valor: ");
				n = sc.nextInt();
				if (n > maior) { 					//fazendo comparação para o maior
					maior = n;
				} else if (n < menor && n >= 0) {	//fazendo comparação para o menor
					menor = n;
				}
			} while (n >= 0);
		}
		sc.close();
		System.out.printf("O maior valor digitado foi: "+maior+" e o menor valor foi: "+menor);
	}
}
