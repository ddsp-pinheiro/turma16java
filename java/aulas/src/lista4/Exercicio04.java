package lista4;

import java.util.Scanner;

public class Exercicio04 
{

	public static void main(String[] args)
	{
		/*Crie um programa que receba valores do usuário para preencher
		 * uma matriz 3X3, e em seguida, exiba a soma dos valores dela
		 * e a soma dos valores da primeira diagonal, ou seja, diagonal
		 * principal
		 * 
		 */
		
		Scanner ler = new Scanner(System.in);
		int m[][]=new int[3][3];
		int soma=0, somaD=0;
		
		for(int x=0;x<3;x++)
		{
			for (int y=0 ;y < 3; y++)
			{
				System.out.println("Insira um valor: ");
				m[x][y] = ler.nextInt();
				soma+=m[x][y];
				if(x==y)
				{
					somaD+=m[x][y];
				}
			}
				
		}
		for(int x=0;x<3;x++)
		{
			for (int y=0 ;y < 3; y++)
			{
				System.out.println("Seus valores "+(m[x][y]));
			}
		}
		System.out.println("Soma: "+soma);
		System.out.println("Soma Diagonal: "+somaD);
	}
}
