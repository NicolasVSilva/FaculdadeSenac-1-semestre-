/*
 * Nicolas Vieira Silva
 * Lucas Medeiros de Holanda
 */

package Aula13;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class Prova02 {

	public static int[] periodo() {
		System.out.println("**PERIODO**");
		Scanner scanner = new Scanner(System.in);

		int[] periodo = new int[2];

		System.out.println("Quantas semanas serão analizadas?: ");
		periodo[0] = scanner.nextInt();
		System.out.println("Quantos dias por semana?: ");
		periodo[1] = scanner.nextInt();

		return periodo;
	}

	public static double[][] temperaturas(int[] periodo) {
		System.out.println("**TEMPERATURAS**");
		Scanner scanner = new Scanner(System.in);

		double[][] temperaturas = new double[periodo[0]][periodo[1]];

		for (int l = 0; l < periodo[0]; l++) {
			for (int c = 0; c < periodo[1]; c++) {
				System.out.printf("Qual a temperatura do dia %d da semana %d?:\n", (c+1), (l+1));
				temperaturas[l][c] = scanner.nextDouble();
			}
		}

		return temperaturas;
	}

	public static double[] MaiorMenor(double[][] temperaturas) {
		System.out.println("**MAMIORMENOR**");
		double[] maiorMenor = new double[2];

		maiorMenor[0] = temperaturas[0][0];
		maiorMenor[1] = temperaturas[0][0];

		for (int l = 0; l < temperaturas.length; l++) {
			for (int c = 0; c < temperaturas[l].length; c++) {
				if (temperaturas[l][c] < maiorMenor[0]) {
					maiorMenor[0] = temperaturas[l][c];
				} // não utilizamos o 'else if' por esolha de equipe
				if (temperaturas[l][c] > maiorMenor[1]) {
					maiorMenor[1] = temperaturas[l][c];
				}
			}
		}

		return maiorMenor;
	}

	public static double[] Negativas(double[][] temperaturas) {
		System.out.println("**NEGATIVAS**");
		int quant = 0;

		for (int l = 0; l < temperaturas.length; l++) {
			for (int c = 0; c < temperaturas[l].length; c++) {
				if (temperaturas[l][c] < 0) {
					quant++;
				}
			}
		}

		double[] negativas = new double[quant];
		int index = 0;

		for (int l = 0; l < temperaturas.length; l++) {
			for (int c = 0; c < temperaturas[l].length; c++) {
				if (temperaturas[l][c] < 0) {
					negativas[index] = temperaturas[l][c];
					index++;
				}
			}
		}

		return negativas;
	}

	public static double media(double[][] temperaturas, int[] periodo) {
		System.out.println("**MEDIA**");
		double media, soma = 0;

		for (int l = 0; l < temperaturas.length; l++) {
			for (int c = 0; c < temperaturas[l].length; c++) {
				soma += temperaturas[l][c];
			}
		}

		media = soma / (periodo[0] * periodo[1]);

		return media;
	}

	public static void imprimir(double[][] temperaturas, double[] maiorMenor, double[] negativas, double media) {

		System.out.println("Matriz de temperatura: ");
		for (int l = 0; l < temperaturas.length; l++) {
			for (int c = 0; c < temperaturas[l].length; c++) {
				System.out.printf("%.2f\t" , temperaturas[l][c]);
			}
			System.out.println(""); // pulando linha
		}

		System.out.println("Maior: " + maiorMenor[1] + " Menor: " + maiorMenor[0]);

		System.out.printf("A media de temperatura é: %.2f\n" , media);

		for (int i = 0; i < negativas.length; i++) {
			System.out.println("Negativas: " + negativas[i]);
		}
	}

	public static void main(String[] args) {
		int[] periodo = periodo();
		double[][] temperaturas = temperaturas(periodo);
		double[] maiorMenor = MaiorMenor(temperaturas);
		double[] negativas = Negativas(temperaturas);
		double media = media(temperaturas, periodo);
		imprimir(temperaturas, maiorMenor, negativas, media);
	}
}
