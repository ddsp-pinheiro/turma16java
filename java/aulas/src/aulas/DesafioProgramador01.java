package aulas;

import java.util.Scanner;

public class DesafioProgramador01 
{
	public static void main(String[] args) 
	{
		
		int numero;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if(numero<0)
		{
			System.out.println("Esse nuero � negativo n�o � posivel prosseguir.");
		}
		else if (numero%2 == 0)
		{
			System.out.println("Seu numero � par!!!");
		}
		else if (numero == 0)
		{
			System.out.println("Zero � um numero nulo!!!");
		}
		else
		{
			System.out.println("O numero digitado � impar!!!");
		}
		
	}
}
