//Exercicio feito em aula
package Aula06;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inicio: ");
		int i = s.nextInt();
		System.out.println("Fim: ");
		int f = s.nextInt();
		
		if(i<f) {
			while(i<=f) {
				if(i%2==0) {
					System.out.println("I = "+ i);
				}
				i++;
			}
		}else {
			while(f<=i) {
				if(f%2 != 0) {
					System.out.println("F = "+f);
				}
				f++;
			}
		}
		s.close();
	}	
}
