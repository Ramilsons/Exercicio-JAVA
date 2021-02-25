package exerciciosCondicionais;

import java.util.Scanner;

//OBJETIVO
/*
 * 6) Elabore um sistema que dada a idade de um nadador 
 * classifique-o em uma das seguintes categorias:
    Infantil A = 5 a 7 anos
    Infantil B = 8 a 11 anos
    Juvenil A = 12 a 13 anos
    Juvenil B = 14 a 17 anos
    Adultos = Maiores de 18 anos
 */
public class CategoriaNadadores {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idadeNadador;

		System.out.println("Digite a idade do nadador: ");
		idadeNadador = ler.nextInt();
		ler.close();

		if (idadeNadador < 5)
		{
			System.out.println("Infelizmente não podemos atender!");
		} else if (idadeNadador >= 5 && idadeNadador <= 7) {
			System.out.println("Infantil A = 5 a 7 anos");
		} else if (idadeNadador >= 8 && idadeNadador <= 11) {
			System.out.println("Infantil B = 8 a 11 anos");
		} else if (idadeNadador >= 12 && idadeNadador <= 13) {
			System.out.println("Juvenil A = 12 a 13 anos");
		} else if (idadeNadador >= 14 && idadeNadador <= 17) {
			System.out.println("Juvenil B = 14 a 17 anos");
		} else {
			System.out.println("Adultos = Maiores de 18 anos");
		}
	}
}
