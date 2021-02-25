import java.util.Scanner;

public class UsandoScanner {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		int a, b;
	
		
		System.out.println("Digite o numero desejado: ");
		a = ler.nextInt();
				
		System.out.println("Digite mais um numero desejado: ");		
		b = ler.nextInt();
		
		System.out.println("A soma é: "+(a+b)+" !!");
	}
}
