/*Projeto Integrador 
 * Guilherme
 * Lucas
 * Luiz
 * Nicolas
 * Patrick
 * Railan
 * Pedro
 * 
 * 24/11/23
 * vesão:0.7 
 */

package codpi;

import java.util.Scanner;

public class codpi {

	public static void main(String[] args) {
		int fun = login();		//define se o usuario acessa como funcionario ou cliente
		menu(fun);			//acessa o menu geral
	}

	public static int login() {		//ainda pretendo separar esse codigo em pequenas funções
		Scanner sc = new Scanner(System.in);
		int op = 0, fun = 0, usery = 0;
		String login = "1", nome, senha1, senha;
		String[][] user = new String[20][2];
		
		for(int i=0;i<user.length;i++) {
			for(int l=0;l<2;l++) {
				user[i][l]="NULL";
			}
		}

		do {
			do {
				usery=0;
				System.out.println("O que deseja fazer? (1/2)");
				System.out.println("1 - Login\n2 - Cadastro");
				login = sc.nextLine();

				if (!login.equals("1") && !login.equals("2")) {
					if (!login.matches("\\d+")) {
						System.out.println("Digite apenas numeros para a opcao 'Login'!");
					} else {
						System.out.println("Opcao invalida");
					}
				} else if ((login.equals("1") || login.equals("2")) && !login.matches("\\d+")) {
					System.out.println("Digite apenas numeros para a opcao 'Login'!");
				} else {
					op = Integer.parseInt(login);
				}
			} while (op < 1 || op > 2);


			if (login.equals("1")) {
				do {
					usery=0;
					do {
						System.out.println("Digite o usuario:");
						nome = sc.nextLine();
						if (!nome.matches("\\w+")) {
							System.out.println("Nomes de usuario possuem apenas letras e numeros.");
						} else {
							op = 2;
						}
					} while (op != 2);

					for (int i = 0; i < user.length; i++) {
						if (user[i][0].equals(nome)) {
							for (int l = 0; l < 3; l++) {

								do {
									System.out.println("Digite a senha:");
									senha = sc.nextLine();
									if (!senha.matches("\\d+")) {
										System.out.println("As senhas contem apenas numeros!");
									}
								} while (!senha.matches("\\d+"));

								if (user[i][1].equals(senha)) {
									op = 5;
									System.out.println("Acesso liberado");
									if(senha.equals("0206")) {
										fun = 0;
									}else {
										fun = 1;							
									}
									break;
								} else {
									System.out.println("Senha incorreta " + (2 - l) + " tentativas restantes.");
								}
							}

						} else {
							usery++;
						}
					}
					if(usery==user.length) {
						System.out.println("Usuario não encontrado");
						op=3;
					}
				}while (op == 2 && op!=5);
			} else {

				do {
					System.out.println("Digite o nome de usuario:(Apenas letras e numeros)");
					nome = sc.nextLine();
					if (!nome.matches("\\w+")) {
						System.out.println("Nomes de usuario devem conter apenas letras e numeros!");
					}
				} while (!nome.matches("\\w+"));

				do {
					System.out.println("Digite a senha:(Apenas numeros)");
					senha = sc.nextLine();
					if (!senha.matches("\\d+")) {
						System.out.println("Senhas contem apenas numeros!");
					}
				} while (!senha.matches("\\d+"));

				do {
					System.out.println("Confirme a senha:");
					senha1 = sc.nextLine();

					if (senha.equals(senha1)) {
						System.out.println("Cadastro feito com suscesso");
						
						for (int i = 0; i < user.length; i++) {
							if (user[i][0].equals("NULL")) {
								user[i][0] = nome;
								user[i][1] = senha;
								break;
							}
						}
						op=2;
					} else {
						System.out.println("Senhas incompativeis, confirme novamente!");
						op = 3;
					}
				} while (op != 2);
			}
		} while ((op==2 ||op==3) && op!=5);
		return fun;
	}
	public static void menu(int fun) {
		Scanner sc = new Scanner(System.in);
		
		String lista[] = new String[4]; // ID-NOME-QUANT-VAL   utilizada para controle das demais
		
		double codigosP[][] = new double[100][3]; // l-c l=produtos c=id-val-quant
		String nomeP[][] = new String[100][2], ops="0"; // l-c l=produtos c=id-nome
		int indice = 0, op = 0;

		do{
			if (fun == 0) {
				do {
					do{
						if(!ops.matches("\\d+")){
							System.out.println("digite o numero da opção desejada!!");
						}
						System.out.println("Bem vindo - Funcionario\nOque deseja fazer?\n");
						System.out.println("1 -Adicionar produto");	//cria um produto
						System.out.println("2 -Retirar produto");	//exclui um produto
						System.out.println("3 -Adicionar ao estoque");	//adiciona uma quantidade e atribui um valor ao produto
						System.out.println("4 -Retirar do estoque");	//retira quantidades ou o valor total do estoque de um produto
						System.out.println("5 -Consultar estoque");	//apresenta uma lista de todos os produtos existentem
						System.out.println("6 -Logar como cliente");	//troca para o menu do cliente
						System.out.println("7 -Finalizar progama");	//encerra 
						ops = sc.nextLine();
					}while(!ops.matches("\\d+"));

					op = Integer.parseInt(ops);
		
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
						
						if(op!=-1) {
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
						fun = 1;
						op = 7;
						break;
					case 7:
						fun = 3;
						System.out.println("Obrigado por utilizar nosso sistema!!");
						break;
					default:
						System.out.println("Codigo invalido");
						break;
					}
				} while (op != 7);
			} else {
				do {
					System.out.println("Bem vindo - Cliente\nOque deseja fazer?(digite o numero da opção desejada)\n");
					System.out.println("1 -Consultar estoque");	//apresenta uma lista de todos os produtos existentem
					System.out.println("2 -Comprar produto");	//retira quantidades ou o valor total do estoque de um produto
					System.out.println("3 -Encerrar sessão");	//encerra
					op = sc.nextInt();
	
					switch (op) {
					case 1:
						consultaE(codigosP, nomeP, indice);
						break;
					case 2:
						retEstoqueP(codigosP, nomeP, indice);
						break;
					case 3:
						fun = 3;
						break;
					default:
						System.out.println("Codigo invalido");
						break;
					}
				} while (op != 3);
			}
		}while(fun != 3 && (op != 3 || op != 7));
	}

