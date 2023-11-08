/*Projeto Integrador 
 * Guilherme
 * Lucas
 * Luiz
 * Nicolas
 * Patrick
 * Railan
 * 
 * 08/11/23
 * vesão:0.3
 */

package codpi;

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
		Scanner sc = new Scanner(System.in);
		
		String lista[] = new String[4]; // ID-NOME-QUANT-VAL
		
		double codigosP[][] = new double[100][3]; // l-c l=produtos c=id-val-quant
		String nomeP[][] = new String[100][2]; // l-c l=produtos c=id-nome
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
				op = sc.nextInt();

				switch (op) {
				case 1:
					lista = adicionarP(codigosP, nomeP, indice);

					if (indice != Integer.parseInt(lista[0])) {
						indice = Integer.parseInt(lista[0]);
						nomeP[indice][1] = lista[1];
					}
					break;
				case 2:
					op = retirarP(codigosP, nomeP, indice);
					
					if(op!=0) {
						codigosP[op][0] = 0;
						codigosP[op][1] = 0;
						codigosP[op][2] = 0;
						
						nomeP[op][0] = " ";
						nomeP[op][1] = " ";
					}
					break;
				case 3:
					codigosP = adcEstoqueP(codigosP, nomeP, indice);
					break;
				case 4:
					retEstoqueP(codigosP, nomeP, indice);
					break;
				case 5:
					consultaE(codigosP, nomeP, indice);
					break;
				case 6:
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
				op = sc.nextInt();

				switch (op) {
				case 1:
					consultaE(codigosP, nomeP, indice);
					break;
				case 2:
					retEstoqueP(codigosP, nomeP, indice);
					break;
				case 3:
					break;
				default:
					System.out.println("Codigo invalido");
				}

			} while (op != 3);
		}

	}

	public static String[] adicionarP(double[][] codigosP, String[][] nomeP, int indice) {
		String lista[] = new String[4];
		String nome;
		int op = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o nome do produto: ");
		nome = sc.nextLine();

		for (int i = 0; i < indice; i++) {
			if (nomeP[i][1].equals(nome)) {
				System.out.printf("Produto já existente: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
				op = 1;
			}
		}

		if (op == 0) {
			nomeP[indice][0] = Integer.toString(indice);
			codigosP[indice][0] = indice;
			nomeP[indice][1] = nome;

			indice++;
			System.out.println("Produto adicionado com sucesso\n");

			lista[1] = nome;
		}
		lista[0] = Integer.toString(indice);

		return lista;
	}

	public static int retirarP(double[][] codigosP, String[][] nomeP, int indice) {
		String nome;
		char op;
		int confirma = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o nome do produto: ");
		nome = sc.nextLine();

		for (int i = 0; i < indice; i++) {
			if (nomeP[i][1].equals(nome)) {
				System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
				
				System.out.println("Deseja realmente removelo?(S/N) ");
				op = sc.next().charAt(0);
				
				if(op=='S'||op=='s') {
					confirma = i;
					
					System.out.println("Produto removido com sucesso\n");
					return confirma;
				}else {
					System.out.println("Produto mantido em estoque\n");
				}
			}
		}
		
		if(confirma==0) {
			System.out.println("Produto não encontrado\n");
		}
		
		return confirma;
	}

	public static double[][] adcEstoqueP(double[][] codigosP, String[][] nomeP, int indice) {
		Scanner sc = new Scanner(System.in);
		
		int escolha =1, id, op=0;
		String nome;
		
		do {
			if(escolha!=1&&escolha!=2) {
				System.out.println("Codigo de escolha invalidao");
			}
			
			System.out.println("Deseja buscar o produto pelo ID ou pelo NOME?(1/2)");
			System.out.println("1 -ID\n2 -NOME");
			escolha = sc.nextInt();
		}while(escolha<1||escolha>2);
		if(escolha==1) {
			System.out.println("Digite o id do produto: ");
			id = sc.nextInt();
			
			for(int i=0;i<indice;i++){
				if(nomeP[i][0].equals(Integer.toString(id))){
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
					System.out.println("Qual quantidade deseja adicionar?");
					codigosP[i][1] = sc.nextDouble();

					System.out.println("Qual valor do produto?");
					codigosP[i][2] = sc.nextDouble();
					op=1;
				}
			}
			if(op==0){
				System.out.println("Produto não encontrado\n");
			}
		}else {
			System.out.println("Digite o nome do produto desejado: ");
			nome = sc.nextLine();

			for(int i=0;i<indice;i++){
				if(nomeP[i][1].equals(nome)){
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
					System.out.println("Qual quantidade deseja adicionar?");
					codigosP[i][1] = sc.nextDouble();

					System.out.println("Qual valor do produto?");
					codigosP[i][2] = sc.nextDouble();
					op=1;
				}
			}
			if(op==0){
				System.out.println("Produto não encontrado\n");
			}
		}
		return codigosP;
	}

	public static double[][] retEstoqueP(double[][] codigosP, String[][] nomeP, int indice) {
		Scanner sc = new Scanner(System.in);

		double quant;
		int escolha =1, id, op=0;
		String nome;
		
		do {
			if(escolha!=1&&escolha!=2) {
				System.out.println("Codigo de escolha invalidao");
			}
			
			System.out.println("Deseja buscar o produto pelo ID ou pelo NOME?(1/2)");
			System.out.println("1 -ID\n2 -NOME");
			escolha = sc.nextInt();
		}while(escolha<1||escolha>2);
		if(escolha==1) {
			System.out.println("Digite o id do produto: ");
			id = sc.nextInt();
			
			for(int i=0;i<indice;i++){
				if(nomeP[i][0].equals(Integer.toString(id))){
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
					System.out.println("Qual quantidade deseja retirar?");
					quant = sc.nextDouble();

					if(codigosP[i][1]<quant){
						System.out.println("Quantidade desejada superior ao existente em estoque");
					}else{
						codigosP[i][1] = codigosP[i][1] - quant;
						System.out.println("Quantia retirada com sucesso, estoque restante: "+codigosP[i][1]);
					}
					op=1;
				}
			}
			if(op==0){
				System.out.println("Produto não encontrado\n");
			}
		}else{
			System.out.println("Digite o nome do produto desejado: ");
			nome = sc.nextLine();

			for(int i=0;i<indice;i++){
				if(nomeP[i][1].equals(nome)){
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
					System.out.println("Qual quantidade deseja retirar?");
					quant = sc.nextDouble();

					if(codigosP[i][1]<quant){
						System.out.println("Quantidade desejada superior ao existente em estoque");
					}else{
						codigosP[i][1] = codigosP[i][1] - quant;
						System.out.println("Quantia retirada com sucesso, estoque restante: "+codigosP[i][1]);
					}
					op=1;
				}
			}
			if(op==0){
				System.out.println("Produto não encontrado\n");
			}
		}
		return codigosP;
	}

	public static void consultaE(double[][] codigosP, String[][] nomeP, int indice) {
		System.out.println("Lista de Produtos: ");

		for(int i=0;i<indice;i++){
			System.out.printf("ID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
		}
	}

}

/*
 * https://acervolima.com/retornando-varios-valores-em-java/
 * https://codegym.cc/pt/groups/posts/pt.149.como-converter-int-para-string-em-java
 * https://codegym.cc/groups/posts/string-to-int-java
 */
