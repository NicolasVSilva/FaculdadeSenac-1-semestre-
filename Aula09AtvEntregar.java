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
    
    public static void imprimir(int[] vetor, int[] pares, int[] impares){
        System.out.println("*- IMPRIMIR -*");
        for(int i=0; i<vetor.length; i++){
            System.out.printf("vetor[%d]: %d\n", i, vetor[i]);
        }
        for(int i=0; i<pares.length; i++){
            System.out.printf("vetor[%d]: %d\n", i, pares[i]);
        }
        for(int i=0; i<impares.length; i++){
            System.out.printf("vetor[%d]: %d\n", i, impares[i]);
        }
    }

    /**
     * TO DO
     * 1) Função para imprimir os numeros pares
     * 2) Função para imprimir os numeros Impares
     * 3) Função separar em um vetor os numeros pares
     * 4) Função separar em um vetor os numeros Impares
     * 5) Função para verificar ocorrencia de um determinado numero
     * 6) Função para obter um numero atrávez do index
     * 7) Função para verificar quantas vezes ele aparece no vetor
     */

    //A partir daqui começo minha lição
    //Primeiro vou fazer a separação da quantidade de pares e impares, para depois criar um vetor e adicionar os valores(exercicios "1, 2, 3 e 4")
    public static int[] vetorPar(int[] vetor){
        System.out.println("*- VETORPAR -*");
        int par = 0, id = 0;
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i]%2==0){
                par++;
            }
        }
        int[] pares = new int[par];
        pares = criar(par, vetor, id);
        return pares;
    }
    public static int[] vetorImpar(int[] vetor){
        System.out.println("*- VETORIMPAR -*");
        int impar = 0, id = 1;
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i]%2!=0){
                impar++;
            }
        }
        int[] impares = new int[impar];
        impares = criar(par, vetor, id);
        return impares;
    }
    public static int[] criar(int t, int[] vetor,int id){
        System.out.println("*- CRIAR -*");
        if(id == 0){
            int [] pares = new int[t];
            int e = 0;
            for(int i = 0; i<vetor.length; i++){
                if(vetor[i]%2==0){
                    pares[e] = vetor[i];
                    e++;
                }
            }
            return pares;
        }else{
            int [] impares = new int[t];
            int e = 0;
            for(int i = 0; i<vetor.length; i++){
                if(vetor[i]%2!=0){
                    impares[e] = vetor[i];
                    e++;
                }
            }
            return imapres;
        }
    }

    //Aqui pedimos um valor e em seguida verificamos se o mesmo está contido no vetor(Exercicio "5")
    public static void ocorrencia(int[] vetor){
        Scanner input = new Scanner(System.in);
        int ocorre, positivo;
        System.out.println("Qual numero deseja conferir?");
        ocorre = input.nextInt();
        positivo = verifica(ocorre, vetor);
        if(positivo!=0){
            System.out.printf("O numero '%d' está contido no vetor", ocorre);
        }else{
            System.out.printf("O numero '%d' não está contido no vetor", ocorre);
        }
    }
    public static int verifica(int ocorre, int[] vetor){
        int positivo = 0;
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i]==ocorre){
                positivo++;
            }
        }
        return positivo;
    }

    //Agora vamos verificar o numero de acordo com seu index e na sequencia quantas vezes ele aparece(Exercicios "6 e 7")
    public static void index(int[] vetor){
        Scanner input = new Scanner(System.in);
        int index, positivo;
        System.out.println("Qual index deseja conferir?");
        index = input.nextInt();
        positivo = verifica(index, vetor);
        System.out.printf("O valor 'vetor[%d]: %d' aparece %d vezes", index, vetor[index], positivo);
    }
    
    //Só organizar tudo no 'main' e está pronto
    public static void main(String[] args) {
       int t = tamanho();
       int[] vetor = criarVetor(t);
       int[] pares = vetorPar(vetor);
       int[] impares = vetorImpar(vetor);
       ocorrencia(vetor);
       index(vetor);
       imprimir(vetor, pares, impares);
     }
}
