//Exercicio feito em aula para aprender funções 
package Aula08;

import java.util.Scanner;

public class Aula08Funcao {

	public static void main(String[] args) {
		
		leitura();
		
	}

	public static void leitura() {
		Scanner sc=new Scanner(System.in);
		int x,y;
		
		System.out.println("Digite 2 numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		sc.close();
		
		minimo(x, y);
	}
	
	public static void minimo(int a, int b) {
		int min = 0;
		
		if(a<b) {
			min = a;
		}else {
			min = b;
		}
		
		mostrar(min);
	}
	
	static void mostrar(int a) {
		System.out.println("O menor numero é: "+a);
	}
}
