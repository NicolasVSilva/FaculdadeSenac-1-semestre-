// Exercicio feito em aula
package Aula02;

import java.util.Scanner;

public class atv_02 {
	public static void main(String[] args) {
		Scanner imput=new Scanner(System.in);
		
		//========================================================================================
	
		int anoAtual = 2023;
		System.out.println("Digite o ano de nascimento: ");
		
		int anoNasc = imput.nextInt();
		
		if((anoAtual - anoNasc) >= 18) {
			System.out.printf("Você é maior de idade: %d",(anoAtual-anoNasc));
		}else {
			System.out.printf("Você é dMenor ==> %d",(anoAtual-anoNasc));
		}
		
		//========================================================================================
	
		//Escreva um programa que mostre na tela o seu nome, seu endereço e email, como segue:
		//Centro Universitário Senac
		//Av. Eng. Eusébio Stevaux, 823 - Santo Amaro - São Paulo
		//fernando.lalmeida@sp.senac.br
		 
		String nome = "Nicolas VSilva", endereco = "AV. Leitão", email = "nvs.silva";
		
		System.out.printf("%s\n%s\n%s", nome, endereco, email);
		
		String nome1 = "Nicolas", aux = "Lol";
		System.out.printf("hello %s, c joga %s, kjkjkj", nome1, aux);
		
		//=================================================================================
		
		//Especificador Formato: 
		//%s String de caracteres
		//%d Número inteiro decimal
		//%u Número inteiro decimal sem sinal
		//%f Float
		//%2f Double
		//%b Boolean
		//%c Caractere (char)
	}
}
