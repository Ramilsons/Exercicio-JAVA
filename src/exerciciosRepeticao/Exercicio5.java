package exerciciosRepeticao;

import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 * */


public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, soma=0;
		
		System.out.println("Digite o numero desejado");
		numero = ler.nextInt();
		
		do{
				soma+=numero;
				System.out.println("Digite o numero desejado");
				numero = ler.nextInt();
			
		}while(numero != 0);
		
		System.out.println("A soma �: "+soma);
	}

}
