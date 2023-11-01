//Ecercicio feito em aula
package Aula05;

import java.util.Scanner;

public class Exp02 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		
		int l1, n1 = 0, quant = 5;
		
		for(int i =0; i < quant; i++) {
			System.out.println("Digite um numero: ");
			l1 = s.nextInt();
			n1 += l1;
		}
		
		System.out.println("A soma dos numeros digitados é: "+n1);
		s.close();
	}
}
