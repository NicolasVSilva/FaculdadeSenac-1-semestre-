//Exercicio feito em aula
package Aula06;

public class ExemploDoWhile {
	public static void main(String[] args) {
		int i = 0, j = 10;

		do {
			System.out.println(i + " eh menor " + j);
			i++;
			j--;
		} while (i < j);
	}
}
