package Aula12;

import java.util.Scanner;

public class Ex01 {
	public static int[] tamanho() {
		System.out.println("\nTAMANHO");
		Scanner scanner = new Scanner(System.in);
		
		int[] t = new int[2];
		System.out.println("Quantas linhas temos em nossa matriz?");
		t[0] = scanner.nextInt();
		System.out.println("Quantas colunas temos em nossa matriz?");
		t[1] = scanner.nextInt();
		
		return t;
	}
	
	public static int[][] criaMatriz(int[] t) {
		System.out.println("\nCRIA_MATRIZ");
		int[][] m = new int[t[0]][t[1]];
		for(int i=0;i<m.length;i++) {
			for(int l=0;l<m[i].length;l++) {
				m[i][l] = (int) (Math.random()*10);
			}
		}
		
		return m;
	}
	
	public static void exibeMatrix(int[][]m) {
		System.out.println("\nEXIBE_MATRIZ");
		int a=0;
		for(int i=0;i<m.length;i++) {
			for(int l=0;l<m[i].length;l++) {
				if(a==m[l].length) {
					System.out.println("");
					a=0;
				}
				System.out.printf("Matriz[%d][%d]: %d  ", i, l, m[i][l]);
				a++;
			}
		}
	}
	
	public static int somatoria(int[][]m) {
		System.out.println("\n\nSOMATORIA");
		int s=0;
		for(int i=0;i<m.length;i++) {
			for(int l=0;l<m[i].length;l++) {
				s+= m[i][l];
			}
		}
		return s;
	}
	
	public static double media(int[] t, int s) {
		System.out.println("\nMEDIA");
		double M = (double) s/(t[0]*t[1]);
		return M;
	}
	
	public static void exibe(int s, double M, int[]m) {
		System.out.println("\nEXIBE");
		System.out.println("A somatoria é: "+s);
		System.out.printf("A media é %.2f\n: ",M);
		
		for(int i=0;i<m.length;i++) {
			System.out.println("Os multiplos de 5 são: "+m[i]);
		}
	}
	
	
	public static int[] separar(int[][] m) {
		System.out.println("SEPARAR");
		int s=0;
		for(int i=0;i<m.length;i++) {
			for(int l=0;l<m[i].length;l++) {
				if(m[i][l]%5==0) {
					s++;
				}
			}
		}
		
		int[] mult5 = new int[s];
		int cont=0;
		
		for(int i=0;i<m.length;i++) {
			for(int l=0;l<m[i].length;l++) {
				if(m[i][l]%5==0) {
					mult5[cont] = m[i][l];
					cont++;
				}
			}
		}
		return mult5;
	}
	
	public static void main(String[] args) {
		System.out.println("MAIN");
		int[] t = tamanho();
		int[][] m = criaMatriz(t);
		exibeMatrix(m);
		int s = somatoria(m);
		double M = media(t, s);
		int[] mult5 = separar(m);
		exibe(s, M, mult5);
		/*
		int[]vetor = {1,2,3,4,5,6,7,8,9};
		
		int[][]Matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int i=0; i<vetor.length;i++) {
			System.out.printf("Vetor[%d]: %d\n", i, vetor[i]);
		}
		
		for(int i =0;i<Matriz.length;i++) {
			for(int j =0;j<Matriz[i].length;j++) {
				System.out.printf("Matriz[%d][%d]: %d\n", i, j, Matriz[i][j]);
			}
		}
		*/
	}
}

/*
Escreva um progama em java que crie uma matriz de n linhas por n
colunas(o usuario escolhe) 

Imprimir a matriz(em formato matriz)

soma de todos elementos matriz

calcular media da matriz

crie uma função para separar os elementos(crie um criterio)
*/