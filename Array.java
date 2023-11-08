package Aula10;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int v[] = criaVetor(tamanho());
		somatorio(v);
		media(v);
		System.out.println(""+obtemElementoVetor(v, index()));
		v = insereElementoVetor(v, index());
		v = substituiImparPorZero(v);
		maiorElemento(v);
		menorElemento(v);
		imprimeVetor(v);
	}
	
	public static int tamanho() {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("TAMANHO");
		System.out.println("Diga o tamanho do vetor");
		n = sc.nextInt();
		
		return n;
	}
	
	public static int[] criaVetor(int t) {
		System.out.println("CRIA_VETOR");
		Scanner sc = new Scanner(System.in);
		int v[] = new int[t];
		
		for(int i=0; i<v.length;i++) {
			System.out.printf("Vetor[%d]: \n", i);
			v[i] = sc.nextInt();
		}
		return v;
	}
	
	public static void somatorio(int[] v) {
		System.out.println("SOMATORIO");
		int soma = 0;
		for(int i=0;i<v.length;i++) {
			soma += v[i];
		}
		System.out.println("Somatorio: "+soma);
	}
	
	public static void media(int[] v) {
		System.out.println("MEDIA");
		int soma = 0;
		for(int i=0;i<v.length;i++) {
			soma += v[i];
		}
		System.out.println("Media: "+(soma/v.length));
	}
	
	//não criei sistema de segurança
	public static int index() {
		System.out.println("INDEX");
		Scanner sc = new Scanner(System.in);
		int index;
		
		System.out.println("Qual index deseja conferir? ");
		index = sc.nextInt();
		
		return index;
	}
	
	public static int obtemElementoVetor(int[] v, int i) {
		System.out.println("OBTEM_ELEMENTO_VETOR");
		return v[i];
	}
	
	public static int[] insereElementoVetor(int[] v, int n) {
		System.out.println("INSERE_ELEMENTO_VETOR");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o novo valor: ");
		v[n] = sc.nextInt();
		
		return v;
	}
	
	public static int[] substituiImparPorZero(int[] v) {
		for(int i=0;i<v.length;i++) {
			if(v[i]%2!=0) {
				v[i] = 0;
			}
		}
		return v;
	}
	
	public static void maiorElemento(int[] v) {
		int maior = v[0];
		for(int i=0; i<v.length; i++) {
			if(v[i]>maior) {
				maior = v[i];
			}
		}
		System.out.println("O maior elemento é: "+maior);
	}
	
	public static void menorElemento(int[] v) {
		int menor = v[0];
		for(int i=0; i<v.length; i++) {
			if(v[i]<menor) {
				menor = v[i];
			}
		}
		System.out.println("O maior elemento é: "+menor);
	}
	
	public static void imprimeVetor(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.printf("Vetor[%d]: %d\n", i, v[i]);
		}
	}
}
/*
Exercí­cios de Vetores

i. Uma função imprimeVetor() que exibe todos os elementos do vetor;


 */











