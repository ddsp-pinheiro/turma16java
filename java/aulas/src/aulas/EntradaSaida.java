package aulas;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a,b, soma;
		
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = ler.nextInt();
		
		soma=a+b;
		
		System.out.println("O resultado da soma é "+soma );
	}
}
