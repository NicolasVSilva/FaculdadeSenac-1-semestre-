//Exercicio feito em aula
package aula03;

import java.util.Scanner;

public class atvEx04 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Digite 3 numeros randomicos: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if(n1>n2) {
			if(n1<n3) {
				System.out.println("O numero "+n3+" é o maior, enquanto o "+n2+" é o menor");
			}else if(n2>n3){
				System.out.println("O numero "+n1+" é o maior, enquanto o "+n3+" é o menor");
			}else {
				System.out.println("O numero "+n1+" é o maior, enquanto o "+n2+" é o menor");
			}
		}else if(n2>n3) {
			if(n3>n1) {
				System.out.println("O numero "+n2+" é o maior, enquanto o "+n1+" é o menor");
			}else {
				System.out.println("O numero "+n2+" é o maior, enquanto o "+n3+" é o menor");
			}
		}else {
			System.out.println("O numero "+n3+" é o maior, enquanto o "+n1+" é o menor");
		}
	}
}
