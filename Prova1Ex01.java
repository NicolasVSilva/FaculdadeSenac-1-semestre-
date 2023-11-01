// Exercicio de prova
/*
 * Nicolas Vieira Silva
 * Guilherme Domiciano de Viveiros
 */

package Prova1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		// Declaração de variavel
		int escolha;
		double valGas = 4.79, valEta = 3.65, tot = 0, litro, desc;
		
		//Recebendo dados do usuario
		System.out.println("Qual combustivel deseja utilizar?");
		System.out.println("===============\n1- Gasolina\n2- Etanol\n===============");
		escolha = sc.nextInt();
		System.out.println("Quantos litros deseja abastecer?");
		litro = sc.nextDouble();
		
		sc.close();
		
		//processando dados
		switch(escolha) {
		case 1:
			tot = litro * valGas;
			if(litro<=10) {
				desc = (tot / 100) * 5;		//tirando porcentagem
				tot = tot - desc;			//descontando valor
			}else {
				desc = (tot / 100) * 7;		//tirando porcentagem
				tot = tot - desc;			//descontando valor
			}
			break;
		case 2:
			tot = litro * valEta;
			if(litro>5) {
				desc = (tot / 100) * 10;	//tirando porcentagem
				tot = tot - desc;			//descontando valor
			}
			break;
		}
		System.out.printf("O valor a pagar é de: %.2f",tot);
	}
}
