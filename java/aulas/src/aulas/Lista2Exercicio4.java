package aulas;

import java.util.Scanner;

public class Lista2Exercicio4 
{
	public static void main(String[] args) 
	{
		int numero;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		
		if (numero%2 == 0)
		{
			System.out.println("Seu numero é par, a raiz quadrada de "+numero+" é "+(Math.sqrt(numero))+".");
		}
		else
		{
			System.out.println("O numero digitado é impar, "+numero+" elevado ao quadrado é "+(Math.pow(numero, 2))+".");
		}
	}
}
