package aulas;

import java.util.Scanner;

public class Lista2Exercicio1 
{
	public static void main(String[] args) 
	{
		int n1, n2,n3;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\t\t\t\t\t IDENTIFICANDO O MAIOR NUMERO \nDigite seu primeiro numero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite seu segundo numero: ");
		n2 = ler.nextInt();
		
		System.out.println("Por ultimo digite seu terceiro numero: ");
		n3 = ler.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" é seu maior numero.");
		}
		else if(n1<n2 && n3<n2)
		{
			System.out.println(n2+" é seu maior numero.");
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println(n3+" é seu maior numero.");
		}
		else if (n1==0 && n2==0 && n3==0)
		{
			System.out.println("Todos os nuemros são zero.");
		}
		else if (n1==n2 && n2==n3)
		{
			System.out.println("Todos os numeros são iguais");
		}
	}
}
