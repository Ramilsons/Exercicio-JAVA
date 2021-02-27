package exerciciosRepeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 * */

public class MediaNumerosMultiplos3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numero = 0, qnt = 0, soma = 0;
		
		System.out.println("Digite o numero desejado");
		numero = ler.nextDouble();
		
		do{
				if(numero % 3 == 0) {
					qnt++;
					soma+=numero;
				}
				System.out.println("Digite o numero desejado");
				numero = ler.nextInt();
			
		}while(numero != 0);
		
		System.out.println("A média dos múltiplos de 3 é: "+ (soma/qnt));

	}

}
