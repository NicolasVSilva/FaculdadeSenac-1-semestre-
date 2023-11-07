package CODPI;

import java.util.Scanner;

public class codpi {

	public static void main(String[] args) {
		int fun = acesso();
		menu(fun);
	}

	public static int acesso() {
		Scanner sc = new Scanner(System.in);
		int cl, op = 0;
		do {
			if (op > 0) {
				System.out.println("Opção invalida\n\n");
			}
			System.out.println("Deseja acessar como funcionario ou cliente?(1/2)");
			System.out.println("1 -Funcionario\n2 -Cliente");
			cl = sc.nextInt();
			System.out.println("\n");
			op++;
		} while (cl < 1 || cl > 2);

		if (cl == 1) {
			op = 0;
		} else {
			op = 1;
		}
		return op;
	}

	public static void menu(int fun) {
		double codigosP[][] = new double[2][3];
		String nomeP[] = new String[100];
		int indice = 0, op = 0;

		if (fun == 0) {
			do {
				System.out.println("Bem vindo - Funcionario\nOque deseja fazer?(digite o numero da opção desejada)\n");
				System.out.println("1 -Adicionar produto");
				System.out.println("2 -Retirar produto");
				System.out.println("3 -Adicionar ao estoque");
				System.out.println("4 -Retirar do estoque");
				System.out.println("5 -Consultar estoque");
				System.out.println("6 -Finalizar progama");

				switch (op) {
				case 1:
					adicionarP();
					break;
				case 2:
					retirarP();
					break;
				case 3:
					adcEstoqueP();
					break;
				case 4:
					retEstoqueP();
					break;
				case 5:
					consultaE();
					break;
				default:
					System.out.println("Codigo invalido");
					break;

				}

			} while (op != 6);
		} else {
			do {
				System.out.println("Bem vindo - Cliente\nOque deseja fazer?(digite o numero da opção desejada)\n");
				System.out.println("1 -Consultar estoque");
				System.out.println("2 -Comprar produto");
				System.out.println("3 -Encerrar sessão");

				switch (op) {
				case 1:
					consultaE();
					break;
				case 2:
					retEstoqueP();
					break;
				default:
					System.out.println("Codigo invalido");
				}

			} while (op != 3);
		}

	}

	public static void adicionarP() {

	}

	public static void retirarP() {

	}

	public static void adcEstoqueP() {

	}

	public static void retEstoqueP() {

	}

	public static void consultaE() {

	}

}