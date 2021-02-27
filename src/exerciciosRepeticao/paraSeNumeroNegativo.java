package exerciciosRepeticao;

import java.util.Scanner;

public class paraSeNumeroNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, maior = 0;
		
		do {
			
			System.out.print("Digite o numero desejado, se ele for menor que 0 iremos encerrar: ");
			numero = ler.nextInt();
			
			if(numero>maior) {
				maior = numero;
			}
			
			
		}while(numero >= 0);
		
		System.out.printf("%d é o maior número...", maior);
		
		

	}

}