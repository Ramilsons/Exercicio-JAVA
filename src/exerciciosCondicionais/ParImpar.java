package exerciciosCondicionais;

import java.util.Scanner;
/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 * */
public class ParImpar {
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int numero;
			
			System.out.print("Digite o número desejado: ");
			numero = ler.nextInt();
			ler.close();
			
			
			if(numero%2 == 0) {
				System.out.printf("O número %d é par", numero);
				System.out.println("\nA raíz quadrada desse número é: "+ (Math.sqrt(numero)));
			}else {
				System.out.printf("O número %d é ímpar", numero);
				System.out.println("\nEsse número elevado ao quadrado é: "+ (numero*numero));
			}
	}
}
