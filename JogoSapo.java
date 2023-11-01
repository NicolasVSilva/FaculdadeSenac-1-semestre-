//Exercicio feito em casa, baseado em atividade proposta pela Apple Developer Academy 
package Aula07;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int altPulo, canos, n = 1, nCano, mCano, salt, win = 0;
		
		System.out.println("\t\t\tBem vindo ao 'Pula Sapo'");
		System.out.println("\tAs regras são as seguintes, você deve atribuir um valor para a altura que nosso sapo consegue pular, na sequencia definir e um numero de canos, e a partir disso o jogo irá começar.\n\tDurante o decorrer do jogo você deverá atribuir um valor de altura para cada cano, e nosso sistema vai dizer se o sapo conseguiu ou não pular.");
		System.out.println("Para começar digite a altura do pulo do nosso sapo: ");
		altPulo = sc.nextInt();
		
		System.out.println("Agora digite o numero de canos: ");
		canos = sc.nextInt();
		
		System.out.println("Bem, agora podemos podemos começar: ");
		
		System.out.println("Qual a altura do "+n+"º cano?");
		nCano = sc.nextInt();
		
		mCano = nCano;
		n++;
		do {
			System.out.println("Qual a altura do "+n+"º cano?");
			nCano = sc.nextInt();
			
			salt = Math.abs(mCano-nCano);
			if(salt>altPulo){
				win = 1;
				n+=canos;
			}else {
				mCano = nCano;
				n++;
			}
		}while(n<=canos);
		
		if(win==0) {
			System.out.println("Good game\nGG Win");
		}else {
			System.out.println("Game Over ;-;");
			if(nCano>mCano) {
				System.out.println("O sapo bateu a cabeça");
			}else {
				System.out.println("O sapo quebrou as pernas");
			}
		}
		sc.close();
	}
}
