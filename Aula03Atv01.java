//Exercicio feito em aula
package aula03;

import java.util.Scanner;

public class atvEx03 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int falt, n1, n2, ado, p1=4, p2=5, vAdo=1;
		float tot;
		
		System.out.println("Digite suas notas em ordem: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		ado = s.nextInt();
		System.out.println("Digite a quantidade de faltas: ");
		falt = s.nextInt();
		
		tot = ((n1*p1)+(n2*p2)+(ado*vAdo))/(p1+p2+vAdo);
		
		if(tot >= 7 && falt<=18) {
			System.out.println("Parabens, voce foi aprovado: \nnota:"+tot+"\nfaltas: "+falt);
		}else if(tot < 7 && falt <= 18) {
			char escolha;
			int subs;
			System.out.println("Voce foi reprovado por valor de nota: \nnota:"+tot+"\nfaltas: "+falt);
			System.out.println("Deseja fazer utilizar a nota da prova substitutiva? (A nota da subistitutiva será utilizada no lugar da prova de menor nota!)\n(responda com 's' ou 'n')");
			escolha = s.next().charAt(0);
			
			if(escolha == 's') {
				System.out.println("Digite a nota da prova substitutiva: ");
				subs = s.nextInt();
				if(n1 < subs) {
					tot = ((subs*p1)+(n2*p2)+(ado*vAdo))/(p1+p2+vAdo);
					if(tot>=7) {
						System.out.println("Parabens, voce foi aprovado: \nnota:"+tot+"\nfaltas: "+falt);
					}else {
						System.out.println("Voce foi reprovado por valor de nota: \nnota:"+tot+"\nfaltas: "+falt);
					}
				}else if(n2 < subs) {
					tot = ((n1*p1)+(subs*p2)+(ado*vAdo))/(p1+p2+vAdo);
					if(tot>=7) {
						System.out.println("Parabens, voce foi aprovado: \nnota:"+tot+"\nfaltas: "+falt);
					}else {
						System.out.println("Voce foi reprovado por valor de nota: \nnota:"+tot+"\nfaltas: "+falt);
					}
				}else {
					System.out.println("Ambas as provas tem nota maior que a substitutiva, Infelizmente voce será reprovado: \nNota 1: "+n1+"\nNota 2: "+n2);
				}
			}else {
				System.out.println("Voce foi reprovado por valor de nota: \nnota:"+tot+"\nfaltas: "+falt);
			}
		}else if(tot >= 7 && falt >18) {
			System.out.println("Voce foi reprovado por quantidade de faltas: nota:"+tot+"\nfaltas:"+falt);
		}else {
			System.out.println("Voce foi reprovado em ambos os criterios: nota:"+tot+"\nfaltas:"+falt);
		}
	}
}
