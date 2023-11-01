//Exercicio feito em aula para entrega de atividade
package Aula04;

import java.util.Scanner;

public class Entregar {
	public static void main(String[]args) {
		System.out.println("Lista de exercicios: \n=========================");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Digite o id do produto: ");
		int id = s.nextInt();
		
		switch(id) {
		case 1:
			System.out.println("Alimento não perecivel.");
			break;
		case 2:	case 3:	case 4:
			System.out.println("Alimento perecivel");
			break;
		case 5:	case 6:
			System.out.println("Vestuario");
			break;
		case 7:
			System.out.println("Higiene pessoal");
			break;
		case 8:	case 9:	case 10: case 11: case 12: case 13: case 14: case 15:
			System.out.println("Limpesa e utencilios domesticos");
			break;
		default:
				System.out.println("Codigo invalido.");
		}
		
		System.out.println("=========================");
		
		System.out.println("Digite suas notas: ");
		double n1 = s.nextDouble();
		double n2 = s.nextDouble();
		double media = (n1+n2)/2;
		
		//não vi nescessidade de utilizar switch case aqui
		if(media<=10 && media>=7.1) {
			System.out.println("Aprovado, sua media é: "+media);
		}else if(media<=7 && media>=4.1) {
			System.out.println("Exame, sua media é: "+media);
		}else {
			System.out.println("Reprovado, sua media é: "+media);
		}
		System.out.println("=========================");
		
		System.out.println("Digite dois numeros: ");
		double v1 = s.nextDouble();
		double v2 = s.nextDouble();
		
		System.out.println("Oque devemos fazer com estes numeros? \n");//eu poderia usar o \n mas decidi utilizar varios 'println'
		System.out.println("1 - Média entre os números digitados");
		System.out.println("2 – Diferença entre os números");
		System.out.println("3 – Produtos entre os números digitados");
		System.out.println("4 – Divisão do primeiro pelo segundo");
		
		int escolha = s.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("\nA media é: "+(v1+v2)/2);
			break;
		case 2:
			System.out.printf("\nA diferença entre %.1f e %.1f é: %.1f\n", v1, v2, v1-v2);
			System.out.printf("A diferença entre %.1f e %.1f é: %.1f\n", v2, v1, v2-v1);
			break;
		case 3:
			System.out.printf("\nO produo entre ambos é: %.1f\n", v1*v2);
			break;
		case 4:
			System.out.printf("\n%.1f dividido por %.1f é: %.1f\n", v1, v2, v1/v2);
			break;
		default:
			System.out.println("\nCodigo invalido.");
		}
		System.out.println("=========================");
		
		
		System.out.println("Digite o codigo do produto: \nDigite a quantia consumida: ");
		int cod = s.nextInt();
		int quant = s.nextInt();
		
		
		switch(cod) {
		case 100:
			System.out.println("A conta ficou em "+1.7*quant);
			break;
		case 101:
			System.out.println("A conta ficou em "+2.3*quant);
			break;
		case 102:
			System.out.println("A conta ficou em "+2.6*quant);
			break;
		case 104:
			System.out.println("A conta ficou em "+2.5*quant);
			break;
		case 105:
			System.out.println("A conta ficou em "+1*quant);
			break;
		default:
			System.out.println("Codigo invalido");
			break;
		}
	}
}