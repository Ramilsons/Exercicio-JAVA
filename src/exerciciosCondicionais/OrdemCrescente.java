package exerciciosCondicionais;
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		ler.close();
		
		if(num1 > num2 && num1 > num3) {
			System.out.printf("O primeiro n�mero(%d)� maior que os demais", num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.printf("O segundo n�mero(%d)� maior que os demais", num2);
		}
		else if(num3 > num1 && num3 > num2) {
			System.out.printf("O terceiro n�mero(%d)� maior que os demais", num3);
		}
		else {
			System.out.printf("H� n�meros iguais");
		}
	}
}
