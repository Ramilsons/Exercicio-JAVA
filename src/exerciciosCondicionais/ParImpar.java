package exerciciosCondicionais;

import java.util.Scanner;
/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 * */
public class ParImpar {
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int numero;
			
			System.out.print("Digite o n�mero desejado: ");
			numero = ler.nextInt();
			ler.close();
			
			
			if(numero%2 == 0) {
				System.out.printf("O n�mero %d � par", numero);
				System.out.println("\nA ra�z quadrada desse n�mero �: "+ (Math.sqrt(numero)));
			}else {
				System.out.printf("O n�mero %d � �mpar", numero);
				System.out.println("\nEsse n�mero elevado ao quadrado �: "+ (numero*numero));
			}
	}
}
