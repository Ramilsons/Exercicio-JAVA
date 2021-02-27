package exerciciosRepeticao;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 * */


public class IdadePessoas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, menos = 0, mais = 0;
		
		while(idade != -99) {
			
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			
			if(idade < 21) {
				menos++;
				
			}else if(idade > 50){
				mais++;
				
			}

		}
		System.out.println("Pessoas com menos de 21 anos: " +(menos-1));
		System.out.println("Pessoas com mais de 50 anos: " +mais);
	}
}
