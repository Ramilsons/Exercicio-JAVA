package exerciciosRepeticao;

import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 * */

public class QuantidadeParesImpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, qntPares = 0, qntImpares = 0;
		
		for(int i = 0; i<10; i++) {
			System.out.print("Digite o número desejado: ");
			
			numero = ler.nextInt();
			if(numero%2 == 0) {
				qntPares++;
			}else {
				qntImpares++;
			}
		}
		System.out.println("Total de números PARES: "+qntPares);
		System.out.println("Total de números IMPARES: "+qntImpares);
	}

}
