package exerciciosCondicionais;

import java.util.Scanner;

/*Faça um programa que entre com três números e coloque em ordem crescente.. */
public class MaiorNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		ler.close();
		
		if(num1 > num2 && num1 > num3) {
			if(num2>num3) {
				System.out.printf("%d - %d - %d", num3, num2,num1);
			}else {
				System.out.printf("%d - % d - %d",  num2, num3, num1);
			}
			
		}
		else if(num2 > num1 && num2 > num3) {
			if(num1>num3) {
				System.out.printf("%d - %d - %d", num3, num1,num2);
			}else {
				System.out.printf("%d - % d - %d",  num1, num3, num2);
			}
		}
		else if(num3 > num2 && num3 > num1) {
			if(num2>num1) {
				System.out.printf("%d - %d - %d", num1, num2,num3);
			}else {
				System.out.printf("%d - % d - %d",  num2, num1, num3);
			}
		}
		else System.out.println("Há valores iguais");
		

	}

}
