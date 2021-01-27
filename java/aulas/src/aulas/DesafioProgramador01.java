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
			System.out.println("Esse nuero é negativo não é posivel prosseguir.");
		}
		else if (numero%2 == 0)
		{
			System.out.println("Seu numero é par!!!");
		}
		else if (numero == 0)
		{
			System.out.println("Zero é um numero nulo!!!");
		}
		else
		{
			System.out.println("O numero digitado é impar!!!");
		}
		
	}
}
