package exerciciosRepeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
número de pessoas calmas;
número de mulheres nervosas;
número de homens agressivos;
número de outros calmos;
número de pessoas nervosas com mais de 40 anos;
calmas menos 18;
 * 
 * */


public class PesquisaPessoas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char sexo, humor;
		int i = 1,calmas=0, calmosO= 0, calmosMenos18 = 0,nervosasM=0, agressivosH = 0, nervososMais40 = 0, idade = 0;

		while(i<=3) {
			System.out.print("Digite a idade da pessoa: ");
			idade = ler.nextInt();
			
			System.out.print("Digite o sexo da pessoa (1-feminino / 2-masculino / 3-Outros): ");
			sexo = ler.next().charAt(0);
			
			
			System.out.println("1 - CALMA");
			System.out.println("2 - NERVOSA");
			System.out.println("3 - AGRESSIVA");
			System.out.println("Digite o valor que representa o humor da pessoa: ");
			humor = ler.next().charAt(0);
			
			if(humor == '1') {
				calmas++;
			}
			
			if(sexo == '1' && humor == '2') {
				nervosasM++;
			}
			
			else if(sexo == '2' && humor == '3') {
				agressivosH++;
			}
			
			else if(sexo == '3' && humor == '1') {
				calmosO++;
			}
			
			if(humor == '2' && idade > 40) {
				nervososMais40++;
			}
			
			if(humor == '1' && idade < 18) {
				calmosMenos18++;
			}
			
			i++;
		}
		

		System.out.println("Pessoa calmas: "+calmas);
		System.out.println("Mulheres nervosas calmas: "+nervosasM);
		System.out.println("Homens agressivos calmas: "+agressivosH);
		System.out.println("Outros calmos: "+calmosO);
		System.out.println("Pessoa com mais de 40 nervoso: "+nervososMais40);
		System.out.println("Pessoa calma com 18 anos ou menos: "+calmosMenos18);
	}
}
