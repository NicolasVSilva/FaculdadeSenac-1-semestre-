//Lista de exercicios feita em casa para entrega
package Aula04;

import java.util.Scanner;

public class Aula04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//========================================================
		
		double n1, n2, result;
		System.out.println("Insira dois numeros: ");
		n1 = s.nextDouble();
		n2 = s.nextDouble();
		System.out.printf("O produto entre ambos é: %.1f\n\n", (n1 * n2));
		
		//========================================================

		result = Math.pow(n1, n2);
		System.out.printf("%.1f ^ %.1f = %.1f\n", n1, n2, result);
		System.out.printf("%.1f ^ %.1f = %.1f\n\n", n2, n1, Math.pow(n2, n1));
		
		//========================================================

		System.out.printf("A soma entre os quadrados de %.1f e %.1f = %.2f\n\n", n1, n2, (Math.pow(n1, 2) + Math.pow(n2, 2)));
		
		//========================================================

		System.out.printf("%.1f...%.1f e %.1f...%.1f\n\n", n1, (n1 + 1), n2, (n2 + 1));
		
		//========================================================

		System.out.printf("Para o quadrado de lado %.1f, a area é %.1f\n", n1, Math.pow(n1, 2));
		System.out.printf("Para o quadrado de lado %.1f, a area é %.1f\n\n", n2, Math.pow(n2, 2));
		
		//========================================================

		System.out.println("Digite 3 numeros: ");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		System.out.printf("A area do triangulo retangulo de base %.1f e altura %.1f é: %.2f\n", a, c, ((a * c) / 2));
		System.out.printf("A area do circulo cujo raio é %.1f, é igual a: %.2f\n", c, (Math.pow(c, 2) * 3.14159));
		System.out.printf("A area do trapezio de bases %.1f e %.1f com altura %.1f é: %.2f\n", a, b, c,(((a + b) * c)) / 2);
		System.out.printf("A area do quadrado de lado %.1f é: %.1f\n", b, b * b);
		System.out.printf("A area do retangulo de lados %.1f e %.1f é: %.1f\n", a, b, a * b);
		System.out.printf("O perimetro do retangulo de lados %.1f e %.1f é: %.1f\n\n", a, b, (a * 2) + (b * 2));
		System.out.println("Digite os lados de um triangulo retangulo: ");
		
		//========================================================

		double l1 = s.nextDouble();
		double l2 = s.nextDouble();
		System.out.printf("A hipotenusa do triangulo retangulo é: %.1f\n\n",Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2)));
		
		//========================================================

		System.out.println("Digite 4 numeros: ");
		double s1 = s.nextDouble();
		double s2 = s.nextDouble();
		double s3 = s.nextDouble();
		double s4 = s.nextDouble();
		System.out.printf("A media aritimetica é: %.1f\n\n", (s1 + s2 + s3 + s4) / 4);
		
		//========================================================

		System.out.println("Digite seu numero de usuario: \nA quantidade de horas trabalhadas: \nE o valor/hora recebido: ");
		int id = s.nextInt();
		double hrs = s.nextDouble();
		double vh = s.nextDouble();
		System.out.printf("Para o fucionario %d, o valor de salario é: %.1f\n\n", id, (hrs * vh));
		
		//========================================================

		System.out.println("Digite seu nome: \nInsira seu salario: \nInsira o total de vendas em dinheiro: ");
		String nome = s.next();
		double sal = s.nextDouble();
		double vend = s.nextDouble();
		System.out.printf("O funcionario: '%s' tem o total de %.1f como salario pendente.\n\n", nome, sal + ((vend / 100) * 15));
		
		//========================================================

		System.out.println("Digite um numero inteiro: ");
		int neg = s.nextInt();
		if (neg < 0) {
			System.out.println("O numero é negativo ;-;\n");
		} else {
			System.out.println("O numero é positivo =-=\n");
		}
		
		//========================================================
	}
}