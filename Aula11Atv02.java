package Aula11;

import java.util.Scanner;

public class Ex02 {
	public static int[] tamanhoMatrix(){
		Scanner scanner = new Scanner(System.in);

		int[] tamanho = new int[2];
		
		System.out.println("Qual numero de linhas?");
		tamanho[0] = scanner.nextInt();
		System.out.println("Qual numero de colunas?");
		tamanho[1] = scanner.nextInt();
		
		return tamanho;
	}
	
	public static int[][] criarMatrix(int[] vetor){
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix = new int[vetor[0]][vetor[1]];
		
		for(int l=0;l<matrix.length;l++) {
			for(int c=0;c<matrix[l].length;c++) {
				System.out.printf("matrix[%d][%d] = \n", l, c);
				matrix[l][c] = scanner.nextInt();
			}
		}
		
		return matrix;
	}
	
	public static void exibeMatrix(int[][] matrix){
		for(int l=0;l<matrix.length;l++) {
			for(int c=0;c<matrix[l].length;c++) {
				System.out.printf("matrix[%d][%d] = %d\n", l, c, matrix[l][c]);
				
			}
		}
	}
	
	public static int obtem(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int i = scanner.nextInt();
		
		return i;
	}
	
	public static int verificaOcorrencia(int ocorrre, int[][] matrix){
		int verifica=0;
		for(int l=0;l<matrix.length;l++) {
			for(int c=0;c<matrix[l].length;c++) {
				
				if(matrix[l][c]==ocorrre) {
					verifica++;
				}
				
			}
		}
		return verifica;
	}
	
	public static void exibeOcorrencia(int ocorre, int quant) {
		System.out.printf("O numero %d aparece %d vezes na matriz\n", ocorre, quant);
		
		if(ocorre > 0) {
			System.out.printf("O numero %d está contido na matrix\n", ocorre);
		}else {
			System.out.printf("O numero %d não esta contido na matrix\n", ocorre);
		}
		
	}
	
	public static void main(String[] args) {
		int[] t = tamanhoMatrix();
		int[][] m = criarMatrix(t);
		exibeMatrix(m);
		
		int o = obtem();
		exibeOcorrencia(o, verificaOcorrencia(o, m));
	}
}
