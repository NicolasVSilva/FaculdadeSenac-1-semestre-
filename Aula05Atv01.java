//Exercicio feito em aula
package Aula05;

import java.util.Scanner;

public class Exp01 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite os valores de inicio e fim");
		System.out.println("Inicio: ");
		int inicio = s.nextInt();
		
		System.out.println("Fim: ");
		int fim = s.nextInt();
		
		for(int i = inicio; i < fim; i++) {
			if(i%2 == 0) {
				System.out.println("I: "+i);				
			}
		}
		s.close();
	}
}
