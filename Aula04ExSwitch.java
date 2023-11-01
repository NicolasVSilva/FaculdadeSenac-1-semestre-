//Exercicio feito em aula
package Aula04;

import java.util.Scanner;

public class Switch {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		
		for(int x=3; x>0; x--) {
		
			System.out.println("Digite suas notas: ");
			double n1 = s.nextDouble();
			double n2 = s.nextDouble();
			double media = (n1+n2)/2;
			char nota;
			if(media<=10 && media>=9) {
				nota = 'A';
			}else if(media<=8.9 && media>=8) {
				nota = 'B';
			}else if(media<=7.9 && media>=7) {
				nota = 'C';
			}else if(media<=6.9 && media>=6) {
				nota = 'D';
			}else if(media<5.9){
				nota = 'E';
			}else {
				nota = 'F';
			}
		
			switch(nota) {
			case'A':
				System.out.println("Muito bem");
				x = 0;
				break;
			case'B':
				System.out.println("Bom");
				x = 0;
				break;
			case'C':
				System.out.println("Regular");
				x = 0;
				break;
			case'D':
				System.out.println("Irregular");
				x = 0;
				break;
			case'E':
				System.out.println("Reprovado");
				x = 0;
				break;
			default:
				System.out.println("Nota Invalida");
			}
		}
		System.out.println("Numero de tentativas expiradas.");
	}
}
