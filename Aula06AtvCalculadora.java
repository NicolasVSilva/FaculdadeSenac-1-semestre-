//Exercicio feito em aula, calculadora basica
package Aula06;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double result = 0;
		int op;
		do {
			System.out.println("_____________________");
			System.out.println("=====================");
			System.out.println("=/***Calculadora***/=");
			System.out.println("=====================\n");
			System.out.println("   1 +   ou   3 -");
			System.out.println("   2 *   ou   4 /\n\n");
			System.out.print("\t:");

			op = s.nextInt();

			if (op < 1 || op > 4) {
				System.out.println("Operação invalida");
			}
		} while (op < 1 || op > 4);

		System.out.println("Digite os valores para operação: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();

		switch (op) {
		case 1:
			result = n1 + n2;
			break;
		case 2:
			result = n1 * n2;
			break;
		case 3:
			result = n1 - n2;
			break;
		case 4:
			result = n1 / n2;
			break;
		}
		System.out.printf("O resultado da operação é: %.1f", result);

		s.close();
	}
}