	public static String[] adicionarP(double[][] codigosP, String[][] nomeP, int indice) {
		String lista[] = new String[4];
		String nome = "a";
		int op = 0;

		Scanner sc = new Scanner(System.in);

		do{
			if(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$")){
				System.out.println("Sem caracteres especiais");
			}
			System.out.println("Insira o nome do produto: ");
			nome = sc.nextLine();
		}while(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$"));

		for (int i = 0; i < indice; i++) { 		//mostra o produto caso já esteja cadastrado
			if (nomeP[i][1].equals(nome)) {
				System.out.printf("Produto já existente: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
				op = 1;
			}
		}

		if (op == 0) {					//adiciona o produto caso ele não exista
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
		String nome = "a";
		char op = 'S';
		int confirma = -1;
		Scanner sc = new Scanner(System.in);

		do{
			if(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$")){
				System.out.println("Sem caracteres especiais");
			}
			System.out.println("Insira o nome do produto: ");
			nome = sc.nextLine();
		}while(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$"));

		for (int i = 0; i < indice; i++) {				//mostra o produto cadastrado
			if (nomeP[i][1].equals(nome)) {
				System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);

				do{
					if(op != 'S'&& op!='s'&& op!='N'&& op!='n'){
						System.out.println("Apenas Letras!!");
					}
					System.out.println("Deseja realmente removelo?(S/N) ");
					op = sc.next().charAt(0);
				}while(op != 'S'&& op!='s'&& op!='N'&& op!='n');
				
				if(op=='S'||op=='s') {				//remove ou mantem um produto
					confirma = i;
					
					System.out.println("Produto removido com sucesso\n");
					return confirma;
				}else {
					confirma = i;
					System.out.println("Produto mantido em estoque\n");
				}
			}
		}
		
		if(confirma==-1) {						//avisa caso o produto não exista
			System.out.println("Produto não encontrado\n");
		}
		
		return confirma;
	}

	public static double[][] adcEstoqueP(double[][] codigosP, String[][] nomeP, int indice) {
		Scanner sc = new Scanner(System.in);
		
		int escolha =1, id, op=0;
		String nome="a", escolha1="0", id1="0", quant="0", val="0";

		do{
			do {
				if(!escolha1.matches("\\d+")) {
					System.out.println("Digite apenas numeros");
				}
				if(escolha != 1 && escolha != 2){
					System.out.println("Opção invalida");
				}
				
				System.out.println("Deseja buscar o produto pelo ID ou pelo NOME?(1/2)");		//tipo de busca
				System.out.println("1 -ID\n2 -NOME");
				escolha1 = sc.nextLine();
			}while(!escolha1.matches("\\d+"));
			
			escolha = Integer.parseInt(escolha1);
		}while(escolha != 1 && escolha != 2);
		
		if(escolha==1) {
			
			do{
				if(!id1.matches("\\d+")){
					System.out.println("Apenas Numeros!!");
				}
				System.out.println("Digite o id do produto: ");
				id1 = sc.nextLine();
			}while(!id1.matches("\\d+"));
			
			id = Integer.parseInt(id1);
			
			for(int i=0;i<indice;i++){
				if(nomeP[i][0].equals(Integer.toString(id))){					//sistema de busca
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
					do{
						if(!quant.matches("\\d+")){
							System.out.println("Apenas Numeros!!");
						}
						System.out.println("Qual quantidade deseja adicionar?");
						quant = sc.nextLine();
					}while(!quant.matches("\\d+"));

					codigosP[i][1] = Integer.parseInt(quant);

					do{
						if(!val.matches("^[0-9]+([,.][0-9]+)?$")){
							System.out.println("Apenas Numeros!!");
						}
						System.out.println("Qual valor do produto?");
						val = sc.nextLine();
					}while(!val.matches("^[0-9]+([,.][0-9]+)?$"));
					codigosP[i][2] = Double.parseDouble(val);
					op=1;
				}
			}
			if(op==0){
				System.out.println("Produto não encontrado\n");
			}
		}else {
			do{
				if(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$")){
					System.out.println("Sem caracteres especiais");
				}
				System.out.println("Digite o nome do produto desejado: ");
				nome = sc.nextLine();
			}while(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$"));

			for(int i=0;i<indice;i++){
				if(nomeP[i][1].equals(nome)){							//sistema de busca
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);

					
					do{
						if(!quant.matches("\\d+")){
							System.out.println("Apenas Numeros!!");
						}
						System.out.println("Qual quantidade deseja adicionar?");
						quant = sc.nextLine();
					}while(!quant.matches("\\d+"));

					codigosP[i][1] = Integer.parseInt(quant);

					do{
						if(!val.matches("^[0-9]+([,.][0-9]+)?$")){
							System.out.println("Apenas Numeros!!");
						}
						System.out.println("Qual valor do produto?");
						val = sc.nextLine();
					}while(!val.matches("^[0-9]+([,.][0-9]+)?$"));
					codigosP[i][2] = Double.parseDouble(val);
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
		String nome="a", escolha1="0", quant1="1", id1="0";
		
		do{
			do {
				if(!escolha1.matches("\\d+")) {
					System.out.println("Digite apenas numeros");
				}
				if(escolha != 1 && escolha != 2){
					System.out.println("Opção invalida");
				}
				
				System.out.println("Deseja buscar o produto pelo ID ou pelo NOME?(1/2)");		//tipo de busca
				System.out.println("1 -ID\n2 -NOME");
				escolha1 = sc.nextLine();
			}while(!escolha1.matches("\\d+"));
			
			escolha = Integer.parseInt(escolha1);
		}while(escolha != 1 && escolha != 2);
		
		if(escolha==1) {
			do{
				if(!id1.matches("\\d+")){
					System.out.println("Apenas Numeros!!");
				}
				System.out.println("Digite o id do produto: ");
				id1 = sc.nextLine();
			}while(!id1.matches("\\d+"));
			
			id = Integer.parseInt(id1);
			
			for(int i=0;i<indice;i++){
				if(nomeP[i][0].equals(Integer.toString(id))){
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);

					do{
						if(!quant1.matches(\\d+)){
							System.out.println("Apenas Numeros!!");
						}
						System.out.println("Qual quantidade deseja retirar?");
						quant1 = sc.nextLine();
					}while(!quant1.matches(\\d+));

					quant = Integer.parseInt(quant1);
					
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
			do{
				if(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$")){
					System.out.println("Sem caracteres especiais");
				}
				System.out.println("Digite o nome do produto desejado: ");
				nome = sc.nextLine();
			}while(!nome.matches("^[a-zA-ZÀ-ÖØ-öø-ÿ0-9 ]*$"));

			for(int i=0;i<indice;i++){
				if(nomeP[i][1].equals(nome)){
					System.out.printf("Produto cadastrado como: \nID:\t%s\nNOME:\t%s\nQUANT:\t%.2f\nVAL:\tR$%.2f\n", nomeP[i][0], nomeP[i][1], codigosP[i][1], codigosP[i][2]);
					
					do{
						if(!quant1.matches(\\d+)){
							System.out.println("Apenas Numeros!!");
						}
						System.out.println("Qual quantidade deseja retirar?");
						quant1 = sc.nextLine();
					}while(!quant1.matches(\\d+));

					quant = Integer.parseInt(quant1);

					if(codigosP[i][1]<quant){			//caso tente retirar mais doque o existente o progama não permite
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
