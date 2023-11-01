//Exercicio feito em aula
package Aula06;

import java.util.Scanner;

public class ExemploBreak {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int i=0, soma=0, x;
		
		while(i<10){
			System.out.println("Digite um numero: ");
			x = s.nextInt();
			
			if(x>=0){
				soma = soma + x;
				i++;
			}else{
				System.out.println("Numero invalido");
				break;
			}
		}
		System.out.println("A soma é: "+soma);

		s.close();
	}
}
