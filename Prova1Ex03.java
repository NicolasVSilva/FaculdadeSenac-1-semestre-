// Exercicio de prova
/*
 * Nicolas Vieira Silva
 * Guilherme Domiciano de Viveiros
 */

package Prova1;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//declarando variavel
		double salb, ir=0, tot;
		int escolha = 0;
		
		do {
			//recebendo dados
			System.out.println("Insira o valor de seu salario: ");
			salb = sc.nextDouble();
			tot = salb;
			
			//processando dados
			if(salb > 1903.98 && salb<=2826.65) {
				ir = (salb/100)*7.5;				//tirando porcentagem
				tot = salb - ir;					//descontando valor
			}else if(salb > 2826.65 && salb<=3751.05) {
				ir = (salb/100)*15;					//tirando porcentagem
				tot = salb - ir;					//descontando valor
			}else if(salb > 3751.05 && salb<=4664.68) {
				ir = (salb/100)*22.5;				//tirando porcentagem
				tot = salb - ir;					//descontando valor
			}else if(salb > 4664.68) {				
				ir = (salb/100)*27.5;				//tirando porcentagem
				tot = salb - ir;					//descontando valor
			}
			
			//exibindo dados processados
			System.out.println("Salario bruto: "+salb);
			System.out.printf("Salario liquido: %.2f\n",tot);
			System.out.printf("Alíquota: %.2f\n\n\n",ir);
			
			//recebendo dados do usuario
			System.out.println("Deseja consultar novamente? ");
			System.out.println("1-Sim\n2-Não");
			escolha = sc.nextInt();
		}while(escolha == 1);
		sc.close();
	}
}
