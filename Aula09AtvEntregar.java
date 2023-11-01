package Aula09;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author fernando.lalmeida
 */
public class Exemplo1 {
    
    public static int tamanho(){
        System.out.println("*- TAMANHO -*");
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int t = input.nextInt();
        return t;
    }
    
    public static int[] criarVetor(int t){
        System.out.println("*- CRIAR um VETOR -*");
        int[] vetor = new int[t];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<t; i++){
            System.out.printf("vetor[%d]:\n", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
    public static void imprimir(int[] vetor){
        System.out.println("*- IMPRIMIR -*");
        for(int i=0; i<vetor.length; i++){
            System.out.printf("vetor[%d]: %d\n", i, vetor[i]);
        }
    }
    
    
    /**
     * TO DO
     * 1) Função para imprimir os numeros pares
     * 2) Função para imprimir os numeros Impares
     * 3) Função separar em um vetor os numeros pares
     * 4) Função separar em um vetor os numeros Impares
     * 5) Função para verificar ocorrencia de um determinado numero
     * 6) Função para obter um numero
     * 7) Função para verificar quantas vezes ele aparece no vetor
     */
    
    
    public static void main(String[] args) {
       int t = tamanho();
       int[] vetor = criarVetor(t);
       imprimir(vetor);
     }
}