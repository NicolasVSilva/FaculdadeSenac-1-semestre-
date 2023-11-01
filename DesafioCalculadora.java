//Exercicio feito em aula e em casa, como um desafio para trabalhar com funções, int e char
//O codigo atual está incorreto, estou trabalhando para corrigi-lo
package Aula08;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		char op;
		int x, y;
		double result;

		x = ler();
		op = operacao();
		y = ler();

		result = resolucao(x, y, op);

		mostrar(result);
	}

	public static int ler() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int a = sc.nextInt();
		return a;
	}

	public static char operacao() {
		Scanner sc = new Scanner(System.in);
		char a;
		do {
			System.out.println("Digite a operação: ");
			System.out.println("1-Adição(+)\t3-Multiplicação(*)");
			System.out.println("2-Subtração(-)\t4-Divisão(/)");
			a = sc.nextLine().charAt(0);
		} while (a < 1 || a > 4);
		sc.close();
		return a;
	}

	public static double resolucao(int a, int b, char op) {
		int x = a, y = b;
		double result = 0;
		
		switch (op) {
		case 1:
		case 'A':
		case 'a':
		case '+':
			result = soma(x, y);
			break;
		case 2:
		case 'S':
		case 's':
		case '-':
			result = subtracao(x, y);
			break;
		case 3:
		case 'M':
		case 'm':
		case '*':
			result = multiplicacao(x, y);
			break;
		case 4:
		case 'D':
		case 'd':
		case '/':
			result = divisao(x, y);
			break;
		}

		return result;
	}
	
	public static double soma(int a, int b) {
		return (a+b);
	}
	
	public static double subtracao(int a, int b) {
		return (a-b);
	}
	
	public static double multiplicacao(int a, int b) {
		return (a*b);
	}
	
	public static double divisao(int a, int b) {
		return (a/b);
	}
	
	public static void mostrar(double result) {
		double a = result;
		System.out.println("O resultado da operação é: "+a);
	}
}

