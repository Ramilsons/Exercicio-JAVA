package exerciciosRepeticao;

import java.util.Scanner;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 * */

public class QuantidadeParesImpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, qntPares = 0, qntImpares = 0;
		
		for(int i = 0; i<10; i++) {
			System.out.print("Digite o n�mero desejado: ");
			
			numero = ler.nextInt();
			if(numero%2 == 0) {
				qntPares++;
			}else {
				qntImpares++;
			}
		}
		System.out.println("Total de n�meros PARES: "+qntPares);
		System.out.println("Total de n�meros IMPARES: "+qntImpares);
	}

}
