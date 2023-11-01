//Exercicio feito em aula
package Aula05;

import java.util.Scanner;

public class Exp03 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);

		int leitura, somaI = 0, somaP = 0, rep = 10;
		
		for(int i = 1; i <= rep; i++) {
			System.out.println("Digite um numero: ");
			leitura = s.nextInt();
			
			if(leitura%2 == 0) {
				somaP += leitura;
			}else {
				somaI += leitura;
			}
		}
		
		System.out.println("A soma dos numeros impares é: "+somaI);
		System.out.println("A soma dos numeros pares é: "+somaP);
		s.close();
	}
}
